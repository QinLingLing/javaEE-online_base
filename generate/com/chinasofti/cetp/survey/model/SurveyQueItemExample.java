package com.chinasofti.cetp.survey.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SurveyQueItemExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tp_survey_que_item
     *
     * @mbggenerated Thu Jul 25 20:01:32 CST 2013
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tp_survey_que_item
     *
     * @mbggenerated Thu Jul 25 20:01:32 CST 2013
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tp_survey_que_item
     *
     * @mbggenerated Thu Jul 25 20:01:32 CST 2013
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_survey_que_item
     *
     * @mbggenerated Thu Jul 25 20:01:32 CST 2013
     */
    public SurveyQueItemExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_survey_que_item
     *
     * @mbggenerated Thu Jul 25 20:01:32 CST 2013
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_survey_que_item
     *
     * @mbggenerated Thu Jul 25 20:01:32 CST 2013
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_survey_que_item
     *
     * @mbggenerated Thu Jul 25 20:01:32 CST 2013
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_survey_que_item
     *
     * @mbggenerated Thu Jul 25 20:01:32 CST 2013
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_survey_que_item
     *
     * @mbggenerated Thu Jul 25 20:01:32 CST 2013
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_survey_que_item
     *
     * @mbggenerated Thu Jul 25 20:01:32 CST 2013
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_survey_que_item
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
     * This method corresponds to the database table tp_survey_que_item
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
     * This method corresponds to the database table tp_survey_que_item
     *
     * @mbggenerated Thu Jul 25 20:01:32 CST 2013
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_survey_que_item
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
     * This class corresponds to the database table tp_survey_que_item
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

        public Criteria andSqiIdIsNull() {
            addCriterion("SQI_ID is null");
            return (Criteria) this;
        }

        public Criteria andSqiIdIsNotNull() {
            addCriterion("SQI_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSqiIdEqualTo(Integer value) {
            addCriterion("SQI_ID =", value, "sqiId");
            return (Criteria) this;
        }

        public Criteria andSqiIdNotEqualTo(Integer value) {
            addCriterion("SQI_ID <>", value, "sqiId");
            return (Criteria) this;
        }

        public Criteria andSqiIdGreaterThan(Integer value) {
            addCriterion("SQI_ID >", value, "sqiId");
            return (Criteria) this;
        }

        public Criteria andSqiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SQI_ID >=", value, "sqiId");
            return (Criteria) this;
        }

        public Criteria andSqiIdLessThan(Integer value) {
            addCriterion("SQI_ID <", value, "sqiId");
            return (Criteria) this;
        }

        public Criteria andSqiIdLessThanOrEqualTo(Integer value) {
            addCriterion("SQI_ID <=", value, "sqiId");
            return (Criteria) this;
        }

        public Criteria andSqiIdIn(List<Integer> values) {
            addCriterion("SQI_ID in", values, "sqiId");
            return (Criteria) this;
        }

        public Criteria andSqiIdNotIn(List<Integer> values) {
            addCriterion("SQI_ID not in", values, "sqiId");
            return (Criteria) this;
        }

        public Criteria andSqiIdBetween(Integer value1, Integer value2) {
            addCriterion("SQI_ID between", value1, value2, "sqiId");
            return (Criteria) this;
        }

        public Criteria andSqiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SQI_ID not between", value1, value2, "sqiId");
            return (Criteria) this;
        }

        public Criteria andSqiQaIdIsNull() {
            addCriterion("SQI_QA_ID is null");
            return (Criteria) this;
        }

        public Criteria andSqiQaIdIsNotNull() {
            addCriterion("SQI_QA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSqiQaIdEqualTo(Integer value) {
            addCriterion("SQI_QA_ID =", value, "sqiQaId");
            return (Criteria) this;
        }

        public Criteria andSqiQaIdNotEqualTo(Integer value) {
            addCriterion("SQI_QA_ID <>", value, "sqiQaId");
            return (Criteria) this;
        }

        public Criteria andSqiQaIdGreaterThan(Integer value) {
            addCriterion("SQI_QA_ID >", value, "sqiQaId");
            return (Criteria) this;
        }

        public Criteria andSqiQaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SQI_QA_ID >=", value, "sqiQaId");
            return (Criteria) this;
        }

        public Criteria andSqiQaIdLessThan(Integer value) {
            addCriterion("SQI_QA_ID <", value, "sqiQaId");
            return (Criteria) this;
        }

        public Criteria andSqiQaIdLessThanOrEqualTo(Integer value) {
            addCriterion("SQI_QA_ID <=", value, "sqiQaId");
            return (Criteria) this;
        }

        public Criteria andSqiQaIdIn(List<Integer> values) {
            addCriterion("SQI_QA_ID in", values, "sqiQaId");
            return (Criteria) this;
        }

        public Criteria andSqiQaIdNotIn(List<Integer> values) {
            addCriterion("SQI_QA_ID not in", values, "sqiQaId");
            return (Criteria) this;
        }

        public Criteria andSqiQaIdBetween(Integer value1, Integer value2) {
            addCriterion("SQI_QA_ID between", value1, value2, "sqiQaId");
            return (Criteria) this;
        }

        public Criteria andSqiQaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SQI_QA_ID not between", value1, value2, "sqiQaId");
            return (Criteria) this;
        }

        public Criteria andSqiContentIsNull() {
            addCriterion("SQI_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andSqiContentIsNotNull() {
            addCriterion("SQI_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andSqiContentEqualTo(String value) {
            addCriterion("SQI_CONTENT =", value, "sqiContent");
            return (Criteria) this;
        }

        public Criteria andSqiContentNotEqualTo(String value) {
            addCriterion("SQI_CONTENT <>", value, "sqiContent");
            return (Criteria) this;
        }

        public Criteria andSqiContentGreaterThan(String value) {
            addCriterion("SQI_CONTENT >", value, "sqiContent");
            return (Criteria) this;
        }

        public Criteria andSqiContentGreaterThanOrEqualTo(String value) {
            addCriterion("SQI_CONTENT >=", value, "sqiContent");
            return (Criteria) this;
        }

        public Criteria andSqiContentLessThan(String value) {
            addCriterion("SQI_CONTENT <", value, "sqiContent");
            return (Criteria) this;
        }

        public Criteria andSqiContentLessThanOrEqualTo(String value) {
            addCriterion("SQI_CONTENT <=", value, "sqiContent");
            return (Criteria) this;
        }

        public Criteria andSqiContentLike(String value) {
            addCriterion("SQI_CONTENT like", value, "sqiContent");
            return (Criteria) this;
        }

        public Criteria andSqiContentNotLike(String value) {
            addCriterion("SQI_CONTENT not like", value, "sqiContent");
            return (Criteria) this;
        }

        public Criteria andSqiContentIn(List<String> values) {
            addCriterion("SQI_CONTENT in", values, "sqiContent");
            return (Criteria) this;
        }

        public Criteria andSqiContentNotIn(List<String> values) {
            addCriterion("SQI_CONTENT not in", values, "sqiContent");
            return (Criteria) this;
        }

        public Criteria andSqiContentBetween(String value1, String value2) {
            addCriterion("SQI_CONTENT between", value1, value2, "sqiContent");
            return (Criteria) this;
        }

        public Criteria andSqiContentNotBetween(String value1, String value2) {
            addCriterion("SQI_CONTENT not between", value1, value2, "sqiContent");
            return (Criteria) this;
        }

        public Criteria andSqiPercentIsNull() {
            addCriterion("SQI_PERCENT is null");
            return (Criteria) this;
        }

        public Criteria andSqiPercentIsNotNull() {
            addCriterion("SQI_PERCENT is not null");
            return (Criteria) this;
        }

        public Criteria andSqiPercentEqualTo(Double value) {
            addCriterion("SQI_PERCENT =", value, "sqiPercent");
            return (Criteria) this;
        }

        public Criteria andSqiPercentNotEqualTo(Double value) {
            addCriterion("SQI_PERCENT <>", value, "sqiPercent");
            return (Criteria) this;
        }

        public Criteria andSqiPercentGreaterThan(Double value) {
            addCriterion("SQI_PERCENT >", value, "sqiPercent");
            return (Criteria) this;
        }

        public Criteria andSqiPercentGreaterThanOrEqualTo(Double value) {
            addCriterion("SQI_PERCENT >=", value, "sqiPercent");
            return (Criteria) this;
        }

        public Criteria andSqiPercentLessThan(Double value) {
            addCriterion("SQI_PERCENT <", value, "sqiPercent");
            return (Criteria) this;
        }

        public Criteria andSqiPercentLessThanOrEqualTo(Double value) {
            addCriterion("SQI_PERCENT <=", value, "sqiPercent");
            return (Criteria) this;
        }

        public Criteria andSqiPercentIn(List<Double> values) {
            addCriterion("SQI_PERCENT in", values, "sqiPercent");
            return (Criteria) this;
        }

        public Criteria andSqiPercentNotIn(List<Double> values) {
            addCriterion("SQI_PERCENT not in", values, "sqiPercent");
            return (Criteria) this;
        }

        public Criteria andSqiPercentBetween(Double value1, Double value2) {
            addCriterion("SQI_PERCENT between", value1, value2, "sqiPercent");
            return (Criteria) this;
        }

        public Criteria andSqiPercentNotBetween(Double value1, Double value2) {
            addCriterion("SQI_PERCENT not between", value1, value2, "sqiPercent");
            return (Criteria) this;
        }

        public Criteria andSqiPropIsNull() {
            addCriterion("SQI_PROP is null");
            return (Criteria) this;
        }

        public Criteria andSqiPropIsNotNull() {
            addCriterion("SQI_PROP is not null");
            return (Criteria) this;
        }

        public Criteria andSqiPropEqualTo(String value) {
            addCriterion("SQI_PROP =", value, "sqiProp");
            return (Criteria) this;
        }

        public Criteria andSqiPropNotEqualTo(String value) {
            addCriterion("SQI_PROP <>", value, "sqiProp");
            return (Criteria) this;
        }

        public Criteria andSqiPropGreaterThan(String value) {
            addCriterion("SQI_PROP >", value, "sqiProp");
            return (Criteria) this;
        }

        public Criteria andSqiPropGreaterThanOrEqualTo(String value) {
            addCriterion("SQI_PROP >=", value, "sqiProp");
            return (Criteria) this;
        }

        public Criteria andSqiPropLessThan(String value) {
            addCriterion("SQI_PROP <", value, "sqiProp");
            return (Criteria) this;
        }

        public Criteria andSqiPropLessThanOrEqualTo(String value) {
            addCriterion("SQI_PROP <=", value, "sqiProp");
            return (Criteria) this;
        }

        public Criteria andSqiPropLike(String value) {
            addCriterion("SQI_PROP like", value, "sqiProp");
            return (Criteria) this;
        }

        public Criteria andSqiPropNotLike(String value) {
            addCriterion("SQI_PROP not like", value, "sqiProp");
            return (Criteria) this;
        }

        public Criteria andSqiPropIn(List<String> values) {
            addCriterion("SQI_PROP in", values, "sqiProp");
            return (Criteria) this;
        }

        public Criteria andSqiPropNotIn(List<String> values) {
            addCriterion("SQI_PROP not in", values, "sqiProp");
            return (Criteria) this;
        }

        public Criteria andSqiPropBetween(String value1, String value2) {
            addCriterion("SQI_PROP between", value1, value2, "sqiProp");
            return (Criteria) this;
        }

        public Criteria andSqiPropNotBetween(String value1, String value2) {
            addCriterion("SQI_PROP not between", value1, value2, "sqiProp");
            return (Criteria) this;
        }

        public Criteria andSqiRegtimeIsNull() {
            addCriterion("SQI_REGTIME is null");
            return (Criteria) this;
        }

        public Criteria andSqiRegtimeIsNotNull() {
            addCriterion("SQI_REGTIME is not null");
            return (Criteria) this;
        }

        public Criteria andSqiRegtimeEqualTo(Date value) {
            addCriterion("SQI_REGTIME =", value, "sqiRegtime");
            return (Criteria) this;
        }

        public Criteria andSqiRegtimeNotEqualTo(Date value) {
            addCriterion("SQI_REGTIME <>", value, "sqiRegtime");
            return (Criteria) this;
        }

        public Criteria andSqiRegtimeGreaterThan(Date value) {
            addCriterion("SQI_REGTIME >", value, "sqiRegtime");
            return (Criteria) this;
        }

        public Criteria andSqiRegtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SQI_REGTIME >=", value, "sqiRegtime");
            return (Criteria) this;
        }

        public Criteria andSqiRegtimeLessThan(Date value) {
            addCriterion("SQI_REGTIME <", value, "sqiRegtime");
            return (Criteria) this;
        }

        public Criteria andSqiRegtimeLessThanOrEqualTo(Date value) {
            addCriterion("SQI_REGTIME <=", value, "sqiRegtime");
            return (Criteria) this;
        }

        public Criteria andSqiRegtimeIn(List<Date> values) {
            addCriterion("SQI_REGTIME in", values, "sqiRegtime");
            return (Criteria) this;
        }

        public Criteria andSqiRegtimeNotIn(List<Date> values) {
            addCriterion("SQI_REGTIME not in", values, "sqiRegtime");
            return (Criteria) this;
        }

        public Criteria andSqiRegtimeBetween(Date value1, Date value2) {
            addCriterion("SQI_REGTIME between", value1, value2, "sqiRegtime");
            return (Criteria) this;
        }

        public Criteria andSqiRegtimeNotBetween(Date value1, Date value2) {
            addCriterion("SQI_REGTIME not between", value1, value2, "sqiRegtime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tp_survey_que_item
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
     * This class corresponds to the database table tp_survey_que_item
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