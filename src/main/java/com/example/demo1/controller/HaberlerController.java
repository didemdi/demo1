package com.example.demo1.controller;


import com.example.demo1.model.dto.HaberlerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.example.demo1.service.HaberlerService;

@RestController
@RequiredArgsConstructor
public class HaberlerController extends BaseController {

    private final HaberlerService haberlerService;

    @PostMapping(HABER)
    public String createHaberler(@RequestBody HaberlerDto haberlerDto) {

        return haberlerService.createHaber(haberlerDto);
    }

    @PostMapping(UPDATE_HABER)
    public HaberlerDto updateHaberler(@RequestBody HaberlerDto haberlerDto) {

        return haberlerService.updateHaber(haberlerDto);
    }

    @GetMapping(DELETE_HABER)
    public String deleteHaberler(@RequestParam(value = "userId") Long userId) {

        return haberlerService.deleteHaber(userId);
    }

}