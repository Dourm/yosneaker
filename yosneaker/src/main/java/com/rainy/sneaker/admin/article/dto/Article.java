package com.rainy.sneaker.admin.article.dto;

import java.util.Date;

public class Article {

	private Integer articleId;

    private String articleTitle;

    private String articleDescription;

    private String articleComment;

    private Integer articleLevel;

    private String articleImages;

    private Integer articleAuthorId;

    private Date articleCreateTime;

    private Integer articleReadCount;

    private Integer articleCommentCount;

    private Integer articleCommentLikeCount;

    private Date articleLastModify;

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle == null ? null : articleTitle.trim();
    }

    public String getArticleDescription() {
        return articleDescription;
    }

    public void setArticleDescription(String articleDescription) {
        this.articleDescription = articleDescription == null ? null : articleDescription.trim();
    }

    public String getArticleComment() {
        return articleComment;
    }

    public void setArticleComment(String articleComment) {
        this.articleComment = articleComment == null ? null : articleComment.trim();
    }

    public Integer getArticleLevel() {
        return articleLevel;
    }

    public void setArticleLevel(Integer articleLevel) {
        this.articleLevel = articleLevel;
    }

    public String getArticleImages() {
        return articleImages;
    }

    public void setArticleImages(String articleImages) {
        this.articleImages = articleImages == null ? null : articleImages.trim();
    }

    public Integer getArticleAuthorId() {
        return articleAuthorId;
    }

    public void setArticleAuthorId(Integer articleAuthorId) {
        this.articleAuthorId = articleAuthorId;
    }

    public Date getArticleCreateTime() {
        return articleCreateTime;
    }

    public void setArticleCreateTime(Date articleCreateTime) {
        this.articleCreateTime = articleCreateTime;
    }

    public Integer getArticleReadCount() {
        return articleReadCount;
    }

    public void setArticleReadCount(Integer articleReadCount) {
        this.articleReadCount = articleReadCount;
    }

    public Integer getArticleCommentCount() {
        return articleCommentCount;
    }

    public void setArticleCommentCount(Integer articleCommentCount) {
        this.articleCommentCount = articleCommentCount;
    }

    public Integer getArticleCommentLikeCount() {
        return articleCommentLikeCount;
    }

    public void setArticleCommentLikeCount(Integer articleCommentLikeCount) {
        this.articleCommentLikeCount = articleCommentLikeCount;
    }

    public Date getArticleLastModify() {
        return articleLastModify;
    }

    public void setArticleLastModify(Date articleLastModify) {
        this.articleLastModify = articleLastModify;
    }
}