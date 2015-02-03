package com.rainy.sneaker.admin.appraisal.dto;

public class Appraisal {
    private Integer appraisalId;

    private String appraisalTitle;

    private String appraisalDescription;

    private String appraisalImages;

    private Integer appraisalAuthorId;

    private String appraisalFollowerIds;

    public Integer getAppraisalId() {
        return appraisalId;
    }

    public void setAppraisalId(Integer appraisalId) {
        this.appraisalId = appraisalId;
    }

    public String getAppraisalTitle() {
        return appraisalTitle;
    }

    public void setAppraisalTitle(String appraisalTitle) {
        this.appraisalTitle = appraisalTitle == null ? null : appraisalTitle.trim();
    }

    public String getAppraisalDescription() {
        return appraisalDescription;
    }

    public void setAppraisalDescription(String appraisalDescription) {
        this.appraisalDescription = appraisalDescription == null ? null : appraisalDescription.trim();
    }

    public String getAppraisalImages() {
        return appraisalImages;
    }

    public void setAppraisalImages(String appraisalImages) {
        this.appraisalImages = appraisalImages == null ? null : appraisalImages.trim();
    }

    public Integer getAppraisalAuthorId() {
        return appraisalAuthorId;
    }

    public void setAppraisalAuthorId(Integer appraisalAuthorId) {
        this.appraisalAuthorId = appraisalAuthorId;
    }

    public String getAppraisalFollowerIds() {
        return appraisalFollowerIds;
    }

    public void setAppraisalFollowerIds(String appraisalFollowerIds) {
        this.appraisalFollowerIds = appraisalFollowerIds == null ? null : appraisalFollowerIds.trim();
    }
}