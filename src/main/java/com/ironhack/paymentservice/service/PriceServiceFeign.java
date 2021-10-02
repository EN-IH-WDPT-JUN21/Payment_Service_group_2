package com.ironhack.paymentservice.service;

import com.ironhack.paymentservice.dto.OrderDTO;
import com.ironhack.paymentservice.dto.PriceDTO;
import com.ironhack.paymentservice.proxy.OrderProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@Qualifier("feign")
public class PriceServiceFeign implements IPriceService {
    private BigDecimal COOKIE_PRICE = new BigDecimal("2");

    @Autowired
    OrderProxy orderProxy;

    public PriceDTO getPriceById(Long id){
        //Call Order service and get OrderDTO by ID
        OrderDTO orderDTO = orderProxy.getOrderById(id);
        //Process and return it
        return new PriceDTO(
                orderDTO.getOrderReference(),
                COOKIE_PRICE.multiply(new BigDecimal(orderDTO.getQuantity()))
        );
    }
}
