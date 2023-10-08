package com.trendyol.tacticaldddecommerce.entity.order;

import com.trendyol.tacticaldddecommerce.entity.customer.Customer;
import com.trendyol.tacticaldddecommerce.vo.ShippingAddress;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Order {
    private UUID id;
    private List<OrderItem> orderItems;
    private double totalAmount;
    private double discount;
    private ShippingAddress shippingAddress;
    private Customer customer;

    public Order() {
        this.id = UUID.randomUUID();
        this.orderItems = new ArrayList<>();
    }

    public Order(Customer customer, List<OrderItem> orderItems, double discount) {
        this();
        this.customer = customer;
        this.orderItems = orderItems;
        this.discount = discount;
        calculateTotalAmount();
    }

    private void calculateTotalAmount() {
        for (OrderItem item : orderItems) {
            this.totalAmount += item.getPrice() * item.getQuantity();
        }
        this.totalAmount -= discount;
    }

    public void addOrderItem(OrderItem item) throws Exception {
        if (orderItems.size() > 600) {
            throw new Exception();
        }
        orderItems.add(item);
        calculateTotalAmount(); // Her ekleme yapıldığında toplam miktarı tekrar hesapla
    }

    public void updateShippingAddress() {
        var sa = new ShippingAddress("asd",
                "asd",
                "asd",
                "asd", "asd", "asd");
        this.shippingAddress = sa;
    }

    public UUID getId() {
        return id;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
        calculateTotalAmount(); // İndirim değiştiğinde toplam miktarı tekrar hesapla
    }

    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }
}
