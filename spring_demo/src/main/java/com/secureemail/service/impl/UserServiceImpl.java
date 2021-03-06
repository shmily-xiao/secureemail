package com.secureemail.service.impl;

import com.secureemail.dao.UserDao;
import com.secureemail.domain.User;
import com.secureemail.query.UserQuery;
import com.secureemail.service.UserService;

import java.util.List;
import java.util.Optional;

/**
 * Created by simpletour_Jenkin on 2015/11/9.
 */
public class UserServiceImpl implements UserService {


    private UserDao  userDao;

    @Override
    public Optional<User> find(UserQuery user) {
        return userDao.find(user)==null?Optional.<User>empty():Optional.of(userDao.find(user));
    }

    @Override
    public int update(User user) {
        return userDao.update(user);
    }

    @Override
    public int insert(User user) {
        return userDao.insert(user);
    }

    @Override
    public int delete(UserQuery user) {
        return userDao.delete(user);
    }

    @Override
    public List<User> list(UserQuery userQuery) {
        return userDao.list(userQuery);
    }

    @Override
    public List<User> listWithPages(UserQuery userQuery) {
        return userDao.query(userQuery);
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
