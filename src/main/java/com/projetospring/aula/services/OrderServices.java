package com.projetospring.aula.services;

import com.projetospring.aula.order.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderServices {

    private final ShippingServices shippingServices;

    public OrderServices(ShippingServices shippingServices) {
        this.shippingServices = shippingServices;
    }

    public double total(Order order){
        double shipment = shippingServices.shipment(order);
        double percentDiscount = order.getBasic()*(order.getDiscount()/100);
        return (order.getBasic() - percentDiscount) + shipment;
    }
}
