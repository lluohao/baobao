package com.llhao.baobao.web.controller;

import com.llhao.baobao.entity.User;
import com.llhao.baobao.service.UserService;
import com.llhao.baobao.web.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;

/**
 * Created by HAO zong on 2017-4-13.
 */
@Controller
public class  UserController{
    @Autowired
    private UserService service;

    @RequestMapping("/login")
    public @ResponseBody UserVo login(@RequestParam String name, @RequestParam String password,HttpSession session){
        User user = service.login(name,password);
        if(user!=null){
            session.setAttribute("user",user);
        }
        return new UserVo(user);
    }
}
