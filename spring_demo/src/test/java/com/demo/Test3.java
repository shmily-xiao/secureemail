package com.demo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by simpletour_java on 2015/6/4.
 */
public class Test3 {
    public static void main(String[] args){
//        Date now = new Date();
//        Timestamp time = new Timestamp(now.getTime());
//        Date now1 = new Date(time.getTime());
//        System.out.println(now1.getTime());
//        System.out.println(now.getTime()-now1.getTime());
//        System.out.println(time.toString());
//        System.out.println(System.currentTimeMillis());
//
//        Map<String, Integer> map = new HashMap<>();
//        Integer integer = 1;
//        System.out.println(map.get("sd"));
//        System.out.println(integer.toString());
//        String[] cc =  new String[2];
//
//        cc[0] = "asda";
//        cc[1] = "gdgdfg";
//        String dd = Arrays.toString(cc);
//        System.out.println(dd);
//
//        String json = JSON.toJSONString(cc);
//        System.out.println(json);
//
//        String sd = (String)JSONArray.parse(json);
//        System.out.println(sd);


        StringBuilder remark = new StringBuilder();
        remark.append("123456789");
        System.out.println(remark.delete(remark.length()-1,remark.length()));
    }
}
