package com.laiso.blogs.utils;


import com.baidu.aip.contentcensor.AipContentCensor;
import org.json.JSONObject;

public class BaiDuUtils {
    public static final String APP_ID = "11791709";
    public static final String API_KEY = "LDdFQCo83QLoHU3mqbaW3o9w";
    public static final String SECRET_KEY = "7Gg50aOK5RlPUf6aE0TQCrPzSFHhWYFI";
    public static  final AipContentCensor contentCensor=new AipContentCensor(APP_ID,API_KEY,SECRET_KEY);
    public static   JSONObject wordFilter( String s){
      return contentCensor.antiSpam(s,null);
    }
}
