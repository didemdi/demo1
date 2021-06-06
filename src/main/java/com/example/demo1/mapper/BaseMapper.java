package com.example.demo1.mapper;

import com.example.demo1.entity.BaseEntity;
import com.example.demo1.model.dto.BaseDto;

public class BaseMapper {
    public static void mapToDto(BaseDto dto, BaseEntity entity) {
        dto.setStatus(entity.getStatus());
    }

    public static void mapToEntity(BaseDto dto, BaseEntity entity) {
        entity.setStatus(dto.getStatus());
    }
}

