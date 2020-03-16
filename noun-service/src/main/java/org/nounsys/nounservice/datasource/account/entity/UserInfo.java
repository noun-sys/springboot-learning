package org.nounsys.nounservice.datasource.account.entity;

import java.util.Date;

public class UserInfo {
    private Long id;

    private Long userId;

    private String realName;

    private String idCard;

    private String bankCard;

    private String reservedMobile;

    private String idCardFrontAttachmentId;

    private String idCardBackAttachmentId;

    private Long enterpriseId;

    private Integer faceVerifyScore;

    private String status;

    private String identityInfoStatus;

    private String threeFactorVerifyStatus;

    private String fourFactorVerifyStatus;

    private String livingVerifyStatus;

    private Date createdAt;

    private Date updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getBankCard() {
        return bankCard;
    }

    public void setBankCard(String bankCard) {
        this.bankCard = bankCard == null ? null : bankCard.trim();
    }

    public String getReservedMobile() {
        return reservedMobile;
    }

    public void setReservedMobile(String reservedMobile) {
        this.reservedMobile = reservedMobile == null ? null : reservedMobile.trim();
    }

    public String getIdCardFrontAttachmentId() {
        return idCardFrontAttachmentId;
    }

    public void setIdCardFrontAttachmentId(String idCardFrontAttachmentId) {
        this.idCardFrontAttachmentId = idCardFrontAttachmentId == null ? null : idCardFrontAttachmentId.trim();
    }

    public String getIdCardBackAttachmentId() {
        return idCardBackAttachmentId;
    }

    public void setIdCardBackAttachmentId(String idCardBackAttachmentId) {
        this.idCardBackAttachmentId = idCardBackAttachmentId == null ? null : idCardBackAttachmentId.trim();
    }

    public Long getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public Integer getFaceVerifyScore() {
        return faceVerifyScore;
    }

    public void setFaceVerifyScore(Integer faceVerifyScore) {
        this.faceVerifyScore = faceVerifyScore;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getIdentityInfoStatus() {
        return identityInfoStatus;
    }

    public void setIdentityInfoStatus(String identityInfoStatus) {
        this.identityInfoStatus = identityInfoStatus == null ? null : identityInfoStatus.trim();
    }

    public String getThreeFactorVerifyStatus() {
        return threeFactorVerifyStatus;
    }

    public void setThreeFactorVerifyStatus(String threeFactorVerifyStatus) {
        this.threeFactorVerifyStatus = threeFactorVerifyStatus == null ? null : threeFactorVerifyStatus.trim();
    }

    public String getFourFactorVerifyStatus() {
        return fourFactorVerifyStatus;
    }

    public void setFourFactorVerifyStatus(String fourFactorVerifyStatus) {
        this.fourFactorVerifyStatus = fourFactorVerifyStatus == null ? null : fourFactorVerifyStatus.trim();
    }

    public String getLivingVerifyStatus() {
        return livingVerifyStatus;
    }

    public void setLivingVerifyStatus(String livingVerifyStatus) {
        this.livingVerifyStatus = livingVerifyStatus == null ? null : livingVerifyStatus.trim();
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
}