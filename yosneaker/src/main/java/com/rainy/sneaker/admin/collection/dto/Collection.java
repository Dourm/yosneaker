package com.rainy.sneaker.admin.collection.dto;

public class Collection {
    private Integer collectionId;

    private Integer collectionArticleId;

    private Integer collectionAccountId;

    public Integer getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(Integer collectionId) {
        this.collectionId = collectionId;
    }

    public Integer getCollectionArticleId() {
        return collectionArticleId;
    }

    public void setCollectionArticleId(Integer collectionArticleId) {
        this.collectionArticleId = collectionArticleId;
    }

    public Integer getCollectionAccountId() {
        return collectionAccountId;
    }

    public void setCollectionAccountId(Integer collectionAccountId) {
        this.collectionAccountId = collectionAccountId;
    }
}