package io.github.hefren.heforminterceptor.service.impl;

import io.github.hefren.heforminterceptor.beans.User;
import io.github.hefren.heforminterceptor.dao.UserDao;
import io.github.hefren.heforminterceptor.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Date 2024/8/12
 * @Author lifei
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public User find(Integer id) {
        return userDao.find(id);
    }

    @Override
    public List<User> list() {
        return userDao.list();
    }
}
