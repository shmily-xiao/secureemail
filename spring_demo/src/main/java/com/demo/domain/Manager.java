package com.demo.domain;

/**
 * Created by simpletour_Jenkin on 2016/3/24.
 */
public class Manager extends Employee {

    private Employee secretary;

    public Manager(){}


    public Manager(String name, Integer money, Integer year, Integer month, Integer day) {
        super(name, money, year, month, day);
    }

    public Employee getSecretary() {
        return secretary;
    }

    public void setSecretary(Employee secretary) {
        this.secretary = secretary;
    }

    public void raiseSalary(Integer raiseMoney){
        this.secretary.money = secretary.money + raiseMoney;
    }
}
