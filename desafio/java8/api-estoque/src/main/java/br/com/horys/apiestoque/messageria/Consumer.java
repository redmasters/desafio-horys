package br.com.horys.apiestoque.messageria;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
   @RabbitListener(queues = {"${queue.name}"})
    public void receive(@Payload String filebody){
       System.out.println("Message" + filebody);
   }

}
