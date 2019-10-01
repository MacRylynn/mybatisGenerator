package com.dao.entity;

import java.math.BigDecimal;
import java.util.Date;

public class CrlLoanFeeRecordsEntity {
    /**
     * 编号
     */
    private Long id;

    /**
     * 渠道编号
     */
    private String channelCode;

    /**
     * 产品编号
     */
    private String productCode;

    /**
     * 借据编号
     */
    private String iouCode;

    /**
     * 还款计划编号
     */
    private String repaymentPlanCode;

    /**
     * 费用ID
     */
    private String feeCode;

    /**
     * 费率类型;ChargeSceneEnum
     */
    private String feeType;

    /**
     * 费用子类型RestChargeCollectionTypeEnum、ChargeCollectionTypeEnum、PenaltyChargeTypeEnum
     */
    private String feeSubtype;

    /**
     * 费用金额
     */
    private BigDecimal feeAmt;

    /**
     * 应收费用
     */
    private BigDecimal payableFeeAmt;

    /**
     * 约定收取日期
     */
    private Date agreeReceiveDate;

    /**
     * 实收费用
     */
    private BigDecimal repayedFeeAmt;

    /**
     * 最新收取时间
     */
    private Date lastReceiveTime;

    /**
     * 费用收取状态：FeeStatusEnum:已收RECEIVED，未收UNRECEIVED
     */
    private String feeStatus;

    /**
     * 创建时间
     */
    private Date createdDate;

    /**
     * 修改时间
     */
    private Date modifiedDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode == null ? null : channelCode.trim();
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    public String getIouCode() {
        return iouCode;
    }

    public void setIouCode(String iouCode) {
        this.iouCode = iouCode == null ? null : iouCode.trim();
    }

    public String getRepaymentPlanCode() {
        return repaymentPlanCode;
    }

    public void setRepaymentPlanCode(String repaymentPlanCode) {
        this.repaymentPlanCode = repaymentPlanCode == null ? null : repaymentPlanCode.trim();
    }

    public String getFeeCode() {
        return feeCode;
    }

    public void setFeeCode(String feeCode) {
        this.feeCode = feeCode == null ? null : feeCode.trim();
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType == null ? null : feeType.trim();
    }

    public String getFeeSubtype() {
        return feeSubtype;
    }

    public void setFeeSubtype(String feeSubtype) {
        this.feeSubtype = feeSubtype == null ? null : feeSubtype.trim();
    }

    public BigDecimal getFeeAmt() {
        return feeAmt;
    }

    public void setFeeAmt(BigDecimal feeAmt) {
        this.feeAmt = feeAmt;
    }

    public BigDecimal getPayableFeeAmt() {
        return payableFeeAmt;
    }

    public void setPayableFeeAmt(BigDecimal payableFeeAmt) {
        this.payableFeeAmt = payableFeeAmt;
    }

    public Date getAgreeReceiveDate() {
        return agreeReceiveDate;
    }

    public void setAgreeReceiveDate(Date agreeReceiveDate) {
        this.agreeReceiveDate = agreeReceiveDate;
    }

    public BigDecimal getRepayedFeeAmt() {
        return repayedFeeAmt;
    }

    public void setRepayedFeeAmt(BigDecimal repayedFeeAmt) {
        this.repayedFeeAmt = repayedFeeAmt;
    }

    public Date getLastReceiveTime() {
        return lastReceiveTime;
    }

    public void setLastReceiveTime(Date lastReceiveTime) {
        this.lastReceiveTime = lastReceiveTime;
    }

    public String getFeeStatus() {
        return feeStatus;
    }

    public void setFeeStatus(String feeStatus) {
        this.feeStatus = feeStatus == null ? null : feeStatus.trim();
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", channelCode=").append(channelCode);
        sb.append(", productCode=").append(productCode);
        sb.append(", iouCode=").append(iouCode);
        sb.append(", repaymentPlanCode=").append(repaymentPlanCode);
        sb.append(", feeCode=").append(feeCode);
        sb.append(", feeType=").append(feeType);
        sb.append(", feeSubtype=").append(feeSubtype);
        sb.append(", feeAmt=").append(feeAmt);
        sb.append(", payableFeeAmt=").append(payableFeeAmt);
        sb.append(", agreeReceiveDate=").append(agreeReceiveDate);
        sb.append(", repayedFeeAmt=").append(repayedFeeAmt);
        sb.append(", lastReceiveTime=").append(lastReceiveTime);
        sb.append(", feeStatus=").append(feeStatus);
        sb.append(", createdDate=").append(createdDate);
        sb.append(", modifiedDate=").append(modifiedDate);
        sb.append("]");
        return sb.toString();
    }
}