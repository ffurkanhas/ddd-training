package com.trendyol.tacticaldddecommerce.service;

import com.trendyol.tacticaldddecommerce.entity.order.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderVerificationService {
    public boolean isOrderValid(Order order) {
        if(order.getTotalAmount() < 100) {
            return false; // Sipariş tutarı 100'ün altında ise geçersiz sayılır.
        }

        return true; // Tüm kriterleri geçerse sipariş geçerlidir.
    }
}
