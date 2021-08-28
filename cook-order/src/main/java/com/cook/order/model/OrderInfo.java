package com.cook.order.model;

import java.math.BigDecimal;
import java.util.Date;

public class OrderInfo {

    private Long orderId;
    private BigDecimal price;
    private int quantity;
    private BigDecimal total;
    private Long userId;
    private short status;
    private Date createTime;
    private Date updateTime;

    public Long getOrderId() {
        return orderId;
    }

    public OrderInfo setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public OrderInfo setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public OrderInfo setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public OrderInfo setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    public Long getUserId() {
        return userId;
    }

    public OrderInfo setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public short getStatus() {
        return status;
    }

    public OrderInfo setStatus(short status) {
        this.status = status;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public OrderInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public OrderInfo setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }
}
