package com.example.spring_rest_service_log.controller;

import com.example.spring_rest_service_log.model.Request;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MyController {


    public MyController() {
    }

    @PostMapping(value="/feedback")
    public void feedback(@RequestBody Request request) {

        log.info("Входящий request: " + request);

    }
}
