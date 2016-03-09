package com.secureemail.query;


/**
 * Created by simpletour_Jenkin on 2015/11/10.
 */
public class UserQuery extends BaseQuery{
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

    //验证码
    private String code;

    public UserQuery(){}

    public UserQuery(String userId){
        this.userId = userId;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
