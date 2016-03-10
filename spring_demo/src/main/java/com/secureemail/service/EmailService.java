package com.secureemail.service;

import com.secureemail.domain.Email;
import com.secureemail.domain.EmailModel;
import com.secureemail.query.EmailModelQuery;
import com.secureemail.query.EmailQuery;

import java.util.List;

/**
 * Created by simpletour_Jenkin on 2015/11/9.
 * 邮箱的service
 */
public interface EmailService {

    /**
     * 查找用户所发送的邮件
     * @param email
     * @return
     */
    Email find(EmailQuery email);

    /**
     * 更新邮件的信息
     * @param email
     * @return
     */
    int update(Email email);

    /**
     * 发送一封邮件
     * @param email
     * @return
     */
    int insert(Email email);

    /**
     * 删除某一封邮件
     * @param email
     * @return
     */
    int delete(EmailQuery email);

    /**
     *  分页查询列表
     * @param emailQuery
     * @return
     */
    List<Email> listWithPages(EmailQuery emailQuery);

    /**
     * 查询列表不分页
     * @param emailQuery
     * @return
     */
    List<Email> list(EmailQuery emailQuery);

    /**
     * 查找超级用户所制作的模板邮件
     * @param emailModel
     * @return
     */
    EmailModel find(EmailModelQuery emailModel);

    /**
     * 更新邮件的信息
     * @param emailModel
     * @return
     */
    int update(EmailModel emailModel);

    /**
     * 发送一封邮件
     * @param emailModel
     * @return
     */
    int insert(EmailModel emailModel);

    /**
     * 删除某一封邮件
     * @param emailModel
     * @return
     */
    int delete(EmailModelQuery emailModel);

    /**
     *  分页查询列表
     * @param emailModelQuery
     * @return
     */
    List<EmailModel> listWithPages(EmailModelQuery emailModelQuery);

    /**
     * 查询列表不分页
     * @param emailModelQuery
     * @return
     */
    List<EmailModel> list(EmailModelQuery emailModelQuery);

}
