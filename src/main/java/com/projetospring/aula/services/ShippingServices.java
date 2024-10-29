package com.projetospring.aula.services;

import com.projetospring.aula.order.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingServices {


    public double shipment(Order order){
        double freight = 0;
        if(order.getBasic() < 100.00){
            freight = 20.00;
        } else if(order.getBasic() > 100.00 && order.getBasic() < 200.00){
            freight = 12.00;
        } else if (order.getBasic() > 200) {
            freight = 0;
        }
        return freight;
    }
}
