package com.ricky.travel.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ScenicPhotoExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ScenicPhotoExample() {
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

        public Criteria andScenicPhotoIdIsNull() {
            addCriterion("Scenic_Photo_Id is null");
            return (Criteria) this;
        }

        public Criteria andScenicPhotoIdIsNotNull() {
            addCriterion("Scenic_Photo_Id is not null");
            return (Criteria) this;
        }

        public Criteria andScenicPhotoIdEqualTo(Integer value) {
            addCriterion("Scenic_Photo_Id =", value, "scenicPhotoId");
            return (Criteria) this;
        }

        public Criteria andScenicPhotoIdNotEqualTo(Integer value) {
            addCriterion("Scenic_Photo_Id <>", value, "scenicPhotoId");
            return (Criteria) this;
        }

        public Criteria andScenicPhotoIdGreaterThan(Integer value) {
            addCriterion("Scenic_Photo_Id >", value, "scenicPhotoId");
            return (Criteria) this;
        }

        public Criteria andScenicPhotoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Scenic_Photo_Id >=", value, "scenicPhotoId");
            return (Criteria) this;
        }

        public Criteria andScenicPhotoIdLessThan(Integer value) {
            addCriterion("Scenic_Photo_Id <", value, "scenicPhotoId");
            return (Criteria) this;
        }

        public Criteria andScenicPhotoIdLessThanOrEqualTo(Integer value) {
            addCriterion("Scenic_Photo_Id <=", value, "scenicPhotoId");
            return (Criteria) this;
        }

        public Criteria andScenicPhotoIdIn(List<Integer> values) {
            addCriterion("Scenic_Photo_Id in", values, "scenicPhotoId");
            return (Criteria) this;
        }

        public Criteria andScenicPhotoIdNotIn(List<Integer> values) {
            addCriterion("Scenic_Photo_Id not in", values, "scenicPhotoId");
            return (Criteria) this;
        }

        public Criteria andScenicPhotoIdBetween(Integer value1, Integer value2) {
            addCriterion("Scenic_Photo_Id between", value1, value2, "scenicPhotoId");
            return (Criteria) this;
        }

        public Criteria andScenicPhotoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Scenic_Photo_Id not between", value1, value2, "scenicPhotoId");
            return (Criteria) this;
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

        public Criteria andScenicPhotoDateIsNull() {
            addCriterion("Scenic_Photo_Date is null");
            return (Criteria) this;
        }

        public Criteria andScenicPhotoDateIsNotNull() {
            addCriterion("Scenic_Photo_Date is not null");
            return (Criteria) this;
        }

        public Criteria andScenicPhotoDateEqualTo(Date value) {
            addCriterionForJDBCDate("Scenic_Photo_Date =", value, "scenicPhotoDate");
            return (Criteria) this;
        }

        public Criteria andScenicPhotoDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("Scenic_Photo_Date <>", value, "scenicPhotoDate");
            return (Criteria) this;
        }

        public Criteria andScenicPhotoDateGreaterThan(Date value) {
            addCriterionForJDBCDate("Scenic_Photo_Date >", value, "scenicPhotoDate");
            return (Criteria) this;
        }

        public Criteria andScenicPhotoDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Scenic_Photo_Date >=", value, "scenicPhotoDate");
            return (Criteria) this;
        }

        public Criteria andScenicPhotoDateLessThan(Date value) {
            addCriterionForJDBCDate("Scenic_Photo_Date <", value, "scenicPhotoDate");
            return (Criteria) this;
        }

        public Criteria andScenicPhotoDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Scenic_Photo_Date <=", value, "scenicPhotoDate");
            return (Criteria) this;
        }

        public Criteria andScenicPhotoDateIn(List<Date> values) {
            addCriterionForJDBCDate("Scenic_Photo_Date in", values, "scenicPhotoDate");
            return (Criteria) this;
        }

        public Criteria andScenicPhotoDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("Scenic_Photo_Date not in", values, "scenicPhotoDate");
            return (Criteria) this;
        }

        public Criteria andScenicPhotoDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Scenic_Photo_Date between", value1, value2, "scenicPhotoDate");
            return (Criteria) this;
        }

        public Criteria andScenicPhotoDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Scenic_Photo_Date not between", value1, value2, "scenicPhotoDate");
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