package com.github.eberhardmayer.jibexample;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HalloWorldController {

    @GetMapping("/")
    public ResponseEntity<String> greeting() {
        return ResponseEntity.ok("hallo world!");
    }
}