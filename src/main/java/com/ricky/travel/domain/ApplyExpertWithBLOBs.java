package com.ricky.travel.domain;

import java.io.Serializable;

public class ApplyExpertWithBLOBs extends ApplyExpert implements Serializable {
    private String applyProve;

    private String applyReason;

    private static final long serialVersionUID = 1L;

    public String getApplyProve() {
        return applyProve;
    }

    public void setApplyProve(String applyProve) {
        this.applyProve = applyProve == null ? null : applyProve.trim();
    }

    public String getApplyReason() {
        return applyReason;
    }

    public void setApplyReason(String applyReason) {
        this.applyReason = applyReason == null ? null : applyReason.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", applyProve=").append(applyProve);
        sb.append(", applyReason=").append(applyReason);
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
        ApplyExpertWithBLOBs other = (ApplyExpertWithBLOBs) that;
        return (this.getApplyId() == null ? other.getApplyId() == null : this.getApplyId().equals(other.getApplyId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getDataId() == null ? other.getDataId() == null : this.getDataId().equals(other.getDataId()))
            && (this.getApplyDate() == null ? other.getApplyDate() == null : this.getApplyDate().equals(other.getApplyDate()))
            && (this.getIsPass() == null ? other.getIsPass() == null : this.getIsPass().equals(other.getIsPass()))
            && (this.getApplyProve() == null ? other.getApplyProve() == null : this.getApplyProve().equals(other.getApplyProve()))
            && (this.getApplyReason() == null ? other.getApplyReason() == null : this.getApplyReason().equals(other.getApplyReason()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getApplyId() == null) ? 0 : getApplyId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getDataId() == null) ? 0 : getDataId().hashCode());
        result = prime * result + ((getApplyDate() == null) ? 0 : getApplyDate().hashCode());
        result = prime * result + ((getIsPass() == null) ? 0 : getIsPass().hashCode());
        result = prime * result + ((getApplyProve() == null) ? 0 : getApplyProve().hashCode());
        result = prime * result + ((getApplyReason() == null) ? 0 : getApplyReason().hashCode());
        return result;
    }
}