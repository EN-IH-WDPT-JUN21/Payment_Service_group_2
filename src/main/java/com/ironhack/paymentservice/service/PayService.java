package com.ironhack.paymentservice.service;

import com.ironhack.paymentservice.dto.PayDTO;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class PayService {
    public PayDTO getPaymentById(Long id){
        //Mock implementation
        return new PayDTO(id,new BigDecimal("1000"));
    }
}
