package com.demo.domain;

/**
 * Created by simpletour_java on 2015/9/8.
 */
public class Person {
    private String id;
    private String name;
    private String password;

    // =================test start ====================

    static class PackagePrivate{}
    public static PackagePrivate member = new com.demo.domain.Person.PackagePrivate();

    // =================test end ====================
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
