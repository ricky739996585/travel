package com.ricky.travel.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ArticleExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ArticleExample() {
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

        public Criteria andArticleIdIsNull() {
            addCriterion("Article_Id is null");
            return (Criteria) this;
        }

        public Criteria andArticleIdIsNotNull() {
            addCriterion("Article_Id is not null");
            return (Criteria) this;
        }

        public Criteria andArticleIdEqualTo(Integer value) {
            addCriterion("Article_Id =", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotEqualTo(Integer value) {
            addCriterion("Article_Id <>", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThan(Integer value) {
            addCriterion("Article_Id >", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Article_Id >=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThan(Integer value) {
            addCriterion("Article_Id <", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThanOrEqualTo(Integer value) {
            addCriterion("Article_Id <=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdIn(List<Integer> values) {
            addCriterion("Article_Id in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotIn(List<Integer> values) {
            addCriterion("Article_Id not in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdBetween(Integer value1, Integer value2) {
            addCriterion("Article_Id between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Article_Id not between", value1, value2, "articleId");
            return (Criteria) this;
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

        public Criteria andArticleNameIsNull() {
            addCriterion("Article_Name is null");
            return (Criteria) this;
        }

        public Criteria andArticleNameIsNotNull() {
            addCriterion("Article_Name is not null");
            return (Criteria) this;
        }

        public Criteria andArticleNameEqualTo(String value) {
            addCriterion("Article_Name =", value, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleNameNotEqualTo(String value) {
            addCriterion("Article_Name <>", value, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleNameGreaterThan(String value) {
            addCriterion("Article_Name >", value, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleNameGreaterThanOrEqualTo(String value) {
            addCriterion("Article_Name >=", value, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleNameLessThan(String value) {
            addCriterion("Article_Name <", value, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleNameLessThanOrEqualTo(String value) {
            addCriterion("Article_Name <=", value, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleNameLike(String value) {
            addCriterion("Article_Name like", value, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleNameNotLike(String value) {
            addCriterion("Article_Name not like", value, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleNameIn(List<String> values) {
            addCriterion("Article_Name in", values, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleNameNotIn(List<String> values) {
            addCriterion("Article_Name not in", values, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleNameBetween(String value1, String value2) {
            addCriterion("Article_Name between", value1, value2, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleNameNotBetween(String value1, String value2) {
            addCriterion("Article_Name not between", value1, value2, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleDateIsNull() {
            addCriterion("Article_Date is null");
            return (Criteria) this;
        }

        public Criteria andArticleDateIsNotNull() {
            addCriterion("Article_Date is not null");
            return (Criteria) this;
        }

        public Criteria andArticleDateEqualTo(Date value) {
            addCriterionForJDBCDate("Article_Date =", value, "articleDate");
            return (Criteria) this;
        }

        public Criteria andArticleDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("Article_Date <>", value, "articleDate");
            return (Criteria) this;
        }

        public Criteria andArticleDateGreaterThan(Date value) {
            addCriterionForJDBCDate("Article_Date >", value, "articleDate");
            return (Criteria) this;
        }

        public Criteria andArticleDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Article_Date >=", value, "articleDate");
            return (Criteria) this;
        }

        public Criteria andArticleDateLessThan(Date value) {
            addCriterionForJDBCDate("Article_Date <", value, "articleDate");
            return (Criteria) this;
        }

        public Criteria andArticleDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Article_Date <=", value, "articleDate");
            return (Criteria) this;
        }

        public Criteria andArticleDateIn(List<Date> values) {
            addCriterionForJDBCDate("Article_Date in", values, "articleDate");
            return (Criteria) this;
        }

        public Criteria andArticleDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("Article_Date not in", values, "articleDate");
            return (Criteria) this;
        }

        public Criteria andArticleDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Article_Date between", value1, value2, "articleDate");
            return (Criteria) this;
        }

        public Criteria andArticleDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Article_Date not between", value1, value2, "articleDate");
            return (Criteria) this;
        }

        public Criteria andArticleLikeIsNull() {
            addCriterion("Article_Like is null");
            return (Criteria) this;
        }

        public Criteria andArticleLikeIsNotNull() {
            addCriterion("Article_Like is not null");
            return (Criteria) this;
        }

        public Criteria andArticleLikeEqualTo(Integer value) {
            addCriterion("Article_Like =", value, "articleLike");
            return (Criteria) this;
        }

        public Criteria andArticleLikeNotEqualTo(Integer value) {
            addCriterion("Article_Like <>", value, "articleLike");
            return (Criteria) this;
        }

        public Criteria andArticleLikeGreaterThan(Integer value) {
            addCriterion("Article_Like >", value, "articleLike");
            return (Criteria) this;
        }

        public Criteria andArticleLikeGreaterThanOrEqualTo(Integer value) {
            addCriterion("Article_Like >=", value, "articleLike");
            return (Criteria) this;
        }

        public Criteria andArticleLikeLessThan(Integer value) {
            addCriterion("Article_Like <", value, "articleLike");
            return (Criteria) this;
        }

        public Criteria andArticleLikeLessThanOrEqualTo(Integer value) {
            addCriterion("Article_Like <=", value, "articleLike");
            return (Criteria) this;
        }

        public Criteria andArticleLikeIn(List<Integer> values) {
            addCriterion("Article_Like in", values, "articleLike");
            return (Criteria) this;
        }

        public Criteria andArticleLikeNotIn(List<Integer> values) {
            addCriterion("Article_Like not in", values, "articleLike");
            return (Criteria) this;
        }

        public Criteria andArticleLikeBetween(Integer value1, Integer value2) {
            addCriterion("Article_Like between", value1, value2, "articleLike");
            return (Criteria) this;
        }

        public Criteria andArticleLikeNotBetween(Integer value1, Integer value2) {
            addCriterion("Article_Like not between", value1, value2, "articleLike");
            return (Criteria) this;
        }

        public Criteria andArticleTagIsNull() {
            addCriterion("Article_Tag is null");
            return (Criteria) this;
        }

        public Criteria andArticleTagIsNotNull() {
            addCriterion("Article_Tag is not null");
            return (Criteria) this;
        }

        public Criteria andArticleTagEqualTo(String value) {
            addCriterion("Article_Tag =", value, "articleTag");
            return (Criteria) this;
        }

        public Criteria andArticleTagNotEqualTo(String value) {
            addCriterion("Article_Tag <>", value, "articleTag");
            return (Criteria) this;
        }

        public Criteria andArticleTagGreaterThan(String value) {
            addCriterion("Article_Tag >", value, "articleTag");
            return (Criteria) this;
        }

        public Criteria andArticleTagGreaterThanOrEqualTo(String value) {
            addCriterion("Article_Tag >=", value, "articleTag");
            return (Criteria) this;
        }

        public Criteria andArticleTagLessThan(String value) {
            addCriterion("Article_Tag <", value, "articleTag");
            return (Criteria) this;
        }

        public Criteria andArticleTagLessThanOrEqualTo(String value) {
            addCriterion("Article_Tag <=", value, "articleTag");
            return (Criteria) this;
        }

        public Criteria andArticleTagLike(String value) {
            addCriterion("Article_Tag like", value, "articleTag");
            return (Criteria) this;
        }

        public Criteria andArticleTagNotLike(String value) {
            addCriterion("Article_Tag not like", value, "articleTag");
            return (Criteria) this;
        }

        public Criteria andArticleTagIn(List<String> values) {
            addCriterion("Article_Tag in", values, "articleTag");
            return (Criteria) this;
        }

        public Criteria andArticleTagNotIn(List<String> values) {
            addCriterion("Article_Tag not in", values, "articleTag");
            return (Criteria) this;
        }

        public Criteria andArticleTagBetween(String value1, String value2) {
            addCriterion("Article_Tag between", value1, value2, "articleTag");
            return (Criteria) this;
        }

        public Criteria andArticleTagNotBetween(String value1, String value2) {
            addCriterion("Article_Tag not between", value1, value2, "articleTag");
            return (Criteria) this;
        }

        public Criteria andArticlePassIsNull() {
            addCriterion("Article_Pass is null");
            return (Criteria) this;
        }

        public Criteria andArticlePassIsNotNull() {
            addCriterion("Article_Pass is not null");
            return (Criteria) this;
        }

        public Criteria andArticlePassEqualTo(Integer value) {
            addCriterion("Article_Pass =", value, "articlePass");
            return (Criteria) this;
        }

        public Criteria andArticlePassNotEqualTo(Integer value) {
            addCriterion("Article_Pass <>", value, "articlePass");
            return (Criteria) this;
        }

        public Criteria andArticlePassGreaterThan(Integer value) {
            addCriterion("Article_Pass >", value, "articlePass");
            return (Criteria) this;
        }

        public Criteria andArticlePassGreaterThanOrEqualTo(Integer value) {
            addCriterion("Article_Pass >=", value, "articlePass");
            return (Criteria) this;
        }

        public Criteria andArticlePassLessThan(Integer value) {
            addCriterion("Article_Pass <", value, "articlePass");
            return (Criteria) this;
        }

        public Criteria andArticlePassLessThanOrEqualTo(Integer value) {
            addCriterion("Article_Pass <=", value, "articlePass");
            return (Criteria) this;
        }

        public Criteria andArticlePassIn(List<Integer> values) {
            addCriterion("Article_Pass in", values, "articlePass");
            return (Criteria) this;
        }

        public Criteria andArticlePassNotIn(List<Integer> values) {
            addCriterion("Article_Pass not in", values, "articlePass");
            return (Criteria) this;
        }

        public Criteria andArticlePassBetween(Integer value1, Integer value2) {
            addCriterion("Article_Pass between", value1, value2, "articlePass");
            return (Criteria) this;
        }

        public Criteria andArticlePassNotBetween(Integer value1, Integer value2) {
            addCriterion("Article_Pass not between", value1, value2, "articlePass");
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