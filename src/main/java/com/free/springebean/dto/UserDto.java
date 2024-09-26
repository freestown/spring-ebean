package com.free.springebean.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 描述
 *
 * @author zhaolongfei007
 * @date 2024/9/25 17:09
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private String name;

    private Integer age;

    private Integer gender;
}
