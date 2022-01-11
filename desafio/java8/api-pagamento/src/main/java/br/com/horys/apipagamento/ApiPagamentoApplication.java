package br.com.horys.apipagamento;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRabbit
@SpringBootApplication
public class ApiPagamentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiPagamentoApplication.class, args);
	}

}
