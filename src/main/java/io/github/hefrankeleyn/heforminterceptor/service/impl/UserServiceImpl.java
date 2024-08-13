package io.github.hefrankeleyn.heforminterceptor.service.impl;

import io.github.hefrankeleyn.heforminterceptor.beans.User;
import io.github.hefrankeleyn.heforminterceptor.dao.UserDao;
import io.github.hefrankeleyn.heforminterceptor.service.UserService;
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
    public User find02(Integer id, String name) {
        return userDao.find02(id, name);
    }

    @Override
    public List<User> list() {
        return userDao.list();
    }
}
