package com.trendyol.tacticaldddecommerce.service;

import com.trendyol.tacticaldddecommerce.entity.order.Order;
import com.trendyol.tacticaldddecommerce.entity.order.OrderItem;
import org.springframework.stereotype.Service;

@Service
public class DiscountCalculatorService {
    // Örnek olarak yüzde bazında bir indirim oranı kullanıyoruz.
    private static final double DISCOUNT_PERCENTAGE_FOR_BULK_PURCHASE = 0.10; // %10

    // Toplu alımlar için minimum ürün sayısı.
    private static final int BULK_PURCHASE_MINIMUM_QUANTITY = 10;

    public double calculateDiscount(Order order) {
        double totalDiscount = 0;

        for (OrderItem orderItem : order.getOrderItems()) {
            totalDiscount += calculateOrderItemDiscount(orderItem);
        }

        return totalDiscount;
    }

    /**
     * Tek bir sipariş kalemi için indirimi hesaplar.
     */
    public double calculateOrderItemDiscount(OrderItem orderItem) {
        if (orderItem.getQuantity() >= BULK_PURCHASE_MINIMUM_QUANTITY) {
            return orderItem.getPrice() * DISCOUNT_PERCENTAGE_FOR_BULK_PURCHASE * orderItem.getQuantity();
        }

        return 0;
    }
}
