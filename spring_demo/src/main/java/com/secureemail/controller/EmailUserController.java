package com.secureemail.controller;

import com.secureemail.domain.User;
import com.secureemail.query.UserQuery;
import com.secureemail.security.Md5;
import com.secureemail.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Optional;

/**
 * Created by simpletour_Jenkin on 2015/11/9.
 */
@Controller
public class EmailUserController {

    private final static String POSTFIX = "@xiao.com";
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/web/front/login",method = RequestMethod.GET)
    public String login(){
        return "/email/front/login";
    }

    @RequestMapping(value = "/web/front/login",method = RequestMethod.POST)
    public String login(Model model,UserQuery user,HttpServletRequest request){
        HttpSession session = request.getSession();
        String code = (String)session.getAttribute("code");
        if (code==null || code.isEmpty() || !code.equalsIgnoreCase(user.getCode())){
            model.addAttribute("loginError","用户名或密码错误");
            return "email/front/login";
        }
        Optional<User> userTemp = userService.find(user);
        String tempPassword = Md5.messageDigest(user.getPassword() + userTemp.get().getSalt());
        if (tempPassword.equalsIgnoreCase(userTemp.get().getUserPw())){
            session.setAttribute("userName",userTemp.get().getUserName());
            session.setAttribute("userId",userTemp.get().getUserId());
            //todo
            return "";
        }
        model.addAttribute("loginError","用户名或密码错误");
        return "email/front/login";
    }

    @RequestMapping(value = "/web/front/register",method = RequestMethod.GET)
    public String register(){
        return "/email/front/register";
    }

    @RequestMapping(value = "web/front/register",method = RequestMethod.POST)
    public String register(Model model,UserQuery user,HttpServletRequest request){
        HttpSession session = request.getSession();
        if (user.getUserId().length()<9){
            return "redirect:/email/front/register";
        }
        String emailPostfix = user.getUserId().substring(user.getUserId().length()-9,user.getUserId().length());
        if (!POSTFIX.equalsIgnoreCase(emailPostfix)){
            model.addAttribute("registerError","非法的网关后缀！");
            return "/email/front/register";
        }
        Optional<User> temp = userService.find(user);
        if (!temp.isPresent()){
            User userTemp = new User(user);
            userTemp.setSpecialRoot(false);//默认没有超级权限
            if (userService.insert(userTemp) ==0){
                model.addAttribute("registerError","未知原因，注册失败！");
                return "/email/front/register";
            }
            session.setAttribute("userName",user.getUserName());
            session.setAttribute("userId", user.getUserId());
            //todo
            return "";
        }
        model.addAttribute("registerError","用户已经注册");
        return "/email/front/register";
    }

}
