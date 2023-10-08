package com.trendyol.tacticaldddecommerce.service;

import com.trendyol.tacticaldddecommerce.entity.order.Order;
import com.trendyol.tacticaldddecommerce.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public Order placeOrder(Order order) {
        orderRepository.save(order);

        // Sipariş verildi olayını yayınla
        // Event publisher servisini kullanabilirsiniz
        // eventPublisher.publish(new OrderPlacedEvent(order));
        return order;
    }
}
