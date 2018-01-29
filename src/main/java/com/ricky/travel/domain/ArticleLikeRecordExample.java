package com.ricky.travel.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticleLikeRecordExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ArticleLikeRecordExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria implements Serializable {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andArticleRecordIdIsNull() {
            addCriterion("Article_Record_Id is null");
            return (Criteria) this;
        }

        public Criteria andArticleRecordIdIsNotNull() {
            addCriterion("Article_Record_Id is not null");
            return (Criteria) this;
        }

        public Criteria andArticleRecordIdEqualTo(Integer value) {
            addCriterion("Article_Record_Id =", value, "articleRecordId");
            return (Criteria) this;
        }

        public Criteria andArticleRecordIdNotEqualTo(Integer value) {
            addCriterion("Article_Record_Id <>", value, "articleRecordId");
            return (Criteria) this;
        }

        public Criteria andArticleRecordIdGreaterThan(Integer value) {
            addCriterion("Article_Record_Id >", value, "articleRecordId");
            return (Criteria) this;
        }

        public Criteria andArticleRecordIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Article_Record_Id >=", value, "articleRecordId");
            return (Criteria) this;
        }

        public Criteria andArticleRecordIdLessThan(Integer value) {
            addCriterion("Article_Record_Id <", value, "articleRecordId");
            return (Criteria) this;
        }

        public Criteria andArticleRecordIdLessThanOrEqualTo(Integer value) {
            addCriterion("Article_Record_Id <=", value, "articleRecordId");
            return (Criteria) this;
        }

        public Criteria andArticleRecordIdIn(List<Integer> values) {
            addCriterion("Article_Record_Id in", values, "articleRecordId");
            return (Criteria) this;
        }

        public Criteria andArticleRecordIdNotIn(List<Integer> values) {
            addCriterion("Article_Record_Id not in", values, "articleRecordId");
            return (Criteria) this;
        }

        public Criteria andArticleRecordIdBetween(Integer value1, Integer value2) {
            addCriterion("Article_Record_Id between", value1, value2, "articleRecordId");
            return (Criteria) this;
        }

        public Criteria andArticleRecordIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Article_Record_Id not between", value1, value2, "articleRecordId");
            return (Criteria) this;
        }

        public Criteria andArticleRecordDateIsNull() {
            addCriterion("Article_Record_Date is null");
            return (Criteria) this;
        }

        public Criteria andArticleRecordDateIsNotNull() {
            addCriterion("Article_Record_Date is not null");
            return (Criteria) this;
        }

        public Criteria andArticleRecordDateEqualTo(Date value) {
            addCriterion("Article_Record_Date =", value, "articleRecordDate");
            return (Criteria) this;
        }

        public Criteria andArticleRecordDateNotEqualTo(Date value) {
            addCriterion("Article_Record_Date <>", value, "articleRecordDate");
            return (Criteria) this;
        }

        public Criteria andArticleRecordDateGreaterThan(Date value) {
            addCriterion("Article_Record_Date >", value, "articleRecordDate");
            return (Criteria) this;
        }

        public Criteria andArticleRecordDateGreaterThanOrEqualTo(Date value) {
            addCriterion("Article_Record_Date >=", value, "articleRecordDate");
            return (Criteria) this;
        }

        public Criteria andArticleRecordDateLessThan(Date value) {
            addCriterion("Article_Record_Date <", value, "articleRecordDate");
            return (Criteria) this;
        }

        public Criteria andArticleRecordDateLessThanOrEqualTo(Date value) {
            addCriterion("Article_Record_Date <=", value, "articleRecordDate");
            return (Criteria) this;
        }

        public Criteria andArticleRecordDateIn(List<Date> values) {
            addCriterion("Article_Record_Date in", values, "articleRecordDate");
            return (Criteria) this;
        }

        public Criteria andArticleRecordDateNotIn(List<Date> values) {
            addCriterion("Article_Record_Date not in", values, "articleRecordDate");
            return (Criteria) this;
        }

        public Criteria andArticleRecordDateBetween(Date value1, Date value2) {
            addCriterion("Article_Record_Date between", value1, value2, "articleRecordDate");
            return (Criteria) this;
        }

        public Criteria andArticleRecordDateNotBetween(Date value1, Date value2) {
            addCriterion("Article_Record_Date not between", value1, value2, "articleRecordDate");
            return (Criteria) this;
        }

        public Criteria andArticleRecordIpIsNull() {
            addCriterion("Article_Record_Ip is null");
            return (Criteria) this;
        }

        public Criteria andArticleRecordIpIsNotNull() {
            addCriterion("Article_Record_Ip is not null");
            return (Criteria) this;
        }

        public Criteria andArticleRecordIpEqualTo(String value) {
            addCriterion("Article_Record_Ip =", value, "articleRecordIp");
            return (Criteria) this;
        }

        public Criteria andArticleRecordIpNotEqualTo(String value) {
            addCriterion("Article_Record_Ip <>", value, "articleRecordIp");
            return (Criteria) this;
        }

        public Criteria andArticleRecordIpGreaterThan(String value) {
            addCriterion("Article_Record_Ip >", value, "articleRecordIp");
            return (Criteria) this;
        }

        public Criteria andArticleRecordIpGreaterThanOrEqualTo(String value) {
            addCriterion("Article_Record_Ip >=", value, "articleRecordIp");
            return (Criteria) this;
        }

        public Criteria andArticleRecordIpLessThan(String value) {
            addCriterion("Article_Record_Ip <", value, "articleRecordIp");
            return (Criteria) this;
        }

        public Criteria andArticleRecordIpLessThanOrEqualTo(String value) {
            addCriterion("Article_Record_Ip <=", value, "articleRecordIp");
            return (Criteria) this;
        }

        public Criteria andArticleRecordIpLike(String value) {
            addCriterion("Article_Record_Ip like", value, "articleRecordIp");
            return (Criteria) this;
        }

        public Criteria andArticleRecordIpNotLike(String value) {
            addCriterion("Article_Record_Ip not like", value, "articleRecordIp");
            return (Criteria) this;
        }

        public Criteria andArticleRecordIpIn(List<String> values) {
            addCriterion("Article_Record_Ip in", values, "articleRecordIp");
            return (Criteria) this;
        }

        public Criteria andArticleRecordIpNotIn(List<String> values) {
            addCriterion("Article_Record_Ip not in", values, "articleRecordIp");
            return (Criteria) this;
        }

        public Criteria andArticleRecordIpBetween(String value1, String value2) {
            addCriterion("Article_Record_Ip between", value1, value2, "articleRecordIp");
            return (Criteria) this;
        }

        public Criteria andArticleRecordIpNotBetween(String value1, String value2) {
            addCriterion("Article_Record_Ip not between", value1, value2, "articleRecordIp");
            return (Criteria) this;
        }

        public Criteria andArticleRecordUserIdIsNull() {
            addCriterion("Article_Record_User_Id is null");
            return (Criteria) this;
        }

        public Criteria andArticleRecordUserIdIsNotNull() {
            addCriterion("Article_Record_User_Id is not null");
            return (Criteria) this;
        }

        public Criteria andArticleRecordUserIdEqualTo(Integer value) {
            addCriterion("Article_Record_User_Id =", value, "articleRecordUserId");
            return (Criteria) this;
        }

        public Criteria andArticleRecordUserIdNotEqualTo(Integer value) {
            addCriterion("Article_Record_User_Id <>", value, "articleRecordUserId");
            return (Criteria) this;
        }

        public Criteria andArticleRecordUserIdGreaterThan(Integer value) {
            addCriterion("Article_Record_User_Id >", value, "articleRecordUserId");
            return (Criteria) this;
        }

        public Criteria andArticleRecordUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Article_Record_User_Id >=", value, "articleRecordUserId");
            return (Criteria) this;
        }

        public Criteria andArticleRecordUserIdLessThan(Integer value) {
            addCriterion("Article_Record_User_Id <", value, "articleRecordUserId");
            return (Criteria) this;
        }

        public Criteria andArticleRecordUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("Article_Record_User_Id <=", value, "articleRecordUserId");
            return (Criteria) this;
        }

        public Criteria andArticleRecordUserIdIn(List<Integer> values) {
            addCriterion("Article_Record_User_Id in", values, "articleRecordUserId");
            return (Criteria) this;
        }

        public Criteria andArticleRecordUserIdNotIn(List<Integer> values) {
            addCriterion("Article_Record_User_Id not in", values, "articleRecordUserId");
            return (Criteria) this;
        }

        public Criteria andArticleRecordUserIdBetween(Integer value1, Integer value2) {
            addCriterion("Article_Record_User_Id between", value1, value2, "articleRecordUserId");
            return (Criteria) this;
        }

        public Criteria andArticleRecordUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Article_Record_User_Id not between", value1, value2, "articleRecordUserId");
            return (Criteria) this;
        }

        public Criteria andArticleRecordActicleIdIsNull() {
            addCriterion("Article_Record_Acticle_Id is null");
            return (Criteria) this;
        }

        public Criteria andArticleRecordActicleIdIsNotNull() {
            addCriterion("Article_Record_Acticle_Id is not null");
            return (Criteria) this;
        }

        public Criteria andArticleRecordActicleIdEqualTo(Integer value) {
            addCriterion("Article_Record_Acticle_Id =", value, "articleRecordActicleId");
            return (Criteria) this;
        }

        public Criteria andArticleRecordActicleIdNotEqualTo(Integer value) {
            addCriterion("Article_Record_Acticle_Id <>", value, "articleRecordActicleId");
            return (Criteria) this;
        }

        public Criteria andArticleRecordActicleIdGreaterThan(Integer value) {
            addCriterion("Article_Record_Acticle_Id >", value, "articleRecordActicleId");
            return (Criteria) this;
        }

        public Criteria andArticleRecordActicleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Article_Record_Acticle_Id >=", value, "articleRecordActicleId");
            return (Criteria) this;
        }

        public Criteria andArticleRecordActicleIdLessThan(Integer value) {
            addCriterion("Article_Record_Acticle_Id <", value, "articleRecordActicleId");
            return (Criteria) this;
        }

        public Criteria andArticleRecordActicleIdLessThanOrEqualTo(Integer value) {
            addCriterion("Article_Record_Acticle_Id <=", value, "articleRecordActicleId");
            return (Criteria) this;
        }

        public Criteria andArticleRecordActicleIdIn(List<Integer> values) {
            addCriterion("Article_Record_Acticle_Id in", values, "articleRecordActicleId");
            return (Criteria) this;
        }

        public Criteria andArticleRecordActicleIdNotIn(List<Integer> values) {
            addCriterion("Article_Record_Acticle_Id not in", values, "articleRecordActicleId");
            return (Criteria) this;
        }

        public Criteria andArticleRecordActicleIdBetween(Integer value1, Integer value2) {
            addCriterion("Article_Record_Acticle_Id between", value1, value2, "articleRecordActicleId");
            return (Criteria) this;
        }

        public Criteria andArticleRecordActicleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Article_Record_Acticle_Id not between", value1, value2, "articleRecordActicleId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}