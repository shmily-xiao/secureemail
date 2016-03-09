package com.secureemail.service.impl;

import com.secureemail.dao.EmailDao;
import com.secureemail.dao.EmailModelDao;
import com.secureemail.domain.Email;
import com.secureemail.domain.EmailModel;
import com.secureemail.service.EmailService;

import javax.annotation.Resource;

/**
 * Created by simpletour_Jenkin on 2015/11/9.
 */
public class EmailServiceImpl implements EmailService{

    private EmailDao emailDao;

    private EmailModelDao emailModelDao;

    @Override
    public Email find(Email email) {
        return emailDao.find(email);
    }

    @Override
    public int update(Email email) {
        return emailDao.update(email);
    }

    @Override
    public int insert(Email email) {
        return emailDao.insert(email);
    }

    @Override
    public int delete(Email email) {
        return emailDao.delete(email);
    }

    @Override
    public EmailModel find(EmailModel email) {
        return emailModelDao.find(email);
    }

    @Override
    public int update(EmailModel email) {
        return emailModelDao.update(email);
    }

    @Override
    public int insert(EmailModel email) {
        return emailModelDao.insert(email);
    }

    @Override
    public int delete(EmailModel email) {
        return emailModelDao.delete(email);
    }

    public void setEmailDao(EmailDao emailDao) {
        this.emailDao = emailDao;
    }

    public void setEmailModelDao(EmailModelDao emailModelDao) {
        this.emailModelDao = emailModelDao;
    }
}
