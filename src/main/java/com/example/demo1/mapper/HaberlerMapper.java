package com.example.demo1.mapper;


import com.example.demo1.entity.Haberler;
import com.example.demo1.model.dto.HaberlerDto;

import java.util.List;
import java.util.stream.Collectors;

public class HaberlerMapper extends BaseMapper {

    public static HaberlerDto mapTo(Haberler entity) {
        HaberlerDto dto = new HaberlerDto();
        BaseMapper.mapToDto(dto,entity);
        dto.setTopic(entity.getTopic());
        dto.setContent(entity.getContent());
        dto.setValidityDate(entity.getValidityDate());


        return dto;
    }

    public static Haberler mapTo(HaberlerDto dto) {
        return mapTo(dto, new Haberler());
    }

    public static Haberler mapTo(HaberlerDto from, Haberler to) {
        to.setTopic(from.getTopic());
        to.setContent(from.getContent());

        return to;
    }

    public static List<HaberlerDto> mapToDto(List<Haberler> entities) {
        if (entities == null) {
            return null;
        }
        return entities.stream().map(HaberlerMapper::mapTo).collect(Collectors.toList());
    }

    public static List<Haberler> mapToEntity(List<HaberlerDto> dtos) {
        if (dtos == null) {
            return null;
        }
        return dtos.stream().map(HaberlerMapper::mapTo).collect(Collectors.toList());
    }
}
