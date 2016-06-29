package com.chinasofti.cetp.admin.model;

import java.util.ArrayList;
import java.util.List;

public class MajorExample {
   
    protected String orderByClause;

   
    protected boolean distinct;

   
    protected List<Criteria> oredCriteria;

   
    public MajorExample() {
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

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_major
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_major
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tp_major
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    protected abstract static class GeneratedCriteria {
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

        public Criteria andMajorCodeIsNull() {
            addCriterion("MAJOR_CODE is null");
            return (Criteria) this;
        }

        public Criteria andMajorCodeIsNotNull() {
            addCriterion("MAJOR_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andMajorCodeEqualTo(String value) {
            addCriterion("MAJOR_CODE =", value, "majorCode");
            return (Criteria) this;
        }

        public Criteria andMajorCodeNotEqualTo(String value) {
            addCriterion("MAJOR_CODE <>", value, "majorCode");
            return (Criteria) this;
        }

        public Criteria andMajorCodeGreaterThan(String value) {
            addCriterion("MAJOR_CODE >", value, "majorCode");
            return (Criteria) this;
        }

        public Criteria andMajorCodeGreaterThanOrEqualTo(String value) {
            addCriterion("MAJOR_CODE >=", value, "majorCode");
            return (Criteria) this;
        }

        public Criteria andMajorCodeLessThan(String value) {
            addCriterion("MAJOR_CODE <", value, "majorCode");
            return (Criteria) this;
        }

        public Criteria andMajorCodeLessThanOrEqualTo(String value) {
            addCriterion("MAJOR_CODE <=", value, "majorCode");
            return (Criteria) this;
        }

        public Criteria andMajorCodeLike(String value) {
            addCriterion("MAJOR_CODE like", value, "majorCode");
            return (Criteria) this;
        }

        public Criteria andMajorCodeNotLike(String value) {
            addCriterion("MAJOR_CODE not like", value, "majorCode");
            return (Criteria) this;
        }

        public Criteria andMajorCodeIn(List<String> values) {
            addCriterion("MAJOR_CODE in", values, "majorCode");
            return (Criteria) this;
        }

        public Criteria andMajorCodeNotIn(List<String> values) {
            addCriterion("MAJOR_CODE not in", values, "majorCode");
            return (Criteria) this;
        }

        public Criteria andMajorCodeBetween(String value1, String value2) {
            addCriterion("MAJOR_CODE between", value1, value2, "majorCode");
            return (Criteria) this;
        }

        public Criteria andMajorCodeNotBetween(String value1, String value2) {
            addCriterion("MAJOR_CODE not between", value1, value2, "majorCode");
            return (Criteria) this;
        }

        public Criteria andMajorNameIsNull() {
            addCriterion("MAJOR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMajorNameIsNotNull() {
            addCriterion("MAJOR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMajorNameEqualTo(String value) {
            addCriterion("MAJOR_NAME =", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameNotEqualTo(String value) {
            addCriterion("MAJOR_NAME <>", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameGreaterThan(String value) {
            addCriterion("MAJOR_NAME >", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameGreaterThanOrEqualTo(String value) {
            addCriterion("MAJOR_NAME >=", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameLessThan(String value) {
            addCriterion("MAJOR_NAME <", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameLessThanOrEqualTo(String value) {
            addCriterion("MAJOR_NAME <=", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameLike(String value) {
            addCriterion("MAJOR_NAME like", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameNotLike(String value) {
            addCriterion("MAJOR_NAME not like", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameIn(List<String> values) {
            addCriterion("MAJOR_NAME in", values, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameNotIn(List<String> values) {
            addCriterion("MAJOR_NAME not in", values, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameBetween(String value1, String value2) {
            addCriterion("MAJOR_NAME between", value1, value2, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameNotBetween(String value1, String value2) {
            addCriterion("MAJOR_NAME not between", value1, value2, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorParentIsNull() {
            addCriterion("MAJOR_PARENT is null");
            return (Criteria) this;
        }

        public Criteria andMajorParentIsNotNull() {
            addCriterion("MAJOR_PARENT is not null");
            return (Criteria) this;
        }

        public Criteria andMajorParentEqualTo(String value) {
            addCriterion("MAJOR_PARENT =", value, "majorParent");
            return (Criteria) this;
        }

        public Criteria andMajorParentNotEqualTo(String value) {
            addCriterion("MAJOR_PARENT <>", value, "majorParent");
            return (Criteria) this;
        }

        public Criteria andMajorParentGreaterThan(String value) {
            addCriterion("MAJOR_PARENT >", value, "majorParent");
            return (Criteria) this;
        }

        public Criteria andMajorParentGreaterThanOrEqualTo(String value) {
            addCriterion("MAJOR_PARENT >=", value, "majorParent");
            return (Criteria) this;
        }

        public Criteria andMajorParentLessThan(String value) {
            addCriterion("MAJOR_PARENT <", value, "majorParent");
            return (Criteria) this;
        }

        public Criteria andMajorParentLessThanOrEqualTo(String value) {
            addCriterion("MAJOR_PARENT <=", value, "majorParent");
            return (Criteria) this;
        }

        public Criteria andMajorParentLike(String value) {
            addCriterion("MAJOR_PARENT like", value, "majorParent");
            return (Criteria) this;
        }

        public Criteria andMajorParentNotLike(String value) {
            addCriterion("MAJOR_PARENT not like", value, "majorParent");
            return (Criteria) this;
        }

        public Criteria andMajorParentIn(List<String> values) {
            addCriterion("MAJOR_PARENT in", values, "majorParent");
            return (Criteria) this;
        }

        public Criteria andMajorParentNotIn(List<String> values) {
            addCriterion("MAJOR_PARENT not in", values, "majorParent");
            return (Criteria) this;
        }

        public Criteria andMajorParentBetween(String value1, String value2) {
            addCriterion("MAJOR_PARENT between", value1, value2, "majorParent");
            return (Criteria) this;
        }

        public Criteria andMajorParentNotBetween(String value1, String value2) {
            addCriterion("MAJOR_PARENT not between", value1, value2, "majorParent");
            return (Criteria) this;
        }

        public Criteria andMajorStatusIsNull() {
            addCriterion("MAJOR_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andMajorStatusIsNotNull() {
            addCriterion("MAJOR_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andMajorStatusEqualTo(String value) {
            addCriterion("MAJOR_STATUS =", value, "majorStatus");
            return (Criteria) this;
        }

        public Criteria andMajorStatusNotEqualTo(String value) {
            addCriterion("MAJOR_STATUS <>", value, "majorStatus");
            return (Criteria) this;
        }

        public Criteria andMajorStatusGreaterThan(String value) {
            addCriterion("MAJOR_STATUS >", value, "majorStatus");
            return (Criteria) this;
        }

        public Criteria andMajorStatusGreaterThanOrEqualTo(String value) {
            addCriterion("MAJOR_STATUS >=", value, "majorStatus");
            return (Criteria) this;
        }

        public Criteria andMajorStatusLessThan(String value) {
            addCriterion("MAJOR_STATUS <", value, "majorStatus");
            return (Criteria) this;
        }

        public Criteria andMajorStatusLessThanOrEqualTo(String value) {
            addCriterion("MAJOR_STATUS <=", value, "majorStatus");
            return (Criteria) this;
        }

        public Criteria andMajorStatusLike(String value) {
            addCriterion("MAJOR_STATUS like", value, "majorStatus");
            return (Criteria) this;
        }

        public Criteria andMajorStatusNotLike(String value) {
            addCriterion("MAJOR_STATUS not like", value, "majorStatus");
            return (Criteria) this;
        }

        public Criteria andMajorStatusIn(List<String> values) {
            addCriterion("MAJOR_STATUS in", values, "majorStatus");
            return (Criteria) this;
        }

        public Criteria andMajorStatusNotIn(List<String> values) {
            addCriterion("MAJOR_STATUS not in", values, "majorStatus");
            return (Criteria) this;
        }

        public Criteria andMajorStatusBetween(String value1, String value2) {
            addCriterion("MAJOR_STATUS between", value1, value2, "majorStatus");
            return (Criteria) this;
        }

        public Criteria andMajorStatusNotBetween(String value1, String value2) {
            addCriterion("MAJOR_STATUS not between", value1, value2, "majorStatus");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tp_major
     *
     * @mbggenerated do_not_delete_during_merge Thu Jul 25 19:01:39 CST 2013
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tp_major
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    public static class Criterion {
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