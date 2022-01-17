package io.red.consumidorestoque.consumidor;

import dto.EstoqueDto;
import constantes.RabbitMQConstantes;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class EstoqueConsumidor {

    @RabbitListener(queues = RabbitMQConstantes.FILA_ESTOQUE)
    private void consumidor(EstoqueDto estoqueDto){
        System.out.println(estoqueDto.codigoProduto);
        System.out.println(estoqueDto.quantidade);
        System.out.println("------------------------");
    }
}
