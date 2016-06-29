package com.chinasofti.cetp.ability.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AbilityItemExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tp_ability_item
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tp_ability_item
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tp_ability_item
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_ability_item
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    public AbilityItemExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_ability_item
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_ability_item
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_ability_item
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_ability_item
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_ability_item
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_ability_item
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_ability_item
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
     * This method corresponds to the database table tp_ability_item
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
     * This method corresponds to the database table tp_ability_item
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_ability_item
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
     * This class corresponds to the database table tp_ability_item
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

        public Criteria andAbIdIsNull() {
            addCriterion("AB_ID is null");
            return (Criteria) this;
        }

        public Criteria andAbIdIsNotNull() {
            addCriterion("AB_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAbIdEqualTo(Integer value) {
            addCriterion("AB_ID =", value, "abId");
            return (Criteria) this;
        }

        public Criteria andAbIdNotEqualTo(Integer value) {
            addCriterion("AB_ID <>", value, "abId");
            return (Criteria) this;
        }

        public Criteria andAbIdGreaterThan(Integer value) {
            addCriterion("AB_ID >", value, "abId");
            return (Criteria) this;
        }

        public Criteria andAbIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("AB_ID >=", value, "abId");
            return (Criteria) this;
        }

        public Criteria andAbIdLessThan(Integer value) {
            addCriterion("AB_ID <", value, "abId");
            return (Criteria) this;
        }

        public Criteria andAbIdLessThanOrEqualTo(Integer value) {
            addCriterion("AB_ID <=", value, "abId");
            return (Criteria) this;
        }

        public Criteria andAbIdIn(List<Integer> values) {
            addCriterion("AB_ID in", values, "abId");
            return (Criteria) this;
        }

        public Criteria andAbIdNotIn(List<Integer> values) {
            addCriterion("AB_ID not in", values, "abId");
            return (Criteria) this;
        }

        public Criteria andAbIdBetween(Integer value1, Integer value2) {
            addCriterion("AB_ID between", value1, value2, "abId");
            return (Criteria) this;
        }

        public Criteria andAbIdNotBetween(Integer value1, Integer value2) {
            addCriterion("AB_ID not between", value1, value2, "abId");
            return (Criteria) this;
        }

        public Criteria andAbNameIsNull() {
            addCriterion("AB_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAbNameIsNotNull() {
            addCriterion("AB_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAbNameEqualTo(String value) {
            addCriterion("AB_NAME =", value, "abName");
            return (Criteria) this;
        }

        public Criteria andAbNameNotEqualTo(String value) {
            addCriterion("AB_NAME <>", value, "abName");
            return (Criteria) this;
        }

        public Criteria andAbNameGreaterThan(String value) {
            addCriterion("AB_NAME >", value, "abName");
            return (Criteria) this;
        }

        public Criteria andAbNameGreaterThanOrEqualTo(String value) {
            addCriterion("AB_NAME >=", value, "abName");
            return (Criteria) this;
        }

        public Criteria andAbNameLessThan(String value) {
            addCriterion("AB_NAME <", value, "abName");
            return (Criteria) this;
        }

        public Criteria andAbNameLessThanOrEqualTo(String value) {
            addCriterion("AB_NAME <=", value, "abName");
            return (Criteria) this;
        }

        public Criteria andAbNameLike(String value) {
            addCriterion("AB_NAME like", value, "abName");
            return (Criteria) this;
        }

        public Criteria andAbNameNotLike(String value) {
            addCriterion("AB_NAME not like", value, "abName");
            return (Criteria) this;
        }

        public Criteria andAbNameIn(List<String> values) {
            addCriterion("AB_NAME in", values, "abName");
            return (Criteria) this;
        }

        public Criteria andAbNameNotIn(List<String> values) {
            addCriterion("AB_NAME not in", values, "abName");
            return (Criteria) this;
        }

        public Criteria andAbNameBetween(String value1, String value2) {
            addCriterion("AB_NAME between", value1, value2, "abName");
            return (Criteria) this;
        }

        public Criteria andAbNameNotBetween(String value1, String value2) {
            addCriterion("AB_NAME not between", value1, value2, "abName");
            return (Criteria) this;
        }

        public Criteria andAbParentIdIsNull() {
            addCriterion("AB_PARENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andAbParentIdIsNotNull() {
            addCriterion("AB_PARENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAbParentIdEqualTo(Integer value) {
            addCriterion("AB_PARENT_ID =", value, "abParentId");
            return (Criteria) this;
        }

        public Criteria andAbParentIdNotEqualTo(Integer value) {
            addCriterion("AB_PARENT_ID <>", value, "abParentId");
            return (Criteria) this;
        }

        public Criteria andAbParentIdGreaterThan(Integer value) {
            addCriterion("AB_PARENT_ID >", value, "abParentId");
            return (Criteria) this;
        }

        public Criteria andAbParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("AB_PARENT_ID >=", value, "abParentId");
            return (Criteria) this;
        }

        public Criteria andAbParentIdLessThan(Integer value) {
            addCriterion("AB_PARENT_ID <", value, "abParentId");
            return (Criteria) this;
        }

        public Criteria andAbParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("AB_PARENT_ID <=", value, "abParentId");
            return (Criteria) this;
        }

        public Criteria andAbParentIdIn(List<Integer> values) {
            addCriterion("AB_PARENT_ID in", values, "abParentId");
            return (Criteria) this;
        }

        public Criteria andAbParentIdNotIn(List<Integer> values) {
            addCriterion("AB_PARENT_ID not in", values, "abParentId");
            return (Criteria) this;
        }

        public Criteria andAbParentIdBetween(Integer value1, Integer value2) {
            addCriterion("AB_PARENT_ID between", value1, value2, "abParentId");
            return (Criteria) this;
        }

        public Criteria andAbParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("AB_PARENT_ID not between", value1, value2, "abParentId");
            return (Criteria) this;
        }

        public Criteria andAbScoreIsNull() {
            addCriterion("AB_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andAbScoreIsNotNull() {
            addCriterion("AB_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andAbScoreEqualTo(Integer value) {
            addCriterion("AB_SCORE =", value, "abScore");
            return (Criteria) this;
        }

        public Criteria andAbScoreNotEqualTo(Integer value) {
            addCriterion("AB_SCORE <>", value, "abScore");
            return (Criteria) this;
        }

        public Criteria andAbScoreGreaterThan(Integer value) {
            addCriterion("AB_SCORE >", value, "abScore");
            return (Criteria) this;
        }

        public Criteria andAbScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("AB_SCORE >=", value, "abScore");
            return (Criteria) this;
        }

        public Criteria andAbScoreLessThan(Integer value) {
            addCriterion("AB_SCORE <", value, "abScore");
            return (Criteria) this;
        }

        public Criteria andAbScoreLessThanOrEqualTo(Integer value) {
            addCriterion("AB_SCORE <=", value, "abScore");
            return (Criteria) this;
        }

        public Criteria andAbScoreIn(List<Integer> values) {
            addCriterion("AB_SCORE in", values, "abScore");
            return (Criteria) this;
        }

        public Criteria andAbScoreNotIn(List<Integer> values) {
            addCriterion("AB_SCORE not in", values, "abScore");
            return (Criteria) this;
        }

        public Criteria andAbScoreBetween(Integer value1, Integer value2) {
            addCriterion("AB_SCORE between", value1, value2, "abScore");
            return (Criteria) this;
        }

        public Criteria andAbScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("AB_SCORE not between", value1, value2, "abScore");
            return (Criteria) this;
        }

        public Criteria andAbContentIsNull() {
            addCriterion("AB_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andAbContentIsNotNull() {
            addCriterion("AB_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andAbContentEqualTo(String value) {
            addCriterion("AB_CONTENT =", value, "abContent");
            return (Criteria) this;
        }

        public Criteria andAbContentNotEqualTo(String value) {
            addCriterion("AB_CONTENT <>", value, "abContent");
            return (Criteria) this;
        }

        public Criteria andAbContentGreaterThan(String value) {
            addCriterion("AB_CONTENT >", value, "abContent");
            return (Criteria) this;
        }

        public Criteria andAbContentGreaterThanOrEqualTo(String value) {
            addCriterion("AB_CONTENT >=", value, "abContent");
            return (Criteria) this;
        }

        public Criteria andAbContentLessThan(String value) {
            addCriterion("AB_CONTENT <", value, "abContent");
            return (Criteria) this;
        }

        public Criteria andAbContentLessThanOrEqualTo(String value) {
            addCriterion("AB_CONTENT <=", value, "abContent");
            return (Criteria) this;
        }

        public Criteria andAbContentLike(String value) {
            addCriterion("AB_CONTENT like", value, "abContent");
            return (Criteria) this;
        }

        public Criteria andAbContentNotLike(String value) {
            addCriterion("AB_CONTENT not like", value, "abContent");
            return (Criteria) this;
        }

        public Criteria andAbContentIn(List<String> values) {
            addCriterion("AB_CONTENT in", values, "abContent");
            return (Criteria) this;
        }

        public Criteria andAbContentNotIn(List<String> values) {
            addCriterion("AB_CONTENT not in", values, "abContent");
            return (Criteria) this;
        }

        public Criteria andAbContentBetween(String value1, String value2) {
            addCriterion("AB_CONTENT between", value1, value2, "abContent");
            return (Criteria) this;
        }

        public Criteria andAbContentNotBetween(String value1, String value2) {
            addCriterion("AB_CONTENT not between", value1, value2, "abContent");
            return (Criteria) this;
        }

        public Criteria andAbRegtimeIsNull() {
            addCriterion("AB_REGTIME is null");
            return (Criteria) this;
        }

        public Criteria andAbRegtimeIsNotNull() {
            addCriterion("AB_REGTIME is not null");
            return (Criteria) this;
        }

        public Criteria andAbRegtimeEqualTo(Date value) {
            addCriterion("AB_REGTIME =", value, "abRegtime");
            return (Criteria) this;
        }

        public Criteria andAbRegtimeNotEqualTo(Date value) {
            addCriterion("AB_REGTIME <>", value, "abRegtime");
            return (Criteria) this;
        }

        public Criteria andAbRegtimeGreaterThan(Date value) {
            addCriterion("AB_REGTIME >", value, "abRegtime");
            return (Criteria) this;
        }

        public Criteria andAbRegtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("AB_REGTIME >=", value, "abRegtime");
            return (Criteria) this;
        }

        public Criteria andAbRegtimeLessThan(Date value) {
            addCriterion("AB_REGTIME <", value, "abRegtime");
            return (Criteria) this;
        }

        public Criteria andAbRegtimeLessThanOrEqualTo(Date value) {
            addCriterion("AB_REGTIME <=", value, "abRegtime");
            return (Criteria) this;
        }

        public Criteria andAbRegtimeIn(List<Date> values) {
            addCriterion("AB_REGTIME in", values, "abRegtime");
            return (Criteria) this;
        }

        public Criteria andAbRegtimeNotIn(List<Date> values) {
            addCriterion("AB_REGTIME not in", values, "abRegtime");
            return (Criteria) this;
        }

        public Criteria andAbRegtimeBetween(Date value1, Date value2) {
            addCriterion("AB_REGTIME between", value1, value2, "abRegtime");
            return (Criteria) this;
        }

        public Criteria andAbRegtimeNotBetween(Date value1, Date value2) {
            addCriterion("AB_REGTIME not between", value1, value2, "abRegtime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tp_ability_item
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
     * This class corresponds to the database table tp_ability_item
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