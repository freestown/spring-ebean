package com.free.springebean.client;

import com.free.springebean.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 描述
 *
 * @author zhaolongfei007
 * @date 2024/11/8 18:44
 */
@FeignClient(name = "spring-ebean")
@RequestMapping("user")
public interface UserClient {
    @GetMapping(value = "/{id}", produces = "application/json")
    UserDto findById(@PathVariable(name = "id") Long id);

    @PostMapping(produces = "application/json")
    void createUser(@RequestBody UserDto userDto);
}
