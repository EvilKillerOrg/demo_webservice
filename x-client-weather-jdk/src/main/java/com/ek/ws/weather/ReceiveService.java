package com.ek.ws.weather;

import java.util.List;

import cn.com.webxml.ArrayOfString;
import cn.com.webxml.WeatherWebService;
import cn.com.webxml.WeatherWebServiceSoap;
/**
 * 这的SEI代码是用JDK生产的,不要依赖CXF包,就能获取数据了
 * @ClassName: ReceiveService
 * @Description: TODO
 * @author: ek
 * @date: 2018年1月30日 上午2:25:38
 */
public class ReceiveService {

  public static void main(String[] args) {
    WeatherWebService weatherWebService = new WeatherWebService();
    WeatherWebServiceSoap weatherWebServiceSoap = weatherWebService.getWeatherWebServiceSoap();
    ArrayOfString weatherList = weatherWebServiceSoap.getWeatherbyCityName("西安");
    List<String> list = weatherList.getString();
    System.out.println(list);
  }

}
