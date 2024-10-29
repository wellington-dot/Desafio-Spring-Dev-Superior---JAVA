package com.projetospring.aula;

import com.projetospring.aula.order.Order;
import com.projetospring.aula.services.OrderServices;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class AulaApplication implements CommandLineRunner {

	private final OrderServices orderServices;
	private final Order order;

	public AulaApplication(OrderServices orderServices, Order order) {
		this.orderServices = orderServices;
		this.order = order;
	}

	public static void main(String[] args) {
		SpringApplication.run(AulaApplication.class, args);


	}

	@Override
	public void run(String... args) throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.print("Numero do pedido: ");
		int pedido = input.nextInt();
		System.out.print("Valor: ");
		double valor = input.nextDouble();
		System.out.print("Desconto: ");
		double desconto = input.nextDouble();

		order.setCode(pedido);
		order.setBasic(valor);
		order.setDiscount(desconto);

		System.out.println("Pedido código " + pedido);
		System.out.println("Valor total: " + orderServices.total(order));
	}
}
