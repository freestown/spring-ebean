package com.free.springebean.dto;

/**
 * 描述
 *
 * @author zhaolongfei007
 * @date 2024/9/25 17:09
 */
public class UserDto {

    private String name;

    private Integer age;

    private Integer gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
