package com.ek.ws.interceptor.checkuser;

import java.util.List;

import javax.xml.namespace.QName;
import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.helpers.DOMUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * 客户端拦截器(在XML片段中往头部里加)
 * 
 * @ClassName: CheckUserInterceptor
 * @Description: TODO
 * @author: ek
 * @date: 2018年1月31日 上午2:09:15
 */
/*   
<head> 
  头部里要加的就是这个
  <ekstudio>
    <name>homer</name>
    <password>111</password>
  </ekstudio>
  (可以加多个)
  <ekstudio1>
    <name>homer</name>
    <password>111</password>
  </ekstudio1>
</head>
*/

public class CheckUserInterceptor extends AbstractPhaseInterceptor<SoapMessage> {

  private String username;
  private String password;

  public CheckUserInterceptor(String username, String password) {
    super(Phase.PRE_PROTOCOL);// 准备协议化时拦截
    this.username = username;
    this.password = password;
  }

  @Override
  public void handleMessage(SoapMessage msg) throws Fault {
    

    // 创建Document对象
    Document document = DOMUtils.createDocument();
    Element rootEle = document.createElement("ekstudio");
    // 创建标签
    Element nameEle = document.createElement("name");
    nameEle.setTextContent(username);
    Element passwordEle = document.createElement("password");
    passwordEle.setTextContent(password);
    rootEle.appendChild(nameEle);
    rootEle.appendChild(passwordEle);

    List<Header> headers = msg.getHeaders(); // 获得头
    headers.add(new Header(new QName("ekstudio"), rootEle)); // 把标签加到头里
  }

}
