package com.josedev.fundspringboot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringController {

    @RequestMapping
    @ResponseBody
    public ResponseEntity<String> ping(){
        return new ResponseEntity<>("Desplegando desde SpringBoot",HttpStatus.OK);
    }
}
