package com.ricky.travel.domain;

import java.io.Serializable;
import java.util.Date;

public class ArticleLikeRecord implements Serializable {
    private Integer articleRecordId;

    private Date articleRecordDate;

    private String articleRecordIp;

    private Integer articleRecordUserId;

    private Integer articleRecordActicleId;

    private static final long serialVersionUID = 1L;

    public Integer getArticleRecordId() {
        return articleRecordId;
    }

    public void setArticleRecordId(Integer articleRecordId) {
        this.articleRecordId = articleRecordId;
    }

    public Date getArticleRecordDate() {
        return articleRecordDate;
    }

    public void setArticleRecordDate(Date articleRecordDate) {
        this.articleRecordDate = articleRecordDate;
    }

    public String getArticleRecordIp() {
        return articleRecordIp;
    }

    public void setArticleRecordIp(String articleRecordIp) {
        this.articleRecordIp = articleRecordIp == null ? null : articleRecordIp.trim();
    }

    public Integer getArticleRecordUserId() {
        return articleRecordUserId;
    }

    public void setArticleRecordUserId(Integer articleRecordUserId) {
        this.articleRecordUserId = articleRecordUserId;
    }

    public Integer getArticleRecordActicleId() {
        return articleRecordActicleId;
    }

    public void setArticleRecordActicleId(Integer articleRecordActicleId) {
        this.articleRecordActicleId = articleRecordActicleId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", articleRecordId=").append(articleRecordId);
        sb.append(", articleRecordDate=").append(articleRecordDate);
        sb.append(", articleRecordIp=").append(articleRecordIp);
        sb.append(", articleRecordUserId=").append(articleRecordUserId);
        sb.append(", articleRecordActicleId=").append(articleRecordActicleId);
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
        ArticleLikeRecord other = (ArticleLikeRecord) that;
        return (this.getArticleRecordId() == null ? other.getArticleRecordId() == null : this.getArticleRecordId().equals(other.getArticleRecordId()))
            && (this.getArticleRecordDate() == null ? other.getArticleRecordDate() == null : this.getArticleRecordDate().equals(other.getArticleRecordDate()))
            && (this.getArticleRecordIp() == null ? other.getArticleRecordIp() == null : this.getArticleRecordIp().equals(other.getArticleRecordIp()))
            && (this.getArticleRecordUserId() == null ? other.getArticleRecordUserId() == null : this.getArticleRecordUserId().equals(other.getArticleRecordUserId()))
            && (this.getArticleRecordActicleId() == null ? other.getArticleRecordActicleId() == null : this.getArticleRecordActicleId().equals(other.getArticleRecordActicleId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getArticleRecordId() == null) ? 0 : getArticleRecordId().hashCode());
        result = prime * result + ((getArticleRecordDate() == null) ? 0 : getArticleRecordDate().hashCode());
        result = prime * result + ((getArticleRecordIp() == null) ? 0 : getArticleRecordIp().hashCode());
        result = prime * result + ((getArticleRecordUserId() == null) ? 0 : getArticleRecordUserId().hashCode());
        result = prime * result + ((getArticleRecordActicleId() == null) ? 0 : getArticleRecordActicleId().hashCode());
        return result;
    }
}