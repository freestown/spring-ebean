package com.free.springebean.controller;

import com.free.springebean.client.UserClient;
import com.free.springebean.dto.UserDto;
import com.free.springebean.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述
 *
 * @author zhaolongfei007
 * @date 2024/9/25 17:29
 */
@RestController
public class UserController implements UserClient {

    @Resource
    private UserService userService;

    public UserDto findById(Long id) {
        return userService.findById(id);
    }

    public void createUser(UserDto userDto) {
        userService.createUser(userDto);
    }
}
