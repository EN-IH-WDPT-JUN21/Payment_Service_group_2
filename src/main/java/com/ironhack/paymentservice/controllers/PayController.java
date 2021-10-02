package com.ironhack.paymentservice.controllers;

import com.ironhack.paymentservice.dto.PayDTO;
import com.ironhack.paymentservice.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayController {
    @Autowired
    PayService payService;

    @GetMapping("/payment/{payment_id}")
    PayDTO getPaymentById(@PathVariable Long paymentId){
        return payService.getPaymentById(paymentId);
    }
}
