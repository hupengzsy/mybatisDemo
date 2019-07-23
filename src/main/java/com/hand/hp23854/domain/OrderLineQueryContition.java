package com.hand.hp23854.domain;
//订单编号(模糊)、订单行号(模糊)、物料编码(模糊)、物料名称(模糊)、订单创建人id、订单客户id
public class OrderLineQueryContition {
    private String orderNumber;
    private Integer orderLineNumber;
    private String itemCode;
    private String itemName;
    private Long createdBy;
    private Long userId;

    public OrderLineQueryContition() {
    }

    public OrderLineQueryContition(String orderNumber, Integer orderLineNumber, String itemCode, String itemName, Long createdBy, Long userId) {
        this.orderNumber = orderNumber;
        this.orderLineNumber = orderLineNumber;
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.createdBy = createdBy;
        this.userId = userId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Integer getOrderLineNumber() {
        return orderLineNumber;
    }

    public void setOrderLineNumber(Integer orderLineNumber) {
        this.orderLineNumber = orderLineNumber;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createBy) {
        this.createdBy = createBy;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }


}
