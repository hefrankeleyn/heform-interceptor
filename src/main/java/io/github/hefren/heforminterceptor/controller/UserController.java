package io.github.hefren.heforminterceptor.controller;

import io.github.hefren.heforminterceptor.beans.User;
import io.github.hefren.heforminterceptor.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Date 2024/8/12
 * @Author lifei
 */
@RestController
@RequestMapping(value = "/userController")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/find", method = RequestMethod.GET)
    public User find(Integer id) {
        return userService.find(id);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<User> list() {
        return userService.list();
    }
}
