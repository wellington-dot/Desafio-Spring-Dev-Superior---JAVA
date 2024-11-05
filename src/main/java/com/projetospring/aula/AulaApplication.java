package com.projetospring.aula;

import com.projetospring.aula.order.Order;
import com.projetospring.aula.services.OrderServices;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

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
		Order order1 = new Order(1034, 150.0, 20.0);
		System.out.println("Pedido código " + order1.getCode());
		System.out.println("Valor total: R$ " + orderServices.total(order1));

		Order order2 = new Order(2282, 800.0, 10.0);
		System.out.println("Pedido código " + order2.getCode());
		System.out.println("Valor total: R$ " + orderServices.total(order2));

		Order order3 = new Order(1309, 95.90, 0.0);
		System.out.println("Pedido código " + order3.getCode());
		System.out.println("Valor total: R$ " + orderServices.total(order3));
	}
}
