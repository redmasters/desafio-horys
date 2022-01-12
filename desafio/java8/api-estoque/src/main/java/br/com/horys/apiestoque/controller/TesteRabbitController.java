package br.com.horys.apiestoque.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/teste")
public class TesteRabbitController {


    public TesteRabbitController(AmqpTemplate queueSender){
        this.queueSender = queueSender;
    }

    private final AmqpTemplate queueSender;

    @GetMapping
    public String send(){
        String mensagem = "teste messgage string";

        MessageProperties messageProperties = new MessageProperties();
        messageProperties.setHeader("ultima", "sim");
        Message message = new Message(mensagem.getBytes(), messageProperties);
        queueSender.convertAndSend("exchangeTeste", "teste-routing-key", message);
        return "ok. done";
    }


}
