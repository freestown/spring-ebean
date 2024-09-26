package com.free.springebean.entity.user;

import com.free.springebean.entity.BaseDomain;
import com.free.springebean.finder.user.UserFinder;
import jakarta.persistence.Entity;
import lombok.Data;

/**
 * 描述
 *
 * @author zhaolongfei007
 * @date 2024/9/25 16:32
 */
@Entity
@Data
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
}
