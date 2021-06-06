package com.example.demo1.service;

import com.example.demo1.entity.Haberler;
import com.example.demo1.mapper.HaberlerMapper;

import com.example.demo1.model.dto.HaberlerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.demo1.repository.HaberlerRepository;

@Service
@RequiredArgsConstructor
public class HaberlerService{

    private final HaberlerRepository haberlerRepository;


    public String createHaber(HaberlerDto haberlerDto) {
        Haberler haberler = HaberlerMapper.mapTo(haberlerDto);
        haberlerRepository.save(haberler);
        return "Success";
    }

    public HaberlerDto updateHaber(HaberlerDto haberlerDto) {
        Haberler haberler = haberlerRepository.getOne(haberlerDto.getId());
        haberler.setTopic(haberlerDto.getTopic());
        haberler = haberlerRepository.save(haberler);
        return HaberlerMapper.mapTo(haberler);
    }

    public String deleteHaber(Long userId) {
        Haberler haberler = haberlerRepository.getOne(userId);
        haberlerRepository.delete(haberler);
        return "Silindi";
    }


}