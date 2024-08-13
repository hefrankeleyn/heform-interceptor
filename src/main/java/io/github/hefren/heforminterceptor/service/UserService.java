package io.github.hefren.heforminterceptor.service;

import io.github.hefren.heforminterceptor.beans.User;

import java.util.List;

/**
 * @Date 2024/8/12
 * @Author lifei
 */
public interface UserService {
    User find(Integer id);
    User find02(Integer id, String name);
    List<User> list();
}
