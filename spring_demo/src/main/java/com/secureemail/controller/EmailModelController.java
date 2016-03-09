package com.secureemail.controller;

import com.secureemail.domain.EmailModel;
import com.secureemail.service.EmailService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by simpletour_Jenkin on 2015/11/9.
 *
 * 模板邮件
 */
@Controller
public class EmailModelController {

    @Resource
    private EmailService emailService;

    @RequestMapping(value ="/security/email/model/detail/{id}")
    public String detail(@PathVariable Long id, Model model){

        EmailModel emailModel = emailService.find(new EmailModel(id));
        model.addAttribute("emailModel",emailModel);
        return "email/model/detail";
    }

    @RequestMapping(value = "/security/email/model/list")
    public String list(Model model){
        return null;
    }

}
