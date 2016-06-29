package com.chinasofti.cetp.survey.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QuetionaireExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tp_quetionaire
     *
     * @mbggenerated Thu Jul 25 20:01:32 CST 2013
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tp_quetionaire
     *
     * @mbggenerated Thu Jul 25 20:01:32 CST 2013
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tp_quetionaire
     *
     * @mbggenerated Thu Jul 25 20:01:32 CST 2013
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_quetionaire
     *
     * @mbggenerated Thu Jul 25 20:01:32 CST 2013
     */
    public QuetionaireExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_quetionaire
     *
     * @mbggenerated Thu Jul 25 20:01:32 CST 2013
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_quetionaire
     *
     * @mbggenerated Thu Jul 25 20:01:32 CST 2013
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_quetionaire
     *
     * @mbggenerated Thu Jul 25 20:01:32 CST 2013
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_quetionaire
     *
     * @mbggenerated Thu Jul 25 20:01:32 CST 2013
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_quetionaire
     *
     * @mbggenerated Thu Jul 25 20:01:32 CST 2013
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_quetionaire
     *
     * @mbggenerated Thu Jul 25 20:01:32 CST 2013
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_quetionaire
     *
     * @mbggenerated Thu Jul 25 20:01:32 CST 2013
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_quetionaire
     *
     * @mbggenerated Thu Jul 25 20:01:32 CST 2013
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
     * This method corresponds to the database table tp_quetionaire
     *
     * @mbggenerated Thu Jul 25 20:01:32 CST 2013
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_quetionaire
     *
     * @mbggenerated Thu Jul 25 20:01:32 CST 2013
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tp_quetionaire
     *
     * @mbggenerated Thu Jul 25 20:01:32 CST 2013
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

        public Criteria andQaIdIsNull() {
            addCriterion("QA_ID is null");
            return (Criteria) this;
        }

        public Criteria andQaIdIsNotNull() {
            addCriterion("QA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andQaIdEqualTo(Integer value) {
            addCriterion("QA_ID =", value, "qaId");
            return (Criteria) this;
        }

        public Criteria andQaIdNotEqualTo(Integer value) {
            addCriterion("QA_ID <>", value, "qaId");
            return (Criteria) this;
        }

        public Criteria andQaIdGreaterThan(Integer value) {
            addCriterion("QA_ID >", value, "qaId");
            return (Criteria) this;
        }

        public Criteria andQaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("QA_ID >=", value, "qaId");
            return (Criteria) this;
        }

        public Criteria andQaIdLessThan(Integer value) {
            addCriterion("QA_ID <", value, "qaId");
            return (Criteria) this;
        }

        public Criteria andQaIdLessThanOrEqualTo(Integer value) {
            addCriterion("QA_ID <=", value, "qaId");
            return (Criteria) this;
        }

        public Criteria andQaIdIn(List<Integer> values) {
            addCriterion("QA_ID in", values, "qaId");
            return (Criteria) this;
        }

        public Criteria andQaIdNotIn(List<Integer> values) {
            addCriterion("QA_ID not in", values, "qaId");
            return (Criteria) this;
        }

        public Criteria andQaIdBetween(Integer value1, Integer value2) {
            addCriterion("QA_ID between", value1, value2, "qaId");
            return (Criteria) this;
        }

        public Criteria andQaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("QA_ID not between", value1, value2, "qaId");
            return (Criteria) this;
        }

        public Criteria andQaPropIsNull() {
            addCriterion("QA_PROP is null");
            return (Criteria) this;
        }

        public Criteria andQaPropIsNotNull() {
            addCriterion("QA_PROP is not null");
            return (Criteria) this;
        }

        public Criteria andQaPropEqualTo(String value) {
            addCriterion("QA_PROP =", value, "qaProp");
            return (Criteria) this;
        }

        public Criteria andQaPropNotEqualTo(String value) {
            addCriterion("QA_PROP <>", value, "qaProp");
            return (Criteria) this;
        }

        public Criteria andQaPropGreaterThan(String value) {
            addCriterion("QA_PROP >", value, "qaProp");
            return (Criteria) this;
        }

        public Criteria andQaPropGreaterThanOrEqualTo(String value) {
            addCriterion("QA_PROP >=", value, "qaProp");
            return (Criteria) this;
        }

        public Criteria andQaPropLessThan(String value) {
            addCriterion("QA_PROP <", value, "qaProp");
            return (Criteria) this;
        }

        public Criteria andQaPropLessThanOrEqualTo(String value) {
            addCriterion("QA_PROP <=", value, "qaProp");
            return (Criteria) this;
        }

        public Criteria andQaPropLike(String value) {
            addCriterion("QA_PROP like", value, "qaProp");
            return (Criteria) this;
        }

        public Criteria andQaPropNotLike(String value) {
            addCriterion("QA_PROP not like", value, "qaProp");
            return (Criteria) this;
        }

        public Criteria andQaPropIn(List<String> values) {
            addCriterion("QA_PROP in", values, "qaProp");
            return (Criteria) this;
        }

        public Criteria andQaPropNotIn(List<String> values) {
            addCriterion("QA_PROP not in", values, "qaProp");
            return (Criteria) this;
        }

        public Criteria andQaPropBetween(String value1, String value2) {
            addCriterion("QA_PROP between", value1, value2, "qaProp");
            return (Criteria) this;
        }

        public Criteria andQaPropNotBetween(String value1, String value2) {
            addCriterion("QA_PROP not between", value1, value2, "qaProp");
            return (Criteria) this;
        }

        public Criteria andQaTypeIsNull() {
            addCriterion("QA_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andQaTypeIsNotNull() {
            addCriterion("QA_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andQaTypeEqualTo(String value) {
            addCriterion("QA_TYPE =", value, "qaType");
            return (Criteria) this;
        }

        public Criteria andQaTypeNotEqualTo(String value) {
            addCriterion("QA_TYPE <>", value, "qaType");
            return (Criteria) this;
        }

        public Criteria andQaTypeGreaterThan(String value) {
            addCriterion("QA_TYPE >", value, "qaType");
            return (Criteria) this;
        }

        public Criteria andQaTypeGreaterThanOrEqualTo(String value) {
            addCriterion("QA_TYPE >=", value, "qaType");
            return (Criteria) this;
        }

        public Criteria andQaTypeLessThan(String value) {
            addCriterion("QA_TYPE <", value, "qaType");
            return (Criteria) this;
        }

        public Criteria andQaTypeLessThanOrEqualTo(String value) {
            addCriterion("QA_TYPE <=", value, "qaType");
            return (Criteria) this;
        }

        public Criteria andQaTypeLike(String value) {
            addCriterion("QA_TYPE like", value, "qaType");
            return (Criteria) this;
        }

        public Criteria andQaTypeNotLike(String value) {
            addCriterion("QA_TYPE not like", value, "qaType");
            return (Criteria) this;
        }

        public Criteria andQaTypeIn(List<String> values) {
            addCriterion("QA_TYPE in", values, "qaType");
            return (Criteria) this;
        }

        public Criteria andQaTypeNotIn(List<String> values) {
            addCriterion("QA_TYPE not in", values, "qaType");
            return (Criteria) this;
        }

        public Criteria andQaTypeBetween(String value1, String value2) {
            addCriterion("QA_TYPE between", value1, value2, "qaType");
            return (Criteria) this;
        }

        public Criteria andQaTypeNotBetween(String value1, String value2) {
            addCriterion("QA_TYPE not between", value1, value2, "qaType");
            return (Criteria) this;
        }

        public Criteria andQaTitleLike(String value) {
            addCriterion("QA_TITLE like", value, "qaTitle");
            return (Criteria) this;
        }
        
        public Criteria andQaEnableIsNull() {
            addCriterion("QA_ENABLE is null");
            return (Criteria) this;
        }

        public Criteria andQaEnableIsNotNull() {
            addCriterion("QA_ENABLE is not null");
            return (Criteria) this;
        }

        public Criteria andQaEnableEqualTo(String value) {
            addCriterion("QA_ENABLE =", value, "qaEnable");
            return (Criteria) this;
        }

        public Criteria andQaEnableNotEqualTo(String value) {
            addCriterion("QA_ENABLE <>", value, "qaEnable");
            return (Criteria) this;
        }

        public Criteria andQaEnableGreaterThan(String value) {
            addCriterion("QA_ENABLE >", value, "qaEnable");
            return (Criteria) this;
        }

        public Criteria andQaEnableGreaterThanOrEqualTo(String value) {
            addCriterion("QA_ENABLE >=", value, "qaEnable");
            return (Criteria) this;
        }

        public Criteria andQaEnableLessThan(String value) {
            addCriterion("QA_ENABLE <", value, "qaEnable");
            return (Criteria) this;
        }

        public Criteria andQaEnableLessThanOrEqualTo(String value) {
            addCriterion("QA_ENABLE <=", value, "qaEnable");
            return (Criteria) this;
        }

        public Criteria andQaEnableLike(String value) {
            addCriterion("QA_ENABLE like", value, "qaEnable");
            return (Criteria) this;
        }

        public Criteria andQaEnableNotLike(String value) {
            addCriterion("QA_ENABLE not like", value, "qaEnable");
            return (Criteria) this;
        }

        public Criteria andQaEnableIn(List<String> values) {
            addCriterion("QA_ENABLE in", values, "qaEnable");
            return (Criteria) this;
        }

        public Criteria andQaEnableNotIn(List<String> values) {
            addCriterion("QA_ENABLE not in", values, "qaEnable");
            return (Criteria) this;
        }

        public Criteria andQaEnableBetween(String value1, String value2) {
            addCriterion("QA_ENABLE between", value1, value2, "qaEnable");
            return (Criteria) this;
        }

        public Criteria andQaEnableNotBetween(String value1, String value2) {
            addCriterion("QA_ENABLE not between", value1, value2, "qaEnable");
            return (Criteria) this;
        }

        public Criteria andQaUserNoIsNull() {
            addCriterion("QA_USER_NO is null");
            return (Criteria) this;
        }

        public Criteria andQaUserNoIsNotNull() {
            addCriterion("QA_USER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andQaUserNoEqualTo(Integer value) {
            addCriterion("QA_USER_NO =", value, "qaUserNo");
            return (Criteria) this;
        }

        public Criteria andQaUserNoNotEqualTo(Integer value) {
            addCriterion("QA_USER_NO <>", value, "qaUserNo");
            return (Criteria) this;
        }

        public Criteria andQaUserNoGreaterThan(Integer value) {
            addCriterion("QA_USER_NO >", value, "qaUserNo");
            return (Criteria) this;
        }

        public Criteria andQaUserNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("QA_USER_NO >=", value, "qaUserNo");
            return (Criteria) this;
        }

        public Criteria andQaUserNoLessThan(Integer value) {
            addCriterion("QA_USER_NO <", value, "qaUserNo");
            return (Criteria) this;
        }

        public Criteria andQaUserNoLessThanOrEqualTo(Integer value) {
            addCriterion("QA_USER_NO <=", value, "qaUserNo");
            return (Criteria) this;
        }

        public Criteria andQaUserNoIn(List<Integer> values) {
            addCriterion("QA_USER_NO in", values, "qaUserNo");
            return (Criteria) this;
        }

        public Criteria andQaUserNoNotIn(List<Integer> values) {
            addCriterion("QA_USER_NO not in", values, "qaUserNo");
            return (Criteria) this;
        }

        public Criteria andQaUserNoBetween(Integer value1, Integer value2) {
            addCriterion("QA_USER_NO between", value1, value2, "qaUserNo");
            return (Criteria) this;
        }

        public Criteria andQaUserNoNotBetween(Integer value1, Integer value2) {
            addCriterion("QA_USER_NO not between", value1, value2, "qaUserNo");
            return (Criteria) this;
        }

        public Criteria andQaRegtimeIsNull() {
            addCriterion("QA_REGTIME is null");
            return (Criteria) this;
        }

        public Criteria andQaRegtimeIsNotNull() {
            addCriterion("QA_REGTIME is not null");
            return (Criteria) this;
        }

        public Criteria andQaRegtimeEqualTo(Date value) {
            addCriterion("QA_REGTIME =", value, "qaRegtime");
            return (Criteria) this;
        }

        public Criteria andQaRegtimeNotEqualTo(Date value) {
            addCriterion("QA_REGTIME <>", value, "qaRegtime");
            return (Criteria) this;
        }

        public Criteria andQaRegtimeGreaterThan(Date value) {
            addCriterion("QA_REGTIME >", value, "qaRegtime");
            return (Criteria) this;
        }

        public Criteria andQaRegtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("QA_REGTIME >=", value, "qaRegtime");
            return (Criteria) this;
        }

        public Criteria andQaRegtimeLessThan(Date value) {
            addCriterion("QA_REGTIME <", value, "qaRegtime");
            return (Criteria) this;
        }

        public Criteria andQaRegtimeLessThanOrEqualTo(Date value) {
            addCriterion("QA_REGTIME <=", value, "qaRegtime");
            return (Criteria) this;
        }

        public Criteria andQaRegtimeIn(List<Date> values) {
            addCriterion("QA_REGTIME in", values, "qaRegtime");
            return (Criteria) this;
        }

        public Criteria andQaRegtimeNotIn(List<Date> values) {
            addCriterion("QA_REGTIME not in", values, "qaRegtime");
            return (Criteria) this;
        }

        public Criteria andQaRegtimeBetween(Date value1, Date value2) {
            addCriterion("QA_REGTIME between", value1, value2, "qaRegtime");
            return (Criteria) this;
        }

        public Criteria andQaRegtimeNotBetween(Date value1, Date value2) {
            addCriterion("QA_REGTIME not between", value1, value2, "qaRegtime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tp_quetionaire
     *
     * @mbggenerated do_not_delete_during_merge Thu Jul 25 20:01:32 CST 2013
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tp_quetionaire
     *
     * @mbggenerated Thu Jul 25 20:01:32 CST 2013
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