package com.example.demo1.mapper;


import com.example.demo1.entity.User;
import com.example.demo1.model.dto.UserDto;

import java.util.List;
import java.util.stream.Collectors;

public class UserMapper extends BaseMapper {

    public static UserDto mapTo(User entity) {
        UserDto dto = new UserDto();
        dto.setTopic(entity.getTopic());
        dto.setContent(entity.getContent());
        dto.setValidityDate(entity.getValidityDate());


        return dto;
    }

    public static User mapTo(UserDto dto) {
        return mapTo(dto, new User());
    }

    public static User mapTo(UserDto from, User to) {
        to.setTopic(from.getTopic());
        to.setContent(from.getContent());

        return to;
    }

    public static List<UserDto> mapToDto(List<User> entities) {
        if (entities == null) {
            return null;
        }
        return entities.stream().map(UserMapper::mapTo).collect(Collectors.toList());
    }

    public static List<User> mapToEntity(List<UserDto> dtos) {
        if (dtos == null) {
            return null;
        }
        return dtos.stream().map(UserMapper::mapTo).collect(Collectors.toList());
    }

}
