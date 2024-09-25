package com.free.springebean.entity.emum;

import lombok.Getter;

/**
 * 描述
 *
 * @author zhaolongfei007
 * @date 2024/9/25 16:35
 */
@Getter
public enum Gender {

    MAN(1, "男"),

    WOMAN(2, "女");

    private Integer code;

    private String desc;

    Gender(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
