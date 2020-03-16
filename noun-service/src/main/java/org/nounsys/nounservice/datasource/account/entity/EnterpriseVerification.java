package org.nounsys.nounservice.datasource.account.entity;

import java.math.BigDecimal;
import java.util.Date;

public class EnterpriseVerification {
    private Long id;

    private Long enterpriseId;

    private String verifyProcess;

    private String enterpriseInfoVerifyStatus;

    private String bankAccountVerifyStatus;

    private Long transactionRecordId;

    private String transactionRecordHistoryIds;

    private BigDecimal receivedAmount;

    private Integer failedTimes;

    private Integer payTimes;

    private Date createdAt;

    private Date updatedAt;

    private Date submittedAt;

    private Date reviewedAt;

    private String reviewedOperator;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getVerifyProcess() {
        return verifyProcess;
    }

    public void setVerifyProcess(String verifyProcess) {
        this.verifyProcess = verifyProcess == null ? null : verifyProcess.trim();
    }

    public String getEnterpriseInfoVerifyStatus() {
        return enterpriseInfoVerifyStatus;
    }

    public void setEnterpriseInfoVerifyStatus(String enterpriseInfoVerifyStatus) {
        this.enterpriseInfoVerifyStatus = enterpriseInfoVerifyStatus == null ? null : enterpriseInfoVerifyStatus.trim();
    }

    public String getBankAccountVerifyStatus() {
        return bankAccountVerifyStatus;
    }

    public void setBankAccountVerifyStatus(String bankAccountVerifyStatus) {
        this.bankAccountVerifyStatus = bankAccountVerifyStatus == null ? null : bankAccountVerifyStatus.trim();
    }

    public Long getTransactionRecordId() {
        return transactionRecordId;
    }

    public void setTransactionRecordId(Long transactionRecordId) {
        this.transactionRecordId = transactionRecordId;
    }

    public String getTransactionRecordHistoryIds() {
        return transactionRecordHistoryIds;
    }

    public void setTransactionRecordHistoryIds(String transactionRecordHistoryIds) {
        this.transactionRecordHistoryIds = transactionRecordHistoryIds == null ? null : transactionRecordHistoryIds.trim();
    }

    public BigDecimal getReceivedAmount() {
        return receivedAmount;
    }

    public void setReceivedAmount(BigDecimal receivedAmount) {
        this.receivedAmount = receivedAmount;
    }

    public Integer getFailedTimes() {
        return failedTimes;
    }

    public void setFailedTimes(Integer failedTimes) {
        this.failedTimes = failedTimes;
    }

    public Integer getPayTimes() {
        return payTimes;
    }

    public void setPayTimes(Integer payTimes) {
        this.payTimes = payTimes;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getSubmittedAt() {
        return submittedAt;
    }

    public void setSubmittedAt(Date submittedAt) {
        this.submittedAt = submittedAt;
    }

    public Date getReviewedAt() {
        return reviewedAt;
    }

    public void setReviewedAt(Date reviewedAt) {
        this.reviewedAt = reviewedAt;
    }

    public String getReviewedOperator() {
        return reviewedOperator;
    }

    public void setReviewedOperator(String reviewedOperator) {
        this.reviewedOperator = reviewedOperator == null ? null : reviewedOperator.trim();
    }
}