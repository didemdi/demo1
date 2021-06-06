package com.example.demo1.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class BaseDto {

    private Long id;

    private int status;

    private String content;

    private String topic;

    private LocalDateTime validityDate;

}
