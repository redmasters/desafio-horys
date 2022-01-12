package br.com.horys.apiestoque.controller;

import br.com.horys.apiestoque.messageria.QueueSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rabbit")
public class RabbitController {
    @Autowired
    private QueueSender queueSender;

    @GetMapping
    public String send(){
        queueSender.send("Test message");
        return "ok. done";
    }
}
