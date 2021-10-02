package com.ironhack.paymentservice.controllers;

import com.ironhack.paymentservice.dto.PriceDTO;
import com.ironhack.paymentservice.service.IPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PriceController {
    @Autowired
    @Qualifier("feign")
    IPriceService priceService;

    @GetMapping("/price/{order_id}")
    @ResponseStatus(HttpStatus.OK)
    public PriceDTO getPriceById(@PathVariable("order_id") Long order_id) {
        return priceService.getPriceById(order_id);
    }
}
