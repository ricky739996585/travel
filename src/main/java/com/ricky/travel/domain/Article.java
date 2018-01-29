package com.ricky.travel.domain;

import java.io.Serializable;
import java.util.Date;

public class Article implements Serializable {
    private Integer articleId;

    private Integer userId;

    private String articleName;

    private Date articleDate;

    private Integer articleLike;

    private String articleTag;

    private Integer articlePass;

    private String articleContent;

    private static final long serialVersionUID = 1L;

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName == null ? null : articleName.trim();
    }

    public Date getArticleDate() {
        return articleDate;
    }

    public void setArticleDate(Date articleDate) {
        this.articleDate = articleDate;
    }

    public Integer getArticleLike() {
        return articleLike;
    }

    public void setArticleLike(Integer articleLike) {
        this.articleLike = articleLike;
    }

    public String getArticleTag() {
        return articleTag;
    }

    public void setArticleTag(String articleTag) {
        this.articleTag = articleTag == null ? null : articleTag.trim();
    }

    public Integer getArticlePass() {
        return articlePass;
    }

    public void setArticlePass(Integer articlePass) {
        this.articlePass = articlePass;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent == null ? null : articleContent.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", articleId=").append(articleId);
        sb.append(", userId=").append(userId);
        sb.append(", articleName=").append(articleName);
        sb.append(", articleDate=").append(articleDate);
        sb.append(", articleLike=").append(articleLike);
        sb.append(", articleTag=").append(articleTag);
        sb.append(", articlePass=").append(articlePass);
        sb.append(", articleContent=").append(articleContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Article other = (Article) that;
        return (this.getArticleId() == null ? other.getArticleId() == null : this.getArticleId().equals(other.getArticleId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getArticleName() == null ? other.getArticleName() == null : this.getArticleName().equals(other.getArticleName()))
            && (this.getArticleDate() == null ? other.getArticleDate() == null : this.getArticleDate().equals(other.getArticleDate()))
            && (this.getArticleLike() == null ? other.getArticleLike() == null : this.getArticleLike().equals(other.getArticleLike()))
            && (this.getArticleTag() == null ? other.getArticleTag() == null : this.getArticleTag().equals(other.getArticleTag()))
            && (this.getArticlePass() == null ? other.getArticlePass() == null : this.getArticlePass().equals(other.getArticlePass()))
            && (this.getArticleContent() == null ? other.getArticleContent() == null : this.getArticleContent().equals(other.getArticleContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getArticleId() == null) ? 0 : getArticleId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getArticleName() == null) ? 0 : getArticleName().hashCode());
        result = prime * result + ((getArticleDate() == null) ? 0 : getArticleDate().hashCode());
        result = prime * result + ((getArticleLike() == null) ? 0 : getArticleLike().hashCode());
        result = prime * result + ((getArticleTag() == null) ? 0 : getArticleTag().hashCode());
        result = prime * result + ((getArticlePass() == null) ? 0 : getArticlePass().hashCode());
        result = prime * result + ((getArticleContent() == null) ? 0 : getArticleContent().hashCode());
        return result;
    }
}