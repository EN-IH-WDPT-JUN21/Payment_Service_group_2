package com.ironhack.paymentservice.service;

import com.ironhack.paymentservice.dto.OrderDTO;
import com.ironhack.paymentservice.dto.PriceDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@Qualifier("mock")
public class PriceServiceMock implements IPriceService{
    private BigDecimal COOKIE_PRICE = new BigDecimal("2");

    public PriceDTO getPriceById(Long id){
        //Call Order service and get OrderDTO by ID
        OrderDTO mockOrderDTO = new OrderDTO(11L,id,22);
        //Process and return it
        return new PriceDTO(
                mockOrderDTO.getOrderReference(),
                COOKIE_PRICE.multiply(new BigDecimal(mockOrderDTO.getQuantity())),
                123L
        );
    }
}
