package com.free.springebean.controller;

import com.free.springebean.dto.UserDto;
import com.free.springebean.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述
 *
 * @author zhaolongfei007
 * @date 2024/9/25 17:29
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping(value = "/{id}", produces = "application/json")
    public UserDto findById(@PathVariable(name = "id") Long id) {
        return userService.findById(id);
    }

    @PostMapping(produces = "application/json")
    public void createUser(@RequestBody UserDto userDto) {
        userService.createUser(userDto);
    }
}
