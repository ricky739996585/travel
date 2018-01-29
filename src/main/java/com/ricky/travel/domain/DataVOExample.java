package com.ricky.travel.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DataVOExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public DataVOExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andDataIdIsNull() {
            addCriterion("Data_Id is null");
            return (Criteria) this;
        }

        public Criteria andDataIdIsNotNull() {
            addCriterion("Data_Id is not null");
            return (Criteria) this;
        }

        public Criteria andDataIdEqualTo(Integer value) {
            addCriterion("Data_Id =", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotEqualTo(Integer value) {
            addCriterion("Data_Id <>", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdGreaterThan(Integer value) {
            addCriterion("Data_Id >", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Data_Id >=", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdLessThan(Integer value) {
            addCriterion("Data_Id <", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdLessThanOrEqualTo(Integer value) {
            addCriterion("Data_Id <=", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdIn(List<Integer> values) {
            addCriterion("Data_Id in", values, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotIn(List<Integer> values) {
            addCriterion("Data_Id not in", values, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdBetween(Integer value1, Integer value2) {
            addCriterion("Data_Id between", value1, value2, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Data_Id not between", value1, value2, "dataId");
            return (Criteria) this;
        }

        public Criteria andApplyIdIsNull() {
            addCriterion("Apply_Id is null");
            return (Criteria) this;
        }

        public Criteria andApplyIdIsNotNull() {
            addCriterion("Apply_Id is not null");
            return (Criteria) this;
        }

        public Criteria andApplyIdEqualTo(Integer value) {
            addCriterion("Apply_Id =", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotEqualTo(Integer value) {
            addCriterion("Apply_Id <>", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdGreaterThan(Integer value) {
            addCriterion("Apply_Id >", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Apply_Id >=", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdLessThan(Integer value) {
            addCriterion("Apply_Id <", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdLessThanOrEqualTo(Integer value) {
            addCriterion("Apply_Id <=", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdIn(List<Integer> values) {
            addCriterion("Apply_Id in", values, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotIn(List<Integer> values) {
            addCriterion("Apply_Id not in", values, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdBetween(Integer value1, Integer value2) {
            addCriterion("Apply_Id between", value1, value2, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Apply_Id not between", value1, value2, "applyId");
            return (Criteria) this;
        }

        public Criteria andDataNameIsNull() {
            addCriterion("Data_Name is null");
            return (Criteria) this;
        }

        public Criteria andDataNameIsNotNull() {
            addCriterion("Data_Name is not null");
            return (Criteria) this;
        }

        public Criteria andDataNameEqualTo(String value) {
            addCriterion("Data_Name =", value, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataNameNotEqualTo(String value) {
            addCriterion("Data_Name <>", value, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataNameGreaterThan(String value) {
            addCriterion("Data_Name >", value, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataNameGreaterThanOrEqualTo(String value) {
            addCriterion("Data_Name >=", value, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataNameLessThan(String value) {
            addCriterion("Data_Name <", value, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataNameLessThanOrEqualTo(String value) {
            addCriterion("Data_Name <=", value, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataNameLike(String value) {
            addCriterion("Data_Name like", value, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataNameNotLike(String value) {
            addCriterion("Data_Name not like", value, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataNameIn(List<String> values) {
            addCriterion("Data_Name in", values, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataNameNotIn(List<String> values) {
            addCriterion("Data_Name not in", values, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataNameBetween(String value1, String value2) {
            addCriterion("Data_Name between", value1, value2, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataNameNotBetween(String value1, String value2) {
            addCriterion("Data_Name not between", value1, value2, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataOrganizeIsNull() {
            addCriterion("Data_Organize is null");
            return (Criteria) this;
        }

        public Criteria andDataOrganizeIsNotNull() {
            addCriterion("Data_Organize is not null");
            return (Criteria) this;
        }

        public Criteria andDataOrganizeEqualTo(String value) {
            addCriterion("Data_Organize =", value, "dataOrganize");
            return (Criteria) this;
        }

        public Criteria andDataOrganizeNotEqualTo(String value) {
            addCriterion("Data_Organize <>", value, "dataOrganize");
            return (Criteria) this;
        }

        public Criteria andDataOrganizeGreaterThan(String value) {
            addCriterion("Data_Organize >", value, "dataOrganize");
            return (Criteria) this;
        }

        public Criteria andDataOrganizeGreaterThanOrEqualTo(String value) {
            addCriterion("Data_Organize >=", value, "dataOrganize");
            return (Criteria) this;
        }

        public Criteria andDataOrganizeLessThan(String value) {
            addCriterion("Data_Organize <", value, "dataOrganize");
            return (Criteria) this;
        }

        public Criteria andDataOrganizeLessThanOrEqualTo(String value) {
            addCriterion("Data_Organize <=", value, "dataOrganize");
            return (Criteria) this;
        }

        public Criteria andDataOrganizeLike(String value) {
            addCriterion("Data_Organize like", value, "dataOrganize");
            return (Criteria) this;
        }

        public Criteria andDataOrganizeNotLike(String value) {
            addCriterion("Data_Organize not like", value, "dataOrganize");
            return (Criteria) this;
        }

        public Criteria andDataOrganizeIn(List<String> values) {
            addCriterion("Data_Organize in", values, "dataOrganize");
            return (Criteria) this;
        }

        public Criteria andDataOrganizeNotIn(List<String> values) {
            addCriterion("Data_Organize not in", values, "dataOrganize");
            return (Criteria) this;
        }

        public Criteria andDataOrganizeBetween(String value1, String value2) {
            addCriterion("Data_Organize between", value1, value2, "dataOrganize");
            return (Criteria) this;
        }

        public Criteria andDataOrganizeNotBetween(String value1, String value2) {
            addCriterion("Data_Organize not between", value1, value2, "dataOrganize");
            return (Criteria) this;
        }

        public Criteria andDataStartdateIsNull() {
            addCriterion("Data_StartDate is null");
            return (Criteria) this;
        }

        public Criteria andDataStartdateIsNotNull() {
            addCriterion("Data_StartDate is not null");
            return (Criteria) this;
        }

        public Criteria andDataStartdateEqualTo(Date value) {
            addCriterionForJDBCDate("Data_StartDate =", value, "dataStartdate");
            return (Criteria) this;
        }

        public Criteria andDataStartdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("Data_StartDate <>", value, "dataStartdate");
            return (Criteria) this;
        }

        public Criteria andDataStartdateGreaterThan(Date value) {
            addCriterionForJDBCDate("Data_StartDate >", value, "dataStartdate");
            return (Criteria) this;
        }

        public Criteria andDataStartdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Data_StartDate >=", value, "dataStartdate");
            return (Criteria) this;
        }

        public Criteria andDataStartdateLessThan(Date value) {
            addCriterionForJDBCDate("Data_StartDate <", value, "dataStartdate");
            return (Criteria) this;
        }

        public Criteria andDataStartdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Data_StartDate <=", value, "dataStartdate");
            return (Criteria) this;
        }

        public Criteria andDataStartdateIn(List<Date> values) {
            addCriterionForJDBCDate("Data_StartDate in", values, "dataStartdate");
            return (Criteria) this;
        }

        public Criteria andDataStartdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("Data_StartDate not in", values, "dataStartdate");
            return (Criteria) this;
        }

        public Criteria andDataStartdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Data_StartDate between", value1, value2, "dataStartdate");
            return (Criteria) this;
        }

        public Criteria andDataStartdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Data_StartDate not between", value1, value2, "dataStartdate");
            return (Criteria) this;
        }

        public Criteria andDataEnddateIsNull() {
            addCriterion("Data_EndDate is null");
            return (Criteria) this;
        }

        public Criteria andDataEnddateIsNotNull() {
            addCriterion("Data_EndDate is not null");
            return (Criteria) this;
        }

        public Criteria andDataEnddateEqualTo(Date value) {
            addCriterionForJDBCDate("Data_EndDate =", value, "dataEnddate");
            return (Criteria) this;
        }

        public Criteria andDataEnddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("Data_EndDate <>", value, "dataEnddate");
            return (Criteria) this;
        }

        public Criteria andDataEnddateGreaterThan(Date value) {
            addCriterionForJDBCDate("Data_EndDate >", value, "dataEnddate");
            return (Criteria) this;
        }

        public Criteria andDataEnddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Data_EndDate >=", value, "dataEnddate");
            return (Criteria) this;
        }

        public Criteria andDataEnddateLessThan(Date value) {
            addCriterionForJDBCDate("Data_EndDate <", value, "dataEnddate");
            return (Criteria) this;
        }

        public Criteria andDataEnddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Data_EndDate <=", value, "dataEnddate");
            return (Criteria) this;
        }

        public Criteria andDataEnddateIn(List<Date> values) {
            addCriterionForJDBCDate("Data_EndDate in", values, "dataEnddate");
            return (Criteria) this;
        }

        public Criteria andDataEnddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("Data_EndDate not in", values, "dataEnddate");
            return (Criteria) this;
        }

        public Criteria andDataEnddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Data_EndDate between", value1, value2, "dataEnddate");
            return (Criteria) this;
        }

        public Criteria andDataEnddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Data_EndDate not between", value1, value2, "dataEnddate");
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