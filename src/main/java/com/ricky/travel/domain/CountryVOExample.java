package com.ricky.travel.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CountryVOExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public CountryVOExample() {
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

        public Criteria andCountryIdIsNull() {
            addCriterion("Country_ID is null");
            return (Criteria) this;
        }

        public Criteria andCountryIdIsNotNull() {
            addCriterion("Country_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCountryIdEqualTo(Integer value) {
            addCriterion("Country_ID =", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotEqualTo(Integer value) {
            addCriterion("Country_ID <>", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdGreaterThan(Integer value) {
            addCriterion("Country_ID >", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Country_ID >=", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLessThan(Integer value) {
            addCriterion("Country_ID <", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLessThanOrEqualTo(Integer value) {
            addCriterion("Country_ID <=", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdIn(List<Integer> values) {
            addCriterion("Country_ID in", values, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotIn(List<Integer> values) {
            addCriterion("Country_ID not in", values, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdBetween(Integer value1, Integer value2) {
            addCriterion("Country_ID between", value1, value2, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Country_ID not between", value1, value2, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryNnameIsNull() {
            addCriterion("Country_Nname is null");
            return (Criteria) this;
        }

        public Criteria andCountryNnameIsNotNull() {
            addCriterion("Country_Nname is not null");
            return (Criteria) this;
        }

        public Criteria andCountryNnameEqualTo(String value) {
            addCriterion("Country_Nname =", value, "countryNname");
            return (Criteria) this;
        }

        public Criteria andCountryNnameNotEqualTo(String value) {
            addCriterion("Country_Nname <>", value, "countryNname");
            return (Criteria) this;
        }

        public Criteria andCountryNnameGreaterThan(String value) {
            addCriterion("Country_Nname >", value, "countryNname");
            return (Criteria) this;
        }

        public Criteria andCountryNnameGreaterThanOrEqualTo(String value) {
            addCriterion("Country_Nname >=", value, "countryNname");
            return (Criteria) this;
        }

        public Criteria andCountryNnameLessThan(String value) {
            addCriterion("Country_Nname <", value, "countryNname");
            return (Criteria) this;
        }

        public Criteria andCountryNnameLessThanOrEqualTo(String value) {
            addCriterion("Country_Nname <=", value, "countryNname");
            return (Criteria) this;
        }

        public Criteria andCountryNnameLike(String value) {
            addCriterion("Country_Nname like", value, "countryNname");
            return (Criteria) this;
        }

        public Criteria andCountryNnameNotLike(String value) {
            addCriterion("Country_Nname not like", value, "countryNname");
            return (Criteria) this;
        }

        public Criteria andCountryNnameIn(List<String> values) {
            addCriterion("Country_Nname in", values, "countryNname");
            return (Criteria) this;
        }

        public Criteria andCountryNnameNotIn(List<String> values) {
            addCriterion("Country_Nname not in", values, "countryNname");
            return (Criteria) this;
        }

        public Criteria andCountryNnameBetween(String value1, String value2) {
            addCriterion("Country_Nname between", value1, value2, "countryNname");
            return (Criteria) this;
        }

        public Criteria andCountryNnameNotBetween(String value1, String value2) {
            addCriterion("Country_Nname not between", value1, value2, "countryNname");
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