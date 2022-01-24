package br.com.horys.apiproduto;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableRabbit
@EnableEurekaClient
@SpringBootApplication
public class ApiProdutoApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiProdutoApplication.class, args);

    }
}
