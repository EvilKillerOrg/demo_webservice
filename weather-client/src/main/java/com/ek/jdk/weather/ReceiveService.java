package com.ek.jdk.weather;

import java.util.List;

import cn.com.webxml.ArrayOfString;
import cn.com.webxml.WeatherWebService;
import cn.com.webxml.WeatherWebServiceSoap;

public class ReceiveService {

  public static void main(String[] args) {
    WeatherWebService weatherWebService = new WeatherWebService();
    WeatherWebServiceSoap weatherWebServiceSoap = weatherWebService.getWeatherWebServiceSoap();
    ArrayOfString weatherList = weatherWebServiceSoap.getWeatherbyCityName("西安");
    List<String> list = weatherList.getString();
    System.out.println(list);
  }

}
