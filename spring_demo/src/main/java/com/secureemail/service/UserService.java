package com.secureemail.service;

import com.secureemail.domain.User;
import com.secureemail.query.UserQuery;

import java.util.Optional;

/**
 * Created by simpletour_Jenkin on 2015/11/9.
 * 用户
 */
public interface UserService {
    /**
     * 查找用户
     * @param user
     * @return
     */
    public Optional<User> find(UserQuery user);

    /**
     * 更新用户信息
     * @param user
     * @return
     */
    public int update(UserQuery user);

    /**
     * 添加用户信息
     * @param user
     * @return
     */
    public int insert(User user);

    /**
     * 删除某一个用户
     * @param user
     * @return
     */
    public int delete(UserQuery user);
}
