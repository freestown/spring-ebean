package com.free.springebean.service;

import com.free.springebean.dto.UserDto;
import com.free.springebean.entity.user.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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

    public void deleteUser(Long id) {
        User.finder.deleteById(id);
    }

    public void updateUser(UserDto userDto) {
        User user = new User();
        user.setId(userDto.getId());
        user.setName(userDto.getName());
        user.setAge(userDto.getAge());
        user.setGender(userDto.getGender());

        user.update();
    }

    public List<UserDto> findList() {
        List<User> all = User.finder.all();
        return all.stream().map(user -> UserDto.builder()
                .name(user.getName())
                .age(user.getAge()).build())
                .collect(Collectors.toList());
    }
}
