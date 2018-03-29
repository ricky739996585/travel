package com.ricky.travel.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AdminUserExample implements Serializable {
    protected String orderByClause;

    private String orderByDirection;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public AdminUserExample() {
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

    public String getOrderByDirection() {
        return orderByDirection;
    }

    public void setOrderByDirection(String orderByDirection) {
        this.orderByDirection = orderByDirection;
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

        public Criteria andAdminAccountIsNull() {
            addCriterion("Admin_Account is null");
            return (Criteria) this;
        }

        public Criteria andAdminAccountIsNotNull() {
            addCriterion("Admin_Account is not null");
            return (Criteria) this;
        }

        public Criteria andAdminAccountEqualTo(String value) {
            addCriterion("Admin_Account =", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountNotEqualTo(String value) {
            addCriterion("Admin_Account <>", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountGreaterThan(String value) {
            addCriterion("Admin_Account >", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountGreaterThanOrEqualTo(String value) {
            addCriterion("Admin_Account >=", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountLessThan(String value) {
            addCriterion("Admin_Account <", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountLessThanOrEqualTo(String value) {
            addCriterion("Admin_Account <=", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountLike(String value) {
            addCriterion("Admin_Account like", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountNotLike(String value) {
            addCriterion("Admin_Account not like", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountIn(List<String> values) {
            addCriterion("Admin_Account in", values, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountNotIn(List<String> values) {
            addCriterion("Admin_Account not in", values, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountBetween(String value1, String value2) {
            addCriterion("Admin_Account between", value1, value2, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountNotBetween(String value1, String value2) {
            addCriterion("Admin_Account not between", value1, value2, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordIsNull() {
            addCriterion("Admin_Password is null");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordIsNotNull() {
            addCriterion("Admin_Password is not null");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordEqualTo(String value) {
            addCriterion("Admin_Password =", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotEqualTo(String value) {
            addCriterion("Admin_Password <>", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordGreaterThan(String value) {
            addCriterion("Admin_Password >", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("Admin_Password >=", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordLessThan(String value) {
            addCriterion("Admin_Password <", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordLessThanOrEqualTo(String value) {
            addCriterion("Admin_Password <=", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordLike(String value) {
            addCriterion("Admin_Password like", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotLike(String value) {
            addCriterion("Admin_Password not like", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordIn(List<String> values) {
            addCriterion("Admin_Password in", values, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotIn(List<String> values) {
            addCriterion("Admin_Password not in", values, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordBetween(String value1, String value2) {
            addCriterion("Admin_Password between", value1, value2, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotBetween(String value1, String value2) {
            addCriterion("Admin_Password not between", value1, value2, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminLevelIsNull() {
            addCriterion("Admin_Level is null");
            return (Criteria) this;
        }

        public Criteria andAdminLevelIsNotNull() {
            addCriterion("Admin_Level is not null");
            return (Criteria) this;
        }

        public Criteria andAdminLevelEqualTo(Integer value) {
            addCriterion("Admin_Level =", value, "adminLevel");
            return (Criteria) this;
        }

        public Criteria andAdminLevelNotEqualTo(Integer value) {
            addCriterion("Admin_Level <>", value, "adminLevel");
            return (Criteria) this;
        }

        public Criteria andAdminLevelGreaterThan(Integer value) {
            addCriterion("Admin_Level >", value, "adminLevel");
            return (Criteria) this;
        }

        public Criteria andAdminLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("Admin_Level >=", value, "adminLevel");
            return (Criteria) this;
        }

        public Criteria andAdminLevelLessThan(Integer value) {
            addCriterion("Admin_Level <", value, "adminLevel");
            return (Criteria) this;
        }

        public Criteria andAdminLevelLessThanOrEqualTo(Integer value) {
            addCriterion("Admin_Level <=", value, "adminLevel");
            return (Criteria) this;
        }

        public Criteria andAdminLevelIn(List<Integer> values) {
            addCriterion("Admin_Level in", values, "adminLevel");
            return (Criteria) this;
        }

        public Criteria andAdminLevelNotIn(List<Integer> values) {
            addCriterion("Admin_Level not in", values, "adminLevel");
            return (Criteria) this;
        }

        public Criteria andAdminLevelBetween(Integer value1, Integer value2) {
            addCriterion("Admin_Level between", value1, value2, "adminLevel");
            return (Criteria) this;
        }

        public Criteria andAdminLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("Admin_Level not between", value1, value2, "adminLevel");
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