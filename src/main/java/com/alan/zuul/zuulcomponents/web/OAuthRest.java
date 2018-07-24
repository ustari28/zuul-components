package com.alan.zuul.zuulcomponents.web;

import com.alan.zuul.zuulcomponents.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oauth/v1")
public class OAuthRest {

    @GetMapping("/login/{user}")
    public ResponseEntity<User> login(@PathVariable("user") String user) {
        return ResponseEntity.ok(User.builder().name(user).state("active").build());
    }
}
