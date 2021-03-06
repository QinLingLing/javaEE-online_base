package com.chinasofti.cetp.ability.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProfessionPabilityExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tp_profession_pability
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tp_profession_pability
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tp_profession_pability
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_profession_pability
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    public ProfessionPabilityExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_profession_pability
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_profession_pability
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_profession_pability
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_profession_pability
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_profession_pability
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_profession_pability
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_profession_pability
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_profession_pability
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_profession_pability
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_profession_pability
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tp_profession_pability
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
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

        public Criteria andProfIdIsNull() {
            addCriterion("PROF_ID is null");
            return (Criteria) this;
        }

        public Criteria andProfIdIsNotNull() {
            addCriterion("PROF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProfIdEqualTo(Integer value) {
            addCriterion("PROF_ID =", value, "profId");
            return (Criteria) this;
        }

        public Criteria andProfIdNotEqualTo(Integer value) {
            addCriterion("PROF_ID <>", value, "profId");
            return (Criteria) this;
        }

        public Criteria andProfIdGreaterThan(Integer value) {
            addCriterion("PROF_ID >", value, "profId");
            return (Criteria) this;
        }

        public Criteria andProfIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PROF_ID >=", value, "profId");
            return (Criteria) this;
        }

        public Criteria andProfIdLessThan(Integer value) {
            addCriterion("PROF_ID <", value, "profId");
            return (Criteria) this;
        }

        public Criteria andProfIdLessThanOrEqualTo(Integer value) {
            addCriterion("PROF_ID <=", value, "profId");
            return (Criteria) this;
        }

        public Criteria andProfIdIn(List<Integer> values) {
            addCriterion("PROF_ID in", values, "profId");
            return (Criteria) this;
        }

        public Criteria andProfIdNotIn(List<Integer> values) {
            addCriterion("PROF_ID not in", values, "profId");
            return (Criteria) this;
        }

        public Criteria andProfIdBetween(Integer value1, Integer value2) {
            addCriterion("PROF_ID between", value1, value2, "profId");
            return (Criteria) this;
        }

        public Criteria andProfIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PROF_ID not between", value1, value2, "profId");
            return (Criteria) this;
        }

        public Criteria andPapiPabIdIsNull() {
            addCriterion("PAPI_PAB_ID is null");
            return (Criteria) this;
        }

        public Criteria andPapiPabIdIsNotNull() {
            addCriterion("PAPI_PAB_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPapiPabIdEqualTo(Integer value) {
            addCriterion("PAPI_PAB_ID =", value, "papiPabId");
            return (Criteria) this;
        }

        public Criteria andPapiPabIdNotEqualTo(Integer value) {
            addCriterion("PAPI_PAB_ID <>", value, "papiPabId");
            return (Criteria) this;
        }

        public Criteria andPapiPabIdGreaterThan(Integer value) {
            addCriterion("PAPI_PAB_ID >", value, "papiPabId");
            return (Criteria) this;
        }

        public Criteria andPapiPabIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PAPI_PAB_ID >=", value, "papiPabId");
            return (Criteria) this;
        }

        public Criteria andPapiPabIdLessThan(Integer value) {
            addCriterion("PAPI_PAB_ID <", value, "papiPabId");
            return (Criteria) this;
        }

        public Criteria andPapiPabIdLessThanOrEqualTo(Integer value) {
            addCriterion("PAPI_PAB_ID <=", value, "papiPabId");
            return (Criteria) this;
        }

        public Criteria andPapiPabIdIn(List<Integer> values) {
            addCriterion("PAPI_PAB_ID in", values, "papiPabId");
            return (Criteria) this;
        }

        public Criteria andPapiPabIdNotIn(List<Integer> values) {
            addCriterion("PAPI_PAB_ID not in", values, "papiPabId");
            return (Criteria) this;
        }

        public Criteria andPapiPabIdBetween(Integer value1, Integer value2) {
            addCriterion("PAPI_PAB_ID between", value1, value2, "papiPabId");
            return (Criteria) this;
        }

        public Criteria andPapiPabIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PAPI_PAB_ID not between", value1, value2, "papiPabId");
            return (Criteria) this;
        }

        public Criteria andPapiRegtimeIsNull() {
            addCriterion("PAPI_REGTIME is null");
            return (Criteria) this;
        }

        public Criteria andPapiRegtimeIsNotNull() {
            addCriterion("PAPI_REGTIME is not null");
            return (Criteria) this;
        }

        public Criteria andPapiRegtimeEqualTo(Date value) {
            addCriterion("PAPI_REGTIME =", value, "papiRegtime");
            return (Criteria) this;
        }

        public Criteria andPapiRegtimeNotEqualTo(Date value) {
            addCriterion("PAPI_REGTIME <>", value, "papiRegtime");
            return (Criteria) this;
        }

        public Criteria andPapiRegtimeGreaterThan(Date value) {
            addCriterion("PAPI_REGTIME >", value, "papiRegtime");
            return (Criteria) this;
        }

        public Criteria andPapiRegtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PAPI_REGTIME >=", value, "papiRegtime");
            return (Criteria) this;
        }

        public Criteria andPapiRegtimeLessThan(Date value) {
            addCriterion("PAPI_REGTIME <", value, "papiRegtime");
            return (Criteria) this;
        }

        public Criteria andPapiRegtimeLessThanOrEqualTo(Date value) {
            addCriterion("PAPI_REGTIME <=", value, "papiRegtime");
            return (Criteria) this;
        }

        public Criteria andPapiRegtimeIn(List<Date> values) {
            addCriterion("PAPI_REGTIME in", values, "papiRegtime");
            return (Criteria) this;
        }

        public Criteria andPapiRegtimeNotIn(List<Date> values) {
            addCriterion("PAPI_REGTIME not in", values, "papiRegtime");
            return (Criteria) this;
        }

        public Criteria andPapiRegtimeBetween(Date value1, Date value2) {
            addCriterion("PAPI_REGTIME between", value1, value2, "papiRegtime");
            return (Criteria) this;
        }

        public Criteria andPapiRegtimeNotBetween(Date value1, Date value2) {
            addCriterion("PAPI_REGTIME not between", value1, value2, "papiRegtime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tp_profession_pability
     *
     * @mbggenerated do_not_delete_during_merge Fri Aug 09 09:51:47 CST 2013
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tp_profession_pability
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
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