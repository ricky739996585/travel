package com.ricky.travel.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DivideVOExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public DivideVOExample() {
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

        public Criteria andDivideIdIsNull() {
            addCriterion("Divide_Id is null");
            return (Criteria) this;
        }

        public Criteria andDivideIdIsNotNull() {
            addCriterion("Divide_Id is not null");
            return (Criteria) this;
        }

        public Criteria andDivideIdEqualTo(Integer value) {
            addCriterion("Divide_Id =", value, "divideId");
            return (Criteria) this;
        }

        public Criteria andDivideIdNotEqualTo(Integer value) {
            addCriterion("Divide_Id <>", value, "divideId");
            return (Criteria) this;
        }

        public Criteria andDivideIdGreaterThan(Integer value) {
            addCriterion("Divide_Id >", value, "divideId");
            return (Criteria) this;
        }

        public Criteria andDivideIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Divide_Id >=", value, "divideId");
            return (Criteria) this;
        }

        public Criteria andDivideIdLessThan(Integer value) {
            addCriterion("Divide_Id <", value, "divideId");
            return (Criteria) this;
        }

        public Criteria andDivideIdLessThanOrEqualTo(Integer value) {
            addCriterion("Divide_Id <=", value, "divideId");
            return (Criteria) this;
        }

        public Criteria andDivideIdIn(List<Integer> values) {
            addCriterion("Divide_Id in", values, "divideId");
            return (Criteria) this;
        }

        public Criteria andDivideIdNotIn(List<Integer> values) {
            addCriterion("Divide_Id not in", values, "divideId");
            return (Criteria) this;
        }

        public Criteria andDivideIdBetween(Integer value1, Integer value2) {
            addCriterion("Divide_Id between", value1, value2, "divideId");
            return (Criteria) this;
        }

        public Criteria andDivideIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Divide_Id not between", value1, value2, "divideId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNull() {
            addCriterion("Admin_Id is null");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNotNull() {
            addCriterion("Admin_Id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIdEqualTo(Integer value) {
            addCriterion("Admin_Id =", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotEqualTo(Integer value) {
            addCriterion("Admin_Id <>", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThan(Integer value) {
            addCriterion("Admin_Id >", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Admin_Id >=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThan(Integer value) {
            addCriterion("Admin_Id <", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThanOrEqualTo(Integer value) {
            addCriterion("Admin_Id <=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIn(List<Integer> values) {
            addCriterion("Admin_Id in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotIn(List<Integer> values) {
            addCriterion("Admin_Id not in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdBetween(Integer value1, Integer value2) {
            addCriterion("Admin_Id between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Admin_Id not between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAuthIdIsNull() {
            addCriterion("Auth_Id is null");
            return (Criteria) this;
        }

        public Criteria andAuthIdIsNotNull() {
            addCriterion("Auth_Id is not null");
            return (Criteria) this;
        }

        public Criteria andAuthIdEqualTo(Integer value) {
            addCriterion("Auth_Id =", value, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdNotEqualTo(Integer value) {
            addCriterion("Auth_Id <>", value, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdGreaterThan(Integer value) {
            addCriterion("Auth_Id >", value, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Auth_Id >=", value, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdLessThan(Integer value) {
            addCriterion("Auth_Id <", value, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdLessThanOrEqualTo(Integer value) {
            addCriterion("Auth_Id <=", value, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdIn(List<Integer> values) {
            addCriterion("Auth_Id in", values, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdNotIn(List<Integer> values) {
            addCriterion("Auth_Id not in", values, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdBetween(Integer value1, Integer value2) {
            addCriterion("Auth_Id between", value1, value2, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Auth_Id not between", value1, value2, "authId");
            return (Criteria) this;
        }

        public Criteria andDivideDateIsNull() {
            addCriterion("Divide_Date is null");
            return (Criteria) this;
        }

        public Criteria andDivideDateIsNotNull() {
            addCriterion("Divide_Date is not null");
            return (Criteria) this;
        }

        public Criteria andDivideDateEqualTo(Date value) {
            addCriterion("Divide_Date =", value, "divideDate");
            return (Criteria) this;
        }

        public Criteria andDivideDateNotEqualTo(Date value) {
            addCriterion("Divide_Date <>", value, "divideDate");
            return (Criteria) this;
        }

        public Criteria andDivideDateGreaterThan(Date value) {
            addCriterion("Divide_Date >", value, "divideDate");
            return (Criteria) this;
        }

        public Criteria andDivideDateGreaterThanOrEqualTo(Date value) {
            addCriterion("Divide_Date >=", value, "divideDate");
            return (Criteria) this;
        }

        public Criteria andDivideDateLessThan(Date value) {
            addCriterion("Divide_Date <", value, "divideDate");
            return (Criteria) this;
        }

        public Criteria andDivideDateLessThanOrEqualTo(Date value) {
            addCriterion("Divide_Date <=", value, "divideDate");
            return (Criteria) this;
        }

        public Criteria andDivideDateIn(List<Date> values) {
            addCriterion("Divide_Date in", values, "divideDate");
            return (Criteria) this;
        }

        public Criteria andDivideDateNotIn(List<Date> values) {
            addCriterion("Divide_Date not in", values, "divideDate");
            return (Criteria) this;
        }

        public Criteria andDivideDateBetween(Date value1, Date value2) {
            addCriterion("Divide_Date between", value1, value2, "divideDate");
            return (Criteria) this;
        }

        public Criteria andDivideDateNotBetween(Date value1, Date value2) {
            addCriterion("Divide_Date not between", value1, value2, "divideDate");
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