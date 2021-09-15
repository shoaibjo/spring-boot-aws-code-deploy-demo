package com.sha.awscodedeploydemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("api/health")
    public ResponseEntity health(){
        return ResponseEntity.ok("Tested Successfully");
    }
}
