package com.hand.hp23854.domain;

import java.util.Date;

/**
 * mysql> CREATE TABLE `order_header` (
 *   `order_header_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '订单头id',
 *   `order_number` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '订单编号',
 *   `customer_user_id` bigint(20) NOT NULL COMMENT '客户id',
 *   `remark` varchar(480) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '备注',
 *   `object_version_number` bigint(20) NOT NULL DEFAULT '0' COMMENT '版本号',
 *   `creation_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
 *   `created_by` bigint(20) NOT NULL DEFAULT '-1' COMMENT '创建人id',
 *   `last_update_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最后更新时间',
 *   `last_updated_by` bigint(20) NOT NULL DEFAULT '-1' COMMENT '最后更新人id',
 *   PRIMARY KEY (`order_header_id`),
 *   UNIQUE KEY `order_header_u1` (`order_number`) USING BTREE
 */
public class OrderHeader {
    private Long orderHeaderId;
    private String orderNumber;
    private Long customerUserId;
    private String remark;
    private Integer objectVersionNumber;
    private Date createtionDate;
    private Long createdBy;
    private Date lastUpdateDate;
    private Integer lastUpdatedBy;

    public Long getOrderHeaderId() {
        return orderHeaderId;
    }

    public void setOrderHeaderId(Long orderHeaderId) {
        this.orderHeaderId = orderHeaderId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Long getCustomerUserId() {
        return customerUserId;
    }

    public void setCustomerUserId(Long customerUserId) {
        this.customerUserId = customerUserId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    @Override
    public String toString() {
        return "OrderHeader{" +
                "orderHeaderId=" + orderHeaderId +
                ", orderNumber='" + orderNumber + '\'' +
                ", customerUserId=" + customerUserId +
                ", remark='" + remark + '\'' +
                ", objectVersionNumber=" + objectVersionNumber +
                ", createtionDate=" + createtionDate +
                ", createdBy=" + createdBy +
                ", lastUpdateDate=" + lastUpdateDate +
                ", lastUpdatedBy=" + lastUpdatedBy +
                '}';
    }
}
