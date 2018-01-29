package com.ricky.travel.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ScenicVOExample implements Serializable {
    protected String orderByClause;

    private String orderByDirection;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ScenicVOExample() {
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

        public Criteria andScenicIdIsNull() {
            addCriterion("Scenic_Id is null");
            return (Criteria) this;
        }

        public Criteria andScenicIdIsNotNull() {
            addCriterion("Scenic_Id is not null");
            return (Criteria) this;
        }

        public Criteria andScenicIdEqualTo(Integer value) {
            addCriterion("Scenic_Id =", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdNotEqualTo(Integer value) {
            addCriterion("Scenic_Id <>", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdGreaterThan(Integer value) {
            addCriterion("Scenic_Id >", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Scenic_Id >=", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdLessThan(Integer value) {
            addCriterion("Scenic_Id <", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdLessThanOrEqualTo(Integer value) {
            addCriterion("Scenic_Id <=", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdIn(List<Integer> values) {
            addCriterion("Scenic_Id in", values, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdNotIn(List<Integer> values) {
            addCriterion("Scenic_Id not in", values, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdBetween(Integer value1, Integer value2) {
            addCriterion("Scenic_Id between", value1, value2, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Scenic_Id not between", value1, value2, "scenicId");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNull() {
            addCriterion("Create_Id is null");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNotNull() {
            addCriterion("Create_Id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateIdEqualTo(Integer value) {
            addCriterion("Create_Id =", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotEqualTo(Integer value) {
            addCriterion("Create_Id <>", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThan(Integer value) {
            addCriterion("Create_Id >", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Create_Id >=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThan(Integer value) {
            addCriterion("Create_Id <", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThanOrEqualTo(Integer value) {
            addCriterion("Create_Id <=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdIn(List<Integer> values) {
            addCriterion("Create_Id in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotIn(List<Integer> values) {
            addCriterion("Create_Id not in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdBetween(Integer value1, Integer value2) {
            addCriterion("Create_Id between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Create_Id not between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("City_Id is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("City_Id is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(Integer value) {
            addCriterion("City_Id =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(Integer value) {
            addCriterion("City_Id <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(Integer value) {
            addCriterion("City_Id >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("City_Id >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(Integer value) {
            addCriterion("City_Id <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(Integer value) {
            addCriterion("City_Id <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<Integer> values) {
            addCriterion("City_Id in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<Integer> values) {
            addCriterion("City_Id not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(Integer value1, Integer value2) {
            addCriterion("City_Id between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("City_Id not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andScenicNameIsNull() {
            addCriterion("Scenic_Name is null");
            return (Criteria) this;
        }

        public Criteria andScenicNameIsNotNull() {
            addCriterion("Scenic_Name is not null");
            return (Criteria) this;
        }

        public Criteria andScenicNameEqualTo(String value) {
            addCriterion("Scenic_Name =", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameNotEqualTo(String value) {
            addCriterion("Scenic_Name <>", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameGreaterThan(String value) {
            addCriterion("Scenic_Name >", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameGreaterThanOrEqualTo(String value) {
            addCriterion("Scenic_Name >=", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameLessThan(String value) {
            addCriterion("Scenic_Name <", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameLessThanOrEqualTo(String value) {
            addCriterion("Scenic_Name <=", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameLike(String value) {
            addCriterion("Scenic_Name like", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameNotLike(String value) {
            addCriterion("Scenic_Name not like", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameIn(List<String> values) {
            addCriterion("Scenic_Name in", values, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameNotIn(List<String> values) {
            addCriterion("Scenic_Name not in", values, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameBetween(String value1, String value2) {
            addCriterion("Scenic_Name between", value1, value2, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameNotBetween(String value1, String value2) {
            addCriterion("Scenic_Name not between", value1, value2, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicPhoneIsNull() {
            addCriterion("Scenic_Phone is null");
            return (Criteria) this;
        }

        public Criteria andScenicPhoneIsNotNull() {
            addCriterion("Scenic_Phone is not null");
            return (Criteria) this;
        }

        public Criteria andScenicPhoneEqualTo(String value) {
            addCriterion("Scenic_Phone =", value, "scenicPhone");
            return (Criteria) this;
        }

        public Criteria andScenicPhoneNotEqualTo(String value) {
            addCriterion("Scenic_Phone <>", value, "scenicPhone");
            return (Criteria) this;
        }

        public Criteria andScenicPhoneGreaterThan(String value) {
            addCriterion("Scenic_Phone >", value, "scenicPhone");
            return (Criteria) this;
        }

        public Criteria andScenicPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("Scenic_Phone >=", value, "scenicPhone");
            return (Criteria) this;
        }

        public Criteria andScenicPhoneLessThan(String value) {
            addCriterion("Scenic_Phone <", value, "scenicPhone");
            return (Criteria) this;
        }

        public Criteria andScenicPhoneLessThanOrEqualTo(String value) {
            addCriterion("Scenic_Phone <=", value, "scenicPhone");
            return (Criteria) this;
        }

        public Criteria andScenicPhoneLike(String value) {
            addCriterion("Scenic_Phone like", value, "scenicPhone");
            return (Criteria) this;
        }

        public Criteria andScenicPhoneNotLike(String value) {
            addCriterion("Scenic_Phone not like", value, "scenicPhone");
            return (Criteria) this;
        }

        public Criteria andScenicPhoneIn(List<String> values) {
            addCriterion("Scenic_Phone in", values, "scenicPhone");
            return (Criteria) this;
        }

        public Criteria andScenicPhoneNotIn(List<String> values) {
            addCriterion("Scenic_Phone not in", values, "scenicPhone");
            return (Criteria) this;
        }

        public Criteria andScenicPhoneBetween(String value1, String value2) {
            addCriterion("Scenic_Phone between", value1, value2, "scenicPhone");
            return (Criteria) this;
        }

        public Criteria andScenicPhoneNotBetween(String value1, String value2) {
            addCriterion("Scenic_Phone not between", value1, value2, "scenicPhone");
            return (Criteria) this;
        }

        public Criteria andScenicWantIsNull() {
            addCriterion("Scenic_Want is null");
            return (Criteria) this;
        }

        public Criteria andScenicWantIsNotNull() {
            addCriterion("Scenic_Want is not null");
            return (Criteria) this;
        }

        public Criteria andScenicWantEqualTo(Integer value) {
            addCriterion("Scenic_Want =", value, "scenicWant");
            return (Criteria) this;
        }

        public Criteria andScenicWantNotEqualTo(Integer value) {
            addCriterion("Scenic_Want <>", value, "scenicWant");
            return (Criteria) this;
        }

        public Criteria andScenicWantGreaterThan(Integer value) {
            addCriterion("Scenic_Want >", value, "scenicWant");
            return (Criteria) this;
        }

        public Criteria andScenicWantGreaterThanOrEqualTo(Integer value) {
            addCriterion("Scenic_Want >=", value, "scenicWant");
            return (Criteria) this;
        }

        public Criteria andScenicWantLessThan(Integer value) {
            addCriterion("Scenic_Want <", value, "scenicWant");
            return (Criteria) this;
        }

        public Criteria andScenicWantLessThanOrEqualTo(Integer value) {
            addCriterion("Scenic_Want <=", value, "scenicWant");
            return (Criteria) this;
        }

        public Criteria andScenicWantIn(List<Integer> values) {
            addCriterion("Scenic_Want in", values, "scenicWant");
            return (Criteria) this;
        }

        public Criteria andScenicWantNotIn(List<Integer> values) {
            addCriterion("Scenic_Want not in", values, "scenicWant");
            return (Criteria) this;
        }

        public Criteria andScenicWantBetween(Integer value1, Integer value2) {
            addCriterion("Scenic_Want between", value1, value2, "scenicWant");
            return (Criteria) this;
        }

        public Criteria andScenicWantNotBetween(Integer value1, Integer value2) {
            addCriterion("Scenic_Want not between", value1, value2, "scenicWant");
            return (Criteria) this;
        }

        public Criteria andScenicLikeIsNull() {
            addCriterion("Scenic_Like is null");
            return (Criteria) this;
        }

        public Criteria andScenicLikeIsNotNull() {
            addCriterion("Scenic_Like is not null");
            return (Criteria) this;
        }

        public Criteria andScenicLikeEqualTo(Integer value) {
            addCriterion("Scenic_Like =", value, "scenicLike");
            return (Criteria) this;
        }

        public Criteria andScenicLikeNotEqualTo(Integer value) {
            addCriterion("Scenic_Like <>", value, "scenicLike");
            return (Criteria) this;
        }

        public Criteria andScenicLikeGreaterThan(Integer value) {
            addCriterion("Scenic_Like >", value, "scenicLike");
            return (Criteria) this;
        }

        public Criteria andScenicLikeGreaterThanOrEqualTo(Integer value) {
            addCriterion("Scenic_Like >=", value, "scenicLike");
            return (Criteria) this;
        }

        public Criteria andScenicLikeLessThan(Integer value) {
            addCriterion("Scenic_Like <", value, "scenicLike");
            return (Criteria) this;
        }

        public Criteria andScenicLikeLessThanOrEqualTo(Integer value) {
            addCriterion("Scenic_Like <=", value, "scenicLike");
            return (Criteria) this;
        }

        public Criteria andScenicLikeIn(List<Integer> values) {
            addCriterion("Scenic_Like in", values, "scenicLike");
            return (Criteria) this;
        }

        public Criteria andScenicLikeNotIn(List<Integer> values) {
            addCriterion("Scenic_Like not in", values, "scenicLike");
            return (Criteria) this;
        }

        public Criteria andScenicLikeBetween(Integer value1, Integer value2) {
            addCriterion("Scenic_Like between", value1, value2, "scenicLike");
            return (Criteria) this;
        }

        public Criteria andScenicLikeNotBetween(Integer value1, Integer value2) {
            addCriterion("Scenic_Like not between", value1, value2, "scenicLike");
            return (Criteria) this;
        }

        public Criteria andScenicTagIsNull() {
            addCriterion("Scenic_Tag is null");
            return (Criteria) this;
        }

        public Criteria andScenicTagIsNotNull() {
            addCriterion("Scenic_Tag is not null");
            return (Criteria) this;
        }

        public Criteria andScenicTagEqualTo(String value) {
            addCriterion("Scenic_Tag =", value, "scenicTag");
            return (Criteria) this;
        }

        public Criteria andScenicTagNotEqualTo(String value) {
            addCriterion("Scenic_Tag <>", value, "scenicTag");
            return (Criteria) this;
        }

        public Criteria andScenicTagGreaterThan(String value) {
            addCriterion("Scenic_Tag >", value, "scenicTag");
            return (Criteria) this;
        }

        public Criteria andScenicTagGreaterThanOrEqualTo(String value) {
            addCriterion("Scenic_Tag >=", value, "scenicTag");
            return (Criteria) this;
        }

        public Criteria andScenicTagLessThan(String value) {
            addCriterion("Scenic_Tag <", value, "scenicTag");
            return (Criteria) this;
        }

        public Criteria andScenicTagLessThanOrEqualTo(String value) {
            addCriterion("Scenic_Tag <=", value, "scenicTag");
            return (Criteria) this;
        }

        public Criteria andScenicTagLike(String value) {
            addCriterion("Scenic_Tag like", value, "scenicTag");
            return (Criteria) this;
        }

        public Criteria andScenicTagNotLike(String value) {
            addCriterion("Scenic_Tag not like", value, "scenicTag");
            return (Criteria) this;
        }

        public Criteria andScenicTagIn(List<String> values) {
            addCriterion("Scenic_Tag in", values, "scenicTag");
            return (Criteria) this;
        }

        public Criteria andScenicTagNotIn(List<String> values) {
            addCriterion("Scenic_Tag not in", values, "scenicTag");
            return (Criteria) this;
        }

        public Criteria andScenicTagBetween(String value1, String value2) {
            addCriterion("Scenic_Tag between", value1, value2, "scenicTag");
            return (Criteria) this;
        }

        public Criteria andScenicTagNotBetween(String value1, String value2) {
            addCriterion("Scenic_Tag not between", value1, value2, "scenicTag");
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