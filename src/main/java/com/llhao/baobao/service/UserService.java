package com.llhao.baobao.service;

import com.llhao.baobao.dao.IUserDao;
import com.llhao.baobao.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by HAO zong on 2017-4-16.
 */
@Service
public class UserService {
    @Autowired
    private IUserDao dao;
    public User login(String name, String password){
        User user = dao.findUserByName(name);
        if(user !=null && user.getPassword().equals(password)){
            return user;
        }
        return null;
    }
}
