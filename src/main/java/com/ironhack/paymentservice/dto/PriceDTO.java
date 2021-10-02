package com.ironhack.paymentservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PriceDTO {
    private Long orderId;
    private BigDecimal orderPrice;
    private Long paymentId;

    public PriceDTO(Long orderId, BigDecimal orderPrice) {
        this.orderId = orderId;
        this.orderPrice = orderPrice;
        this.paymentId = 111L;
    }
}
