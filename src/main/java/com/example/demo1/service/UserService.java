package com.example.demo1.service;

import com.example.demo1.entity.User;
import com.example.demo1.mapper.UserMapper;
import com.example.demo1.model.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.demo1.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public String createUser(UserDto userDto) {
        User user = UserMapper.mapTo(userDto);
        userRepository.save(user);
        return "Success";
    }

    public UserDto updateUser(UserDto userDto) {
        User user = userRepository.getOne(userDto.getId());
        user.setTopic(userDto.getTopic());
        user = userRepository.save(user);
        return UserMapper.mapTo(user);
    }

    public String deleteUser(Long userId) {
        User user = userRepository.getOne(userId);
        userRepository.delete(user);
        return "Silindi";
    }

}