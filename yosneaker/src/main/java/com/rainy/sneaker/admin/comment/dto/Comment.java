package com.rainy.sneaker.admin.comment.dto;

import java.util.Date;

public class Comment {
    private Integer articleCommentId;

    private Integer articleCommentArticleId;

    private String articleCommentContent;

    private Integer articleCommentAccountId;

    private Date articleCommentPublishTime;

    public Integer getArticleCommentId() {
        return articleCommentId;
    }

    public void setArticleCommentId(Integer articleCommentId) {
        this.articleCommentId = articleCommentId;
    }

    public Integer getArticleCommentArticleId() {
        return articleCommentArticleId;
    }

    public void setArticleCommentArticleId(Integer articleCommentArticleId) {
        this.articleCommentArticleId = articleCommentArticleId;
    }

    public String getArticleCommentContent() {
        return articleCommentContent;
    }

    public void setArticleCommentContent(String articleCommentContent) {
        this.articleCommentContent = articleCommentContent == null ? null : articleCommentContent.trim();
    }

    public Integer getArticleCommentAccountId() {
        return articleCommentAccountId;
    }

    public void setArticleCommentAccountId(Integer articleCommentAccountId) {
        this.articleCommentAccountId = articleCommentAccountId;
    }

    public Date getArticleCommentPublishTime() {
        return articleCommentPublishTime;
    }

    public void setArticleCommentPublishTime(Date articleCommentPublishTime) {
        this.articleCommentPublishTime = articleCommentPublishTime;
    }
}