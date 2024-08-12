package io.github.hefren.heforminterceptor.beans;

import com.google.common.base.MoreObjects;

/**
 * @Date 2024/8/12
 * @Author lifei
 */
public class User {
    private Integer id;
    private String name;
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(User.class)
                .add("id", id)
                .add("name", name)
                .add("age", age)
                .toString();
    }
}
