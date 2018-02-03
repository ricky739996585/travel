package com.ricky.travel.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RsUserExample implements Serializable {
    protected String orderByClause;

    private String orderByDirection;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public RsUserExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("User_Id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("User_Id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("User_Id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("User_Id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("User_Id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("User_Id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("User_Id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("User_Id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("User_Id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("User_Id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("User_Id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("User_Id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("User_Phone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("User_Phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("User_Phone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("User_Phone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("User_Phone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("User_Phone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("User_Phone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("User_Phone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("User_Phone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("User_Phone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("User_Phone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("User_Phone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("User_Phone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("User_Phone not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNull() {
            addCriterion("User_Email is null");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNotNull() {
            addCriterion("User_Email is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmailEqualTo(String value) {
            addCriterion("User_Email =", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotEqualTo(String value) {
            addCriterion("User_Email <>", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThan(String value) {
            addCriterion("User_Email >", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("User_Email >=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThan(String value) {
            addCriterion("User_Email <", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThanOrEqualTo(String value) {
            addCriterion("User_Email <=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLike(String value) {
            addCriterion("User_Email like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotLike(String value) {
            addCriterion("User_Email not like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailIn(List<String> values) {
            addCriterion("User_Email in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotIn(List<String> values) {
            addCriterion("User_Email not in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailBetween(String value1, String value2) {
            addCriterion("User_Email between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotBetween(String value1, String value2) {
            addCriterion("User_Email not between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNull() {
            addCriterion("User_Status is null");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNotNull() {
            addCriterion("User_Status is not null");
            return (Criteria) this;
        }

        public Criteria andUserStatusEqualTo(Integer value) {
            addCriterion("User_Status =", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotEqualTo(Integer value) {
            addCriterion("User_Status <>", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThan(Integer value) {
            addCriterion("User_Status >", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("User_Status >=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThan(Integer value) {
            addCriterion("User_Status <", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThanOrEqualTo(Integer value) {
            addCriterion("User_Status <=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusIn(List<Integer> values) {
            addCriterion("User_Status in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotIn(List<Integer> values) {
            addCriterion("User_Status not in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusBetween(Integer value1, Integer value2) {
            addCriterion("User_Status between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("User_Status not between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserLevelIsNull() {
            addCriterion("User_Level is null");
            return (Criteria) this;
        }

        public Criteria andUserLevelIsNotNull() {
            addCriterion("User_Level is not null");
            return (Criteria) this;
        }

        public Criteria andUserLevelEqualTo(Integer value) {
            addCriterion("User_Level =", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotEqualTo(Integer value) {
            addCriterion("User_Level <>", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelGreaterThan(Integer value) {
            addCriterion("User_Level >", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("User_Level >=", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelLessThan(Integer value) {
            addCriterion("User_Level <", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelLessThanOrEqualTo(Integer value) {
            addCriterion("User_Level <=", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelIn(List<Integer> values) {
            addCriterion("User_Level in", values, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotIn(List<Integer> values) {
            addCriterion("User_Level not in", values, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelBetween(Integer value1, Integer value2) {
            addCriterion("User_Level between", value1, value2, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("User_Level not between", value1, value2, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserDateIsNull() {
            addCriterion("User_Date is null");
            return (Criteria) this;
        }

        public Criteria andUserDateIsNotNull() {
            addCriterion("User_Date is not null");
            return (Criteria) this;
        }

        public Criteria andUserDateEqualTo(Date value) {
            addCriterion("User_Date =", value, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateNotEqualTo(Date value) {
            addCriterion("User_Date <>", value, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateGreaterThan(Date value) {
            addCriterion("User_Date >", value, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateGreaterThanOrEqualTo(Date value) {
            addCriterion("User_Date >=", value, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateLessThan(Date value) {
            addCriterion("User_Date <", value, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateLessThanOrEqualTo(Date value) {
            addCriterion("User_Date <=", value, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateIn(List<Date> values) {
            addCriterion("User_Date in", values, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateNotIn(List<Date> values) {
            addCriterion("User_Date not in", values, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateBetween(Date value1, Date value2) {
            addCriterion("User_Date between", value1, value2, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateNotBetween(Date value1, Date value2) {
            addCriterion("User_Date not between", value1, value2, "userDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginIsNull() {
            addCriterion("Last_Login is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginIsNotNull() {
            addCriterion("Last_Login is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginEqualTo(Date value) {
            addCriterion("Last_Login =", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginNotEqualTo(Date value) {
            addCriterion("Last_Login <>", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginGreaterThan(Date value) {
            addCriterion("Last_Login >", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginGreaterThanOrEqualTo(Date value) {
            addCriterion("Last_Login >=", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginLessThan(Date value) {
            addCriterion("Last_Login <", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginLessThanOrEqualTo(Date value) {
            addCriterion("Last_Login <=", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginIn(List<Date> values) {
            addCriterion("Last_Login in", values, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginNotIn(List<Date> values) {
            addCriterion("Last_Login not in", values, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginBetween(Date value1, Date value2) {
            addCriterion("Last_Login between", value1, value2, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginNotBetween(Date value1, Date value2) {
            addCriterion("Last_Login not between", value1, value2, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("User_Name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("User_Name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("User_Name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("User_Name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("User_Name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("User_Name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("User_Name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("User_Name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("User_Name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("User_Name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("User_Name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("User_Name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("User_Name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("User_Name not between", value1, value2, "userName");
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