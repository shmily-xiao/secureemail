package com.secureemail.query;

/**
 * Created by simpletour_Jenkin on 2016/3/10.
 */
public class EmailModelQuery extends BaseQuery {

    //模板邮箱的id
    private long emailModelId;

    //模板邮箱的主题
    private String emailModelTheme;

    //模板邮箱的详情
    private String emailModelDetail;

    public EmailModelQuery(){}

    public EmailModelQuery(Long emailModelId){
        this.emailModelId = emailModelId;
    }

    public long getEmailModelId() {
        return emailModelId;
    }

    public void setEmailModelId(long emailModelId) {
        this.emailModelId = emailModelId;
    }

    public String getEmailModelTheme() {
        return emailModelTheme;
    }

    public void setEmailModelTheme(String emailModelTheme) {
        this.emailModelTheme = emailModelTheme;
    }

    public String getEmailModelDetail() {
        return emailModelDetail;
    }

    public void setEmailModelDetail(String emailModelDetail) {
        this.emailModelDetail = emailModelDetail;
    }
}
