package com.cook.order.model;

public class OrderItemInfo {

    private Long orderItemId;
    private Long orderId;
    private Long productId;
    private Long userId;

    public Long getUserId() {
        return userId;
    }

    public OrderItemInfo setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public Long getOrderItemId() {
        return orderItemId;
    }

    public OrderItemInfo setOrderItemId(Long orderItemId) {
        this.orderItemId = orderItemId;
        return this;
    }

    public Long getOrderId() {
        return orderId;
    }

    public OrderItemInfo setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }

    public Long getProductId() {
        return productId;
    }

    public OrderItemInfo setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
}
