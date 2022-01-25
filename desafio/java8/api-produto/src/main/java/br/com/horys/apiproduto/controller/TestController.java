package br.com.horys.apiproduto.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/teste")
@RefreshScope
public class TestController {
    @Value("${test.name}")
    private String name;

    @GetMapping
    public String teste(){
        return name;
    }



}
