package io.jenkins.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/jenskin/")
public class TestController {
    @GetMapping("/test")
    public String test() {
        return "lhv3";
    }
}
