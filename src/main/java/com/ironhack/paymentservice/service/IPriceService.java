package com.ironhack.paymentservice.service;

import com.ironhack.paymentservice.dto.PriceDTO;

public interface IPriceService {
    PriceDTO getPriceById(Long id);
}
