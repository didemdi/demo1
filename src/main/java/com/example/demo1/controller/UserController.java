package com.example.demo1.controller;

import com.example.demo1.model.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.example.demo1.service.UserService;

@RestController
@RequiredArgsConstructor
public class UserController extends BaseController {

    private final UserService userService;

    @PostMapping(USER)
    public String createUser(@RequestBody UserDto userDto) {

        return userService.createUser(userDto);
    }

    @PostMapping(UPDATE_USER)
    public UserDto updateUser(@RequestBody UserDto userDto) {

        return userService.updateUser(userDto);
    }

    @GetMapping(DELETE_USER)
    public String deleteUser(@RequestParam(value = "userId") Long userId) {

        return userService.deleteUser(userId);
    }

}
