package com.chinasofti.cetp.survey.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SurveyModelExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tp_survey_model
     *
     * @mbggenerated Thu Jul 25 20:01:32 CST 2013
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tp_survey_model
     *
     * @mbggenerated Thu Jul 25 20:01:32 CST 2013
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tp_survey_model
     *
     * @mbggenerated Thu Jul 25 20:01:32 CST 2013
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_survey_model
     *
     * @mbggenerated Thu Jul 25 20:01:32 CST 2013
     */
    public SurveyModelExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_survey_model
     *
     * @mbggenerated Thu Jul 25 20:01:32 CST 2013
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_survey_model
     *
     * @mbggenerated Thu Jul 25 20:01:32 CST 2013
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_survey_model
     *
     * @mbggenerated Thu Jul 25 20:01:32 CST 2013
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_survey_model
     *
     * @mbggenerated Thu Jul 25 20:01:32 CST 2013
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_survey_model
     *
     * @mbggenerated Thu Jul 25 20:01:32 CST 2013
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_survey_model
     *
     * @mbggenerated Thu Jul 25 20:01:32 CST 2013
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_survey_model
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
     * This method corresponds to the database table tp_survey_model
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
     * This method corresponds to the database table tp_survey_model
     *
     * @mbggenerated Thu Jul 25 20:01:32 CST 2013
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_survey_model
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
     * This class corresponds to the database table tp_survey_model
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

        public Criteria andSmModelIdIsNull() {
            addCriterion("SM_MODEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andSmModelIdIsNotNull() {
            addCriterion("SM_MODEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSmModelIdEqualTo(Integer value) {
            addCriterion("SM_MODEL_ID =", value, "smModelId");
            return (Criteria) this;
        }

        public Criteria andSmModelIdNotEqualTo(Integer value) {
            addCriterion("SM_MODEL_ID <>", value, "smModelId");
            return (Criteria) this;
        }

        public Criteria andSmModelIdGreaterThan(Integer value) {
            addCriterion("SM_MODEL_ID >", value, "smModelId");
            return (Criteria) this;
        }

        public Criteria andSmModelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SM_MODEL_ID >=", value, "smModelId");
            return (Criteria) this;
        }

        public Criteria andSmModelIdLessThan(Integer value) {
            addCriterion("SM_MODEL_ID <", value, "smModelId");
            return (Criteria) this;
        }

        public Criteria andSmModelIdLessThanOrEqualTo(Integer value) {
            addCriterion("SM_MODEL_ID <=", value, "smModelId");
            return (Criteria) this;
        }

        public Criteria andSmModelIdIn(List<Integer> values) {
            addCriterion("SM_MODEL_ID in", values, "smModelId");
            return (Criteria) this;
        }

        public Criteria andSmModelIdNotIn(List<Integer> values) {
            addCriterion("SM_MODEL_ID not in", values, "smModelId");
            return (Criteria) this;
        }

        public Criteria andSmModelIdBetween(Integer value1, Integer value2) {
            addCriterion("SM_MODEL_ID between", value1, value2, "smModelId");
            return (Criteria) this;
        }

        public Criteria andSmModelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SM_MODEL_ID not between", value1, value2, "smModelId");
            return (Criteria) this;
        }

        public Criteria andSmModelTitleIsNull() {
            addCriterion("SM_MODEL_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andSmModelTitleIsNotNull() {
            addCriterion("SM_MODEL_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andSmModelTitleEqualTo(String value) {
            addCriterion("SM_MODEL_TITLE =", value, "smModelTitle");
            return (Criteria) this;
        }

        public Criteria andSmModelTitleNotEqualTo(String value) {
            addCriterion("SM_MODEL_TITLE <>", value, "smModelTitle");
            return (Criteria) this;
        }

        public Criteria andSmModelTitleGreaterThan(String value) {
            addCriterion("SM_MODEL_TITLE >", value, "smModelTitle");
            return (Criteria) this;
        }

        public Criteria andSmModelTitleGreaterThanOrEqualTo(String value) {
            addCriterion("SM_MODEL_TITLE >=", value, "smModelTitle");
            return (Criteria) this;
        }

        public Criteria andSmModelTitleLessThan(String value) {
            addCriterion("SM_MODEL_TITLE <", value, "smModelTitle");
            return (Criteria) this;
        }

        public Criteria andSmModelTitleLessThanOrEqualTo(String value) {
            addCriterion("SM_MODEL_TITLE <=", value, "smModelTitle");
            return (Criteria) this;
        }

        public Criteria andSmModelTitleLike(String value) {
            addCriterion("SM_MODEL_TITLE like", value, "smModelTitle");
            return (Criteria) this;
        }

        public Criteria andSmModelTitleNotLike(String value) {
            addCriterion("SM_MODEL_TITLE not like", value, "smModelTitle");
            return (Criteria) this;
        }

        public Criteria andSmModelTitleIn(List<String> values) {
            addCriterion("SM_MODEL_TITLE in", values, "smModelTitle");
            return (Criteria) this;
        }

        public Criteria andSmModelTitleNotIn(List<String> values) {
            addCriterion("SM_MODEL_TITLE not in", values, "smModelTitle");
            return (Criteria) this;
        }

        public Criteria andSmModelTitleBetween(String value1, String value2) {
            addCriterion("SM_MODEL_TITLE between", value1, value2, "smModelTitle");
            return (Criteria) this;
        }

        public Criteria andSmModelTitleNotBetween(String value1, String value2) {
            addCriterion("SM_MODEL_TITLE not between", value1, value2, "smModelTitle");
            return (Criteria) this;
        }

        public Criteria andSmIntroIsNull() {
            addCriterion("SM_INTRO is null");
            return (Criteria) this;
        }

        public Criteria andSmIntroIsNotNull() {
            addCriterion("SM_INTRO is not null");
            return (Criteria) this;
        }

        public Criteria andSmIntroEqualTo(String value) {
            addCriterion("SM_INTRO =", value, "smIntro");
            return (Criteria) this;
        }

        public Criteria andSmIntroNotEqualTo(String value) {
            addCriterion("SM_INTRO <>", value, "smIntro");
            return (Criteria) this;
        }

        public Criteria andSmIntroGreaterThan(String value) {
            addCriterion("SM_INTRO >", value, "smIntro");
            return (Criteria) this;
        }

        public Criteria andSmIntroGreaterThanOrEqualTo(String value) {
            addCriterion("SM_INTRO >=", value, "smIntro");
            return (Criteria) this;
        }

        public Criteria andSmIntroLessThan(String value) {
            addCriterion("SM_INTRO <", value, "smIntro");
            return (Criteria) this;
        }

        public Criteria andSmIntroLessThanOrEqualTo(String value) {
            addCriterion("SM_INTRO <=", value, "smIntro");
            return (Criteria) this;
        }

        public Criteria andSmIntroLike(String value) {
            addCriterion("SM_INTRO like", value, "smIntro");
            return (Criteria) this;
        }

        public Criteria andSmIntroNotLike(String value) {
            addCriterion("SM_INTRO not like", value, "smIntro");
            return (Criteria) this;
        }

        public Criteria andSmIntroIn(List<String> values) {
            addCriterion("SM_INTRO in", values, "smIntro");
            return (Criteria) this;
        }

        public Criteria andSmIntroNotIn(List<String> values) {
            addCriterion("SM_INTRO not in", values, "smIntro");
            return (Criteria) this;
        }

        public Criteria andSmIntroBetween(String value1, String value2) {
            addCriterion("SM_INTRO between", value1, value2, "smIntro");
            return (Criteria) this;
        }

        public Criteria andSmIntroNotBetween(String value1, String value2) {
            addCriterion("SM_INTRO not between", value1, value2, "smIntro");
            return (Criteria) this;
        }

        public Criteria andSmTypeIsNull() {
            addCriterion("SM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSmTypeIsNotNull() {
            addCriterion("SM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSmTypeEqualTo(String value) {
            addCriterion("SM_TYPE =", value, "smType");
            return (Criteria) this;
        }

        public Criteria andSmTypeNotEqualTo(String value) {
            addCriterion("SM_TYPE <>", value, "smType");
            return (Criteria) this;
        }

        public Criteria andSmTypeGreaterThan(String value) {
            addCriterion("SM_TYPE >", value, "smType");
            return (Criteria) this;
        }

        public Criteria andSmTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SM_TYPE >=", value, "smType");
            return (Criteria) this;
        }

        public Criteria andSmTypeLessThan(String value) {
            addCriterion("SM_TYPE <", value, "smType");
            return (Criteria) this;
        }

        public Criteria andSmTypeLessThanOrEqualTo(String value) {
            addCriterion("SM_TYPE <=", value, "smType");
            return (Criteria) this;
        }

        public Criteria andSmTypeLike(String value) {
            addCriterion("SM_TYPE like", value, "smType");
            return (Criteria) this;
        }

        public Criteria andSmTypeNotLike(String value) {
            addCriterion("SM_TYPE not like", value, "smType");
            return (Criteria) this;
        }

        public Criteria andSmTypeIn(List<String> values) {
            addCriterion("SM_TYPE in", values, "smType");
            return (Criteria) this;
        }

        public Criteria andSmTypeNotIn(List<String> values) {
            addCriterion("SM_TYPE not in", values, "smType");
            return (Criteria) this;
        }

        public Criteria andSmTypeBetween(String value1, String value2) {
            addCriterion("SM_TYPE between", value1, value2, "smType");
            return (Criteria) this;
        }

        public Criteria andSmTypeNotBetween(String value1, String value2) {
            addCriterion("SM_TYPE not between", value1, value2, "smType");
            return (Criteria) this;
        }

        public Criteria andSmEnableIsNull() {
            addCriterion("SM_ENABLE is null");
            return (Criteria) this;
        }

        public Criteria andSmEnableIsNotNull() {
            addCriterion("SM_ENABLE is not null");
            return (Criteria) this;
        }

        public Criteria andSmEnableEqualTo(String value) {
            addCriterion("SM_ENABLE =", value, "smEnable");
            return (Criteria) this;
        }

        public Criteria andSmEnableNotEqualTo(String value) {
            addCriterion("SM_ENABLE <>", value, "smEnable");
            return (Criteria) this;
        }

        public Criteria andSmEnableGreaterThan(String value) {
            addCriterion("SM_ENABLE >", value, "smEnable");
            return (Criteria) this;
        }

        public Criteria andSmEnableGreaterThanOrEqualTo(String value) {
            addCriterion("SM_ENABLE >=", value, "smEnable");
            return (Criteria) this;
        }

        public Criteria andSmEnableLessThan(String value) {
            addCriterion("SM_ENABLE <", value, "smEnable");
            return (Criteria) this;
        }

        public Criteria andSmEnableLessThanOrEqualTo(String value) {
            addCriterion("SM_ENABLE <=", value, "smEnable");
            return (Criteria) this;
        }

        public Criteria andSmEnableLike(String value) {
            addCriterion("SM_ENABLE like", value, "smEnable");
            return (Criteria) this;
        }

        public Criteria andSmEnableNotLike(String value) {
            addCriterion("SM_ENABLE not like", value, "smEnable");
            return (Criteria) this;
        }

        public Criteria andSmEnableIn(List<String> values) {
            addCriterion("SM_ENABLE in", values, "smEnable");
            return (Criteria) this;
        }

        public Criteria andSmEnableNotIn(List<String> values) {
            addCriterion("SM_ENABLE not in", values, "smEnable");
            return (Criteria) this;
        }

        public Criteria andSmEnableBetween(String value1, String value2) {
            addCriterion("SM_ENABLE between", value1, value2, "smEnable");
            return (Criteria) this;
        }

        public Criteria andSmEnableNotBetween(String value1, String value2) {
            addCriterion("SM_ENABLE not between", value1, value2, "smEnable");
            return (Criteria) this;
        }

        public Criteria andSmUserNoIsNull() {
            addCriterion("SM_USER_NO is null");
            return (Criteria) this;
        }

        public Criteria andSmUserNoIsNotNull() {
            addCriterion("SM_USER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSmUserNoEqualTo(Integer value) {
            addCriterion("SM_USER_NO =", value, "smUserNo");
            return (Criteria) this;
        }

        public Criteria andSmUserNoNotEqualTo(Integer value) {
            addCriterion("SM_USER_NO <>", value, "smUserNo");
            return (Criteria) this;
        }

        public Criteria andSmUserNoGreaterThan(Integer value) {
            addCriterion("SM_USER_NO >", value, "smUserNo");
            return (Criteria) this;
        }

        public Criteria andSmUserNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("SM_USER_NO >=", value, "smUserNo");
            return (Criteria) this;
        }

        public Criteria andSmUserNoLessThan(Integer value) {
            addCriterion("SM_USER_NO <", value, "smUserNo");
            return (Criteria) this;
        }

        public Criteria andSmUserNoLessThanOrEqualTo(Integer value) {
            addCriterion("SM_USER_NO <=", value, "smUserNo");
            return (Criteria) this;
        }

        public Criteria andSmUserNoIn(List<Integer> values) {
            addCriterion("SM_USER_NO in", values, "smUserNo");
            return (Criteria) this;
        }

        public Criteria andSmUserNoNotIn(List<Integer> values) {
            addCriterion("SM_USER_NO not in", values, "smUserNo");
            return (Criteria) this;
        }

        public Criteria andSmUserNoBetween(Integer value1, Integer value2) {
            addCriterion("SM_USER_NO between", value1, value2, "smUserNo");
            return (Criteria) this;
        }

        public Criteria andSmUserNoNotBetween(Integer value1, Integer value2) {
            addCriterion("SM_USER_NO not between", value1, value2, "smUserNo");
            return (Criteria) this;
        }

        public Criteria andSmRegtimeIsNull() {
            addCriterion("SM_REGTIME is null");
            return (Criteria) this;
        }

        public Criteria andSmRegtimeIsNotNull() {
            addCriterion("SM_REGTIME is not null");
            return (Criteria) this;
        }

        public Criteria andSmRegtimeEqualTo(Date value) {
            addCriterion("SM_REGTIME =", value, "smRegtime");
            return (Criteria) this;
        }

        public Criteria andSmRegtimeNotEqualTo(Date value) {
            addCriterion("SM_REGTIME <>", value, "smRegtime");
            return (Criteria) this;
        }

        public Criteria andSmRegtimeGreaterThan(Date value) {
            addCriterion("SM_REGTIME >", value, "smRegtime");
            return (Criteria) this;
        }

        public Criteria andSmRegtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SM_REGTIME >=", value, "smRegtime");
            return (Criteria) this;
        }

        public Criteria andSmRegtimeLessThan(Date value) {
            addCriterion("SM_REGTIME <", value, "smRegtime");
            return (Criteria) this;
        }

        public Criteria andSmRegtimeLessThanOrEqualTo(Date value) {
            addCriterion("SM_REGTIME <=", value, "smRegtime");
            return (Criteria) this;
        }

        public Criteria andSmRegtimeIn(List<Date> values) {
            addCriterion("SM_REGTIME in", values, "smRegtime");
            return (Criteria) this;
        }

        public Criteria andSmRegtimeNotIn(List<Date> values) {
            addCriterion("SM_REGTIME not in", values, "smRegtime");
            return (Criteria) this;
        }

        public Criteria andSmRegtimeBetween(Date value1, Date value2) {
            addCriterion("SM_REGTIME between", value1, value2, "smRegtime");
            return (Criteria) this;
        }

        public Criteria andSmRegtimeNotBetween(Date value1, Date value2) {
            addCriterion("SM_REGTIME not between", value1, value2, "smRegtime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tp_survey_model
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
     * This class corresponds to the database table tp_survey_model
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