package com.free.springebean.entity.user;

import com.free.springebean.entity.BaseDomain;
import com.free.springebean.finder.user.UserFinder;
import jakarta.persistence.Entity;

/**
 * 描述
 *
 * @author zhaolongfei007
 * @date 2024/9/25 16:32
 */
@Entity
public class User extends BaseDomain {

    public static final UserFinder finder = new UserFinder();

    /**
     * 用户名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 性别
     * @see com.free.springebean.entity.emum.Gender
     */
    private Integer gender;

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

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }
}
