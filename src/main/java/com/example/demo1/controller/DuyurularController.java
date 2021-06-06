package com.example.demo1.controller;

import com.example.demo1.model.dto.DuyuruDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.example.demo1.service.DuyurularService;

@RestController
@RequiredArgsConstructor
public class DuyurularController extends BaseController {

    private final DuyurularService duyurularService;

    @PostMapping(DUYURU)
    public String createDuyuru(@RequestBody DuyuruDto duyuruDto) {

        return duyurularService.createDuyuru(duyuruDto);
    }

    @PostMapping(UPDATE_DUYURU)
    public DuyuruDto updateDuyuru(@RequestBody DuyuruDto duyuruDto) {

        return duyurularService.updateDuyuru(duyuruDto);
    }

    @GetMapping(DELETE_DUYURU)
    public String deleteDuyuru(@RequestParam(value = "userId") Long userId) {

        return duyurularService.deleteDuyuru(userId);
    }

}