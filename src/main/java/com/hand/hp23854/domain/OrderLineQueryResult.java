package com.hand.hp23854.domain;

//订单编号、客户名称、客户地址、订单备注、订单创建人、订单行号、物料编码、物料名称、单价、数量、行总价`
public class OrderLineQueryResult {
    //订单编号
    private String orderNumber;
    //客户名称
    private String userName;
    //客户地址
    private String address;
    //订单备注
    private String remark;
    //订单(订单头)创建人的姓名
    private String createdByName;
    //订单行号
    private Integer orderLineNumber;

    private String itemCode;

    private String itemName;

    private Float unitPrice;

    private Float quantity;

    private Float lineAmount;

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreateByName() {
        return createdByName;
    }

    public void setCreatedBy(String createdByName) {
        this.createdByName = createdByName;
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

    public Float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Float getQuantity() {
        return quantity;
    }

    public void setQuantity(Float quantity) {
        this.quantity = quantity;
    }

    public Float getLineAmount() {
        return lineAmount;
    }

    public void setLineAmount(Float lineAmount) {
        this.lineAmount = lineAmount;
    }

    @Override
    public String toString() {
        return "OrderLineQueryResult{" +
                "orderNumber='" + orderNumber + '\'' +
                ", userName='" + userName + '\'' +
                ", address='" + address + '\'' +
                ", remark='" + remark + '\'' +
                ", createdByName='" + createdByName + '\'' +
                ", orderLineNumber='" + orderLineNumber + '\'' +
                ", itemCode='" + itemCode + '\'' +
                ", itemName='" + itemName + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", lineAmount=" + lineAmount +
                '}';
    }
}
