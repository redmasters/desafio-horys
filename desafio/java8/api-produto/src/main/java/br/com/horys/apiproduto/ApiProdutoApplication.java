package br.com.horys.apiproduto;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRabbit
@SpringBootApplication
public class ApiProdutoApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiProdutoApplication.class, args);

    }
}
