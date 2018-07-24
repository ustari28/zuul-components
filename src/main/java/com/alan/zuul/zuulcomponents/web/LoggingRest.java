package com.alan.zuul.zuulcomponents.web;

import com.alan.zuul.zuulcomponents.domain.GenericLog;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/logging/v1")
@Slf4j
public class LoggingRest {

    @PostMapping("/info")
    public ResponseEntity<Void> login(@RequestBody GenericLog input) {
        log.info(input.toString());
        return ResponseEntity.ok().build();
    }
}
