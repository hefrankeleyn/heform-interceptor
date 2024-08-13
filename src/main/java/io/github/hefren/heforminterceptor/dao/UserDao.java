package io.github.hefren.heforminterceptor.dao;

import io.github.hefren.heforminterceptor.beans.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserDao {

    User find(@Param("id") Integer id);
    User find02(@Param("id") Integer id, @Param("name") String name);
    List<User> list();
}
