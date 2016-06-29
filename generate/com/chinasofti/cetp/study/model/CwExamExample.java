package com.chinasofti.cetp.study.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CwExamExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tp_cw_exam
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tp_cw_exam
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tp_cw_exam
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_cw_exam
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    public CwExamExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_cw_exam
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_cw_exam
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_cw_exam
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_cw_exam
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_cw_exam
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_cw_exam
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_cw_exam
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_cw_exam
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
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
     * This method corresponds to the database table tp_cw_exam
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_cw_exam
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tp_cw_exam
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
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

        public Criteria andCeCourseIdIsNull() {
            addCriterion("CE_COURSE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCeCourseIdIsNotNull() {
            addCriterion("CE_COURSE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCeCourseIdEqualTo(Integer value) {
            addCriterion("CE_COURSE_ID =", value, "ceCourseId");
            return (Criteria) this;
        }

        public Criteria andCeCourseIdNotEqualTo(Integer value) {
            addCriterion("CE_COURSE_ID <>", value, "ceCourseId");
            return (Criteria) this;
        }

        public Criteria andCeCourseIdGreaterThan(Integer value) {
            addCriterion("CE_COURSE_ID >", value, "ceCourseId");
            return (Criteria) this;
        }

        public Criteria andCeCourseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CE_COURSE_ID >=", value, "ceCourseId");
            return (Criteria) this;
        }

        public Criteria andCeCourseIdLessThan(Integer value) {
            addCriterion("CE_COURSE_ID <", value, "ceCourseId");
            return (Criteria) this;
        }

        public Criteria andCeCourseIdLessThanOrEqualTo(Integer value) {
            addCriterion("CE_COURSE_ID <=", value, "ceCourseId");
            return (Criteria) this;
        }

        public Criteria andCeCourseIdIn(List<Integer> values) {
            addCriterion("CE_COURSE_ID in", values, "ceCourseId");
            return (Criteria) this;
        }

        public Criteria andCeCourseIdNotIn(List<Integer> values) {
            addCriterion("CE_COURSE_ID not in", values, "ceCourseId");
            return (Criteria) this;
        }

        public Criteria andCeCourseIdBetween(Integer value1, Integer value2) {
            addCriterion("CE_COURSE_ID between", value1, value2, "ceCourseId");
            return (Criteria) this;
        }

        public Criteria andCeCourseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CE_COURSE_ID not between", value1, value2, "ceCourseId");
            return (Criteria) this;
        }

        public Criteria andCeExamIdIsNull() {
            addCriterion("CE_EXAM_ID is null");
            return (Criteria) this;
        }

        public Criteria andCeExamIdIsNotNull() {
            addCriterion("CE_EXAM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCeExamIdEqualTo(Integer value) {
            addCriterion("CE_EXAM_ID =", value, "ceExamId");
            return (Criteria) this;
        }

        public Criteria andCeExamIdNotEqualTo(Integer value) {
            addCriterion("CE_EXAM_ID <>", value, "ceExamId");
            return (Criteria) this;
        }

        public Criteria andCeExamIdGreaterThan(Integer value) {
            addCriterion("CE_EXAM_ID >", value, "ceExamId");
            return (Criteria) this;
        }

        public Criteria andCeExamIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CE_EXAM_ID >=", value, "ceExamId");
            return (Criteria) this;
        }

        public Criteria andCeExamIdLessThan(Integer value) {
            addCriterion("CE_EXAM_ID <", value, "ceExamId");
            return (Criteria) this;
        }

        public Criteria andCeExamIdLessThanOrEqualTo(Integer value) {
            addCriterion("CE_EXAM_ID <=", value, "ceExamId");
            return (Criteria) this;
        }

        public Criteria andCeExamIdIn(List<Integer> values) {
            addCriterion("CE_EXAM_ID in", values, "ceExamId");
            return (Criteria) this;
        }

        public Criteria andCeExamIdNotIn(List<Integer> values) {
            addCriterion("CE_EXAM_ID not in", values, "ceExamId");
            return (Criteria) this;
        }

        public Criteria andCeExamIdBetween(Integer value1, Integer value2) {
            addCriterion("CE_EXAM_ID between", value1, value2, "ceExamId");
            return (Criteria) this;
        }

        public Criteria andCeExamIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CE_EXAM_ID not between", value1, value2, "ceExamId");
            return (Criteria) this;
        }

        public Criteria andCeSeqIsNull() {
            addCriterion("CE_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andCeSeqIsNotNull() {
            addCriterion("CE_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andCeSeqEqualTo(Integer value) {
            addCriterion("CE_SEQ =", value, "ceSeq");
            return (Criteria) this;
        }

        public Criteria andCeSeqNotEqualTo(Integer value) {
            addCriterion("CE_SEQ <>", value, "ceSeq");
            return (Criteria) this;
        }

        public Criteria andCeSeqGreaterThan(Integer value) {
            addCriterion("CE_SEQ >", value, "ceSeq");
            return (Criteria) this;
        }

        public Criteria andCeSeqGreaterThanOrEqualTo(Integer value) {
            addCriterion("CE_SEQ >=", value, "ceSeq");
            return (Criteria) this;
        }

        public Criteria andCeSeqLessThan(Integer value) {
            addCriterion("CE_SEQ <", value, "ceSeq");
            return (Criteria) this;
        }

        public Criteria andCeSeqLessThanOrEqualTo(Integer value) {
            addCriterion("CE_SEQ <=", value, "ceSeq");
            return (Criteria) this;
        }

        public Criteria andCeSeqIn(List<Integer> values) {
            addCriterion("CE_SEQ in", values, "ceSeq");
            return (Criteria) this;
        }

        public Criteria andCeSeqNotIn(List<Integer> values) {
            addCriterion("CE_SEQ not in", values, "ceSeq");
            return (Criteria) this;
        }

        public Criteria andCeSeqBetween(Integer value1, Integer value2) {
            addCriterion("CE_SEQ between", value1, value2, "ceSeq");
            return (Criteria) this;
        }

        public Criteria andCeSeqNotBetween(Integer value1, Integer value2) {
            addCriterion("CE_SEQ not between", value1, value2, "ceSeq");
            return (Criteria) this;
        }

        public Criteria andCeUserNoIsNull() {
            addCriterion("CE_USER_NO is null");
            return (Criteria) this;
        }

        public Criteria andCeUserNoIsNotNull() {
            addCriterion("CE_USER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCeUserNoEqualTo(Integer value) {
            addCriterion("CE_USER_NO =", value, "ceUserNo");
            return (Criteria) this;
        }

        public Criteria andCeUserNoNotEqualTo(Integer value) {
            addCriterion("CE_USER_NO <>", value, "ceUserNo");
            return (Criteria) this;
        }

        public Criteria andCeUserNoGreaterThan(Integer value) {
            addCriterion("CE_USER_NO >", value, "ceUserNo");
            return (Criteria) this;
        }

        public Criteria andCeUserNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("CE_USER_NO >=", value, "ceUserNo");
            return (Criteria) this;
        }

        public Criteria andCeUserNoLessThan(Integer value) {
            addCriterion("CE_USER_NO <", value, "ceUserNo");
            return (Criteria) this;
        }

        public Criteria andCeUserNoLessThanOrEqualTo(Integer value) {
            addCriterion("CE_USER_NO <=", value, "ceUserNo");
            return (Criteria) this;
        }

        public Criteria andCeUserNoIn(List<Integer> values) {
            addCriterion("CE_USER_NO in", values, "ceUserNo");
            return (Criteria) this;
        }

        public Criteria andCeUserNoNotIn(List<Integer> values) {
            addCriterion("CE_USER_NO not in", values, "ceUserNo");
            return (Criteria) this;
        }

        public Criteria andCeUserNoBetween(Integer value1, Integer value2) {
            addCriterion("CE_USER_NO between", value1, value2, "ceUserNo");
            return (Criteria) this;
        }

        public Criteria andCeUserNoNotBetween(Integer value1, Integer value2) {
            addCriterion("CE_USER_NO not between", value1, value2, "ceUserNo");
            return (Criteria) this;
        }

        public Criteria andCeRegtimeIsNull() {
            addCriterion("CE_REGTIME is null");
            return (Criteria) this;
        }

        public Criteria andCeRegtimeIsNotNull() {
            addCriterion("CE_REGTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCeRegtimeEqualTo(Date value) {
            addCriterion("CE_REGTIME =", value, "ceRegtime");
            return (Criteria) this;
        }

        public Criteria andCeRegtimeNotEqualTo(Date value) {
            addCriterion("CE_REGTIME <>", value, "ceRegtime");
            return (Criteria) this;
        }

        public Criteria andCeRegtimeGreaterThan(Date value) {
            addCriterion("CE_REGTIME >", value, "ceRegtime");
            return (Criteria) this;
        }

        public Criteria andCeRegtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CE_REGTIME >=", value, "ceRegtime");
            return (Criteria) this;
        }

        public Criteria andCeRegtimeLessThan(Date value) {
            addCriterion("CE_REGTIME <", value, "ceRegtime");
            return (Criteria) this;
        }

        public Criteria andCeRegtimeLessThanOrEqualTo(Date value) {
            addCriterion("CE_REGTIME <=", value, "ceRegtime");
            return (Criteria) this;
        }

        public Criteria andCeRegtimeIn(List<Date> values) {
            addCriterion("CE_REGTIME in", values, "ceRegtime");
            return (Criteria) this;
        }

        public Criteria andCeRegtimeNotIn(List<Date> values) {
            addCriterion("CE_REGTIME not in", values, "ceRegtime");
            return (Criteria) this;
        }

        public Criteria andCeRegtimeBetween(Date value1, Date value2) {
            addCriterion("CE_REGTIME between", value1, value2, "ceRegtime");
            return (Criteria) this;
        }

        public Criteria andCeRegtimeNotBetween(Date value1, Date value2) {
            addCriterion("CE_REGTIME not between", value1, value2, "ceRegtime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tp_cw_exam
     *
     * @mbggenerated do_not_delete_during_merge Thu Jul 25 19:26:27 CST 2013
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tp_cw_exam
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
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