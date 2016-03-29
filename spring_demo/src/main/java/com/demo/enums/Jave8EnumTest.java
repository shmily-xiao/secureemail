package com.demo.enums;

import com.demo.domain.Info;

/**
 * Created by simpletour_Jenkin on 2016/3/16.
 */
public enum Jave8EnumTest {
    cat("猫"),
    dog("狗"),
    pig("猪");

    private String name;
    private Info info;
//    private String value;

//    Jave8EnumTest(String name, String value){
//        this.name = name;
//        this.value = value;
//    }

    Jave8EnumTest(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public String getValue() {
//        return value;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }
}
