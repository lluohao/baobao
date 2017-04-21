package com.llhao.baobao.dao;

import com.llhao.baobao.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Created by luohao on 2017-4-16.
 */
@Repository
public abstract class IUserDao {
    public abstract User findUserById(int id);
    public abstract User findUserByName(String name);
}
