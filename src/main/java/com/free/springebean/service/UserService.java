package com.free.springebean.service;

import com.free.springebean.dto.UserDto;
import com.free.springebean.entity.user.User;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * 描述
 *
 * @author zhaolongfei007
 * @date 2024/9/25 17:07
 */
@Service
public class UserService {

    public UserDto findById(Long id) {

        Optional<User> userOptional = User.finder.findById(id);
        if (userOptional.isEmpty()) {
            throw new RuntimeException("用户不存在");
        }

        User user = userOptional.get();
        return UserDto.builder()
                .name(user.getName())
                .age(user.getAge())
                .gender(user.getGender())
                .build();
    }

    public void createUser(UserDto userDto) {
        User user = new User();
        user.setName(userDto.getName());
        user.setAge(userDto.getAge());
        user.setGender(userDto.getGender());

        user.save();
    }
}
