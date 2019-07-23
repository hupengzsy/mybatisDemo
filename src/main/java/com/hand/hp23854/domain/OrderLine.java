package com.hand.hp23854.domain;

import java.util.Date;

/**
 * `order_line_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '订单行id',
 *   `order_header_id` bigint(20) NOT NULL COMMENT '订单头id',
 *   `order_line_number` int(10) NOT NULL COMMENT '订单行号',
 *   `item_code` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '物料编码',
 *   `item_name` varchar(240) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '物料名称',
 *   `unit_price` decimal(20,8) NOT NULL COMMENT '单价',
 *   `quantity` decimal(20,2) NOT NULL COMMENT '数量',
 *   `line_amount` decimal(20,2) NOT NULL COMMENT '行总价',
 *   `object_version_number` bigint(20) NOT NULL DEFAULT '0' COMMENT '版本号',
 *   `creation_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
 *   `created_by` bigint(20) NOT NULL DEFAULT '-1' COMMENT '创建人id',
 *   `last_update_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最后更新时间',
 *   `last_updated_by` bigint(20) NOT NULL DEFAULT '-1' COMMENT '最后更新人id',
 */
public class OrderLine {
    private Long orderLineId;
    private Integer orderLineNumber;
    private String itemCode;
    private String itemName;
    private Float unitPrice;
    private Float quantity;
    private Float lineAmount;
    private Integer objectVersionNumber;
    private Date createtionDate;
    private Long createdBy;
    private Date lastUpdateDate;
    private Integer lastUpdatedBy;
    private OrderHeader orderHeader;

    public Long getOrderLineId() {
        return orderLineId;
    }

    public void setOrderLineId(Long orderLineId) {
        this.orderLineId = orderLineId;
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

    public Integer getObjectVersionNumber() {
        return objectVersionNumber;
    }

    public void setObjectVersionNumber(Integer objectVersionNumber) {
        this.objectVersionNumber = objectVersionNumber;
    }

    public Date getCreatetionDate() {
        return createtionDate;
    }

    public void setCreatetionDate(Date createtionDate) {
        this.createtionDate = createtionDate;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public Integer getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(Integer lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public OrderHeader getOrderHeader() {
        return orderHeader;
    }

    public void setOrderHeader(OrderHeader orderHeader) {
        this.orderHeader = orderHeader;
    }

    @Override
    public String toString() {
        return "OrderLine{" +
                "orderLineId=" + orderLineId +
                ", orderLineNumber=" + orderLineNumber +
                ", itemCode='" + itemCode + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", lineAmount=" + lineAmount +
                ", objectVersionNumber=" + objectVersionNumber +
                ", createtionDate=" + createtionDate +
                ", createdBy=" + createdBy +
                ", lastUpdateDate=" + lastUpdateDate +
                ", lastUpdatedBy=" + lastUpdatedBy +
                ", orderHeader=" + orderHeader +
                '}';
    }
}
