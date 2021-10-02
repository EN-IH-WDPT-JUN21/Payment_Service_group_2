package com.ironhack.paymentservice.proxy;

import com.ironhack.paymentservice.dto.OrderDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//We don't know the name
@FeignClient("cookie-order-service")
public interface OrderProxy {

    @GetMapping("/orders/{order_id}")
    OrderDTO getOrderById(@PathVariable Long order_id);

}
