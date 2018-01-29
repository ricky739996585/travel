package com.ricky.travel.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ScenicLikeRecordExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ScenicLikeRecordExample() {
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

        public Criteria andScenicRecordIdIsNull() {
            addCriterion("Scenic_Record_Id is null");
            return (Criteria) this;
        }

        public Criteria andScenicRecordIdIsNotNull() {
            addCriterion("Scenic_Record_Id is not null");
            return (Criteria) this;
        }

        public Criteria andScenicRecordIdEqualTo(Integer value) {
            addCriterion("Scenic_Record_Id =", value, "scenicRecordId");
            return (Criteria) this;
        }

        public Criteria andScenicRecordIdNotEqualTo(Integer value) {
            addCriterion("Scenic_Record_Id <>", value, "scenicRecordId");
            return (Criteria) this;
        }

        public Criteria andScenicRecordIdGreaterThan(Integer value) {
            addCriterion("Scenic_Record_Id >", value, "scenicRecordId");
            return (Criteria) this;
        }

        public Criteria andScenicRecordIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Scenic_Record_Id >=", value, "scenicRecordId");
            return (Criteria) this;
        }

        public Criteria andScenicRecordIdLessThan(Integer value) {
            addCriterion("Scenic_Record_Id <", value, "scenicRecordId");
            return (Criteria) this;
        }

        public Criteria andScenicRecordIdLessThanOrEqualTo(Integer value) {
            addCriterion("Scenic_Record_Id <=", value, "scenicRecordId");
            return (Criteria) this;
        }

        public Criteria andScenicRecordIdIn(List<Integer> values) {
            addCriterion("Scenic_Record_Id in", values, "scenicRecordId");
            return (Criteria) this;
        }

        public Criteria andScenicRecordIdNotIn(List<Integer> values) {
            addCriterion("Scenic_Record_Id not in", values, "scenicRecordId");
            return (Criteria) this;
        }

        public Criteria andScenicRecordIdBetween(Integer value1, Integer value2) {
            addCriterion("Scenic_Record_Id between", value1, value2, "scenicRecordId");
            return (Criteria) this;
        }

        public Criteria andScenicRecordIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Scenic_Record_Id not between", value1, value2, "scenicRecordId");
            return (Criteria) this;
        }

        public Criteria andScenicRecordDateIsNull() {
            addCriterion("Scenic_Record_Date is null");
            return (Criteria) this;
        }

        public Criteria andScenicRecordDateIsNotNull() {
            addCriterion("Scenic_Record_Date is not null");
            return (Criteria) this;
        }

        public Criteria andScenicRecordDateEqualTo(Date value) {
            addCriterion("Scenic_Record_Date =", value, "scenicRecordDate");
            return (Criteria) this;
        }

        public Criteria andScenicRecordDateNotEqualTo(Date value) {
            addCriterion("Scenic_Record_Date <>", value, "scenicRecordDate");
            return (Criteria) this;
        }

        public Criteria andScenicRecordDateGreaterThan(Date value) {
            addCriterion("Scenic_Record_Date >", value, "scenicRecordDate");
            return (Criteria) this;
        }

        public Criteria andScenicRecordDateGreaterThanOrEqualTo(Date value) {
            addCriterion("Scenic_Record_Date >=", value, "scenicRecordDate");
            return (Criteria) this;
        }

        public Criteria andScenicRecordDateLessThan(Date value) {
            addCriterion("Scenic_Record_Date <", value, "scenicRecordDate");
            return (Criteria) this;
        }

        public Criteria andScenicRecordDateLessThanOrEqualTo(Date value) {
            addCriterion("Scenic_Record_Date <=", value, "scenicRecordDate");
            return (Criteria) this;
        }

        public Criteria andScenicRecordDateIn(List<Date> values) {
            addCriterion("Scenic_Record_Date in", values, "scenicRecordDate");
            return (Criteria) this;
        }

        public Criteria andScenicRecordDateNotIn(List<Date> values) {
            addCriterion("Scenic_Record_Date not in", values, "scenicRecordDate");
            return (Criteria) this;
        }

        public Criteria andScenicRecordDateBetween(Date value1, Date value2) {
            addCriterion("Scenic_Record_Date between", value1, value2, "scenicRecordDate");
            return (Criteria) this;
        }

        public Criteria andScenicRecordDateNotBetween(Date value1, Date value2) {
            addCriterion("Scenic_Record_Date not between", value1, value2, "scenicRecordDate");
            return (Criteria) this;
        }

        public Criteria andScenicRecordIpIsNull() {
            addCriterion("Scenic_Record_Ip is null");
            return (Criteria) this;
        }

        public Criteria andScenicRecordIpIsNotNull() {
            addCriterion("Scenic_Record_Ip is not null");
            return (Criteria) this;
        }

        public Criteria andScenicRecordIpEqualTo(String value) {
            addCriterion("Scenic_Record_Ip =", value, "scenicRecordIp");
            return (Criteria) this;
        }

        public Criteria andScenicRecordIpNotEqualTo(String value) {
            addCriterion("Scenic_Record_Ip <>", value, "scenicRecordIp");
            return (Criteria) this;
        }

        public Criteria andScenicRecordIpGreaterThan(String value) {
            addCriterion("Scenic_Record_Ip >", value, "scenicRecordIp");
            return (Criteria) this;
        }

        public Criteria andScenicRecordIpGreaterThanOrEqualTo(String value) {
            addCriterion("Scenic_Record_Ip >=", value, "scenicRecordIp");
            return (Criteria) this;
        }

        public Criteria andScenicRecordIpLessThan(String value) {
            addCriterion("Scenic_Record_Ip <", value, "scenicRecordIp");
            return (Criteria) this;
        }

        public Criteria andScenicRecordIpLessThanOrEqualTo(String value) {
            addCriterion("Scenic_Record_Ip <=", value, "scenicRecordIp");
            return (Criteria) this;
        }

        public Criteria andScenicRecordIpLike(String value) {
            addCriterion("Scenic_Record_Ip like", value, "scenicRecordIp");
            return (Criteria) this;
        }

        public Criteria andScenicRecordIpNotLike(String value) {
            addCriterion("Scenic_Record_Ip not like", value, "scenicRecordIp");
            return (Criteria) this;
        }

        public Criteria andScenicRecordIpIn(List<String> values) {
            addCriterion("Scenic_Record_Ip in", values, "scenicRecordIp");
            return (Criteria) this;
        }

        public Criteria andScenicRecordIpNotIn(List<String> values) {
            addCriterion("Scenic_Record_Ip not in", values, "scenicRecordIp");
            return (Criteria) this;
        }

        public Criteria andScenicRecordIpBetween(String value1, String value2) {
            addCriterion("Scenic_Record_Ip between", value1, value2, "scenicRecordIp");
            return (Criteria) this;
        }

        public Criteria andScenicRecordIpNotBetween(String value1, String value2) {
            addCriterion("Scenic_Record_Ip not between", value1, value2, "scenicRecordIp");
            return (Criteria) this;
        }

        public Criteria andScenicRecordUserIdIsNull() {
            addCriterion("Scenic_Record_User_Id is null");
            return (Criteria) this;
        }

        public Criteria andScenicRecordUserIdIsNotNull() {
            addCriterion("Scenic_Record_User_Id is not null");
            return (Criteria) this;
        }

        public Criteria andScenicRecordUserIdEqualTo(Integer value) {
            addCriterion("Scenic_Record_User_Id =", value, "scenicRecordUserId");
            return (Criteria) this;
        }

        public Criteria andScenicRecordUserIdNotEqualTo(Integer value) {
            addCriterion("Scenic_Record_User_Id <>", value, "scenicRecordUserId");
            return (Criteria) this;
        }

        public Criteria andScenicRecordUserIdGreaterThan(Integer value) {
            addCriterion("Scenic_Record_User_Id >", value, "scenicRecordUserId");
            return (Criteria) this;
        }

        public Criteria andScenicRecordUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Scenic_Record_User_Id >=", value, "scenicRecordUserId");
            return (Criteria) this;
        }

        public Criteria andScenicRecordUserIdLessThan(Integer value) {
            addCriterion("Scenic_Record_User_Id <", value, "scenicRecordUserId");
            return (Criteria) this;
        }

        public Criteria andScenicRecordUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("Scenic_Record_User_Id <=", value, "scenicRecordUserId");
            return (Criteria) this;
        }

        public Criteria andScenicRecordUserIdIn(List<Integer> values) {
            addCriterion("Scenic_Record_User_Id in", values, "scenicRecordUserId");
            return (Criteria) this;
        }

        public Criteria andScenicRecordUserIdNotIn(List<Integer> values) {
            addCriterion("Scenic_Record_User_Id not in", values, "scenicRecordUserId");
            return (Criteria) this;
        }

        public Criteria andScenicRecordUserIdBetween(Integer value1, Integer value2) {
            addCriterion("Scenic_Record_User_Id between", value1, value2, "scenicRecordUserId");
            return (Criteria) this;
        }

        public Criteria andScenicRecordUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Scenic_Record_User_Id not between", value1, value2, "scenicRecordUserId");
            return (Criteria) this;
        }

        public Criteria andScenicRecordScenicIdIsNull() {
            addCriterion("Scenic_Record_Scenic_Id is null");
            return (Criteria) this;
        }

        public Criteria andScenicRecordScenicIdIsNotNull() {
            addCriterion("Scenic_Record_Scenic_Id is not null");
            return (Criteria) this;
        }

        public Criteria andScenicRecordScenicIdEqualTo(Integer value) {
            addCriterion("Scenic_Record_Scenic_Id =", value, "scenicRecordScenicId");
            return (Criteria) this;
        }

        public Criteria andScenicRecordScenicIdNotEqualTo(Integer value) {
            addCriterion("Scenic_Record_Scenic_Id <>", value, "scenicRecordScenicId");
            return (Criteria) this;
        }

        public Criteria andScenicRecordScenicIdGreaterThan(Integer value) {
            addCriterion("Scenic_Record_Scenic_Id >", value, "scenicRecordScenicId");
            return (Criteria) this;
        }

        public Criteria andScenicRecordScenicIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Scenic_Record_Scenic_Id >=", value, "scenicRecordScenicId");
            return (Criteria) this;
        }

        public Criteria andScenicRecordScenicIdLessThan(Integer value) {
            addCriterion("Scenic_Record_Scenic_Id <", value, "scenicRecordScenicId");
            return (Criteria) this;
        }

        public Criteria andScenicRecordScenicIdLessThanOrEqualTo(Integer value) {
            addCriterion("Scenic_Record_Scenic_Id <=", value, "scenicRecordScenicId");
            return (Criteria) this;
        }

        public Criteria andScenicRecordScenicIdIn(List<Integer> values) {
            addCriterion("Scenic_Record_Scenic_Id in", values, "scenicRecordScenicId");
            return (Criteria) this;
        }

        public Criteria andScenicRecordScenicIdNotIn(List<Integer> values) {
            addCriterion("Scenic_Record_Scenic_Id not in", values, "scenicRecordScenicId");
            return (Criteria) this;
        }

        public Criteria andScenicRecordScenicIdBetween(Integer value1, Integer value2) {
            addCriterion("Scenic_Record_Scenic_Id between", value1, value2, "scenicRecordScenicId");
            return (Criteria) this;
        }

        public Criteria andScenicRecordScenicIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Scenic_Record_Scenic_Id not between", value1, value2, "scenicRecordScenicId");
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