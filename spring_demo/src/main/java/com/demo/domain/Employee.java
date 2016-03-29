package com.demo.domain;

import java.io.Serializable;

/**
 * Created by simpletour_Jenkin on 2016/3/24.
 */
public class Employee implements Serializable{
    static String testStatic= "one";
    public String name;
    public Integer money;
    public Integer year;
    public Integer month;
    public Integer day;
    public Employee(){}

    public Employee(String name, Integer money, Integer year, Integer month, Integer day) {
        this.name = name;
        this.money = money;
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public static String getTestStatic() {
        return testStatic;
    }

    public static void setTestStatic(String testStatic) {
        Employee.testStatic = testStatic;
    }

    public void raiseSalary(Integer raiseMoney){
        this.money = money + raiseMoney;
    }
}
