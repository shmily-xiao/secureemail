package com.secureemail.domain;

import com.demo.security.Md5;
import com.secureemail.query.UserQuery;

import java.util.Random;

/**
 * Created by simpletour_Jenkin on 2015/11/7.
 * 用户的表结构
 */
public class User {
    //用户id
    private String userId;

    //用户名字
    private String userName;

    //用户密码
    private String userPw;

    //是否有特殊权限的用户
    private Boolean specialRoot;

    //salt 随机数
    private int salt;

    public User(){}

    public User(UserQuery userQuery){
        this.userId = userQuery.getUserId().substring(0,userQuery.getUserId().length()-9);
        this.userName = userQuery.getUserName();
        Random random = new Random();
        this.salt = (int)(random.nextDouble() * 10000);
        this.userPw = Md5.messageDigest(userQuery.getUserPw() + salt);
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPw() {
        return userPw;
    }

    public void setUserPw(String userPw) {
        this.userPw = userPw;
    }

    public Boolean getSpecialRoot() {
        return specialRoot;
    }

    public void setSpecialRoot(Boolean specialRoot) {
        this.specialRoot = specialRoot;
    }

    public int getSalt() {
        return salt;
    }

    public void setSalt(int salt) {
        this.salt = salt;
    }

    public static void main(String[] args){
        Random random = new Random();
        int salt =(int)(random.nextDouble()) * 10000;
        System.out.print(salt);
    }
}
