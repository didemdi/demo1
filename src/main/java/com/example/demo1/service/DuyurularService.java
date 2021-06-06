package com.example.demo1.service;

import com.example.demo1.entity.Duyurular;
import com.example.demo1.model.dto.DuyuruDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.demo1.repository.DuyurularRepository;

@Service
@RequiredArgsConstructor
public class DuyurularService{

    private final DuyurularRepository duyurularRepository;


    public String createDuyuru(DuyuruDto duyuruDto) {
        Duyurular duyuru = new Duyurular();
        duyuru.setTopic(duyuruDto.getTopic());
        duyuru.setContent(duyuruDto.getContent());

        duyurularRepository.save(duyuru);
        return "Success";
    }

    public DuyuruDto updateDuyuru(DuyuruDto duyuruDto) {
        Duyurular duyuru = duyurularRepository.getOne(duyuruDto.getId());
        duyuru.setTopic(duyuruDto.getTopic());
        duyuru = duyurularRepository.save(duyuru);

        DuyuruDto duyuruDto1 = new DuyuruDto();

        duyuruDto1.setTopic(duyuru.getTopic());

        return duyuruDto1;
    }

    public String deleteDuyuru(Long userId) {
        Duyurular duyuru = duyurularRepository.getOne(userId);
        duyurularRepository.delete(duyuru);
        return "Silindi";
    }

}
