package com.chinasofti.cetp.study.model;

import java.util.Date;

public class ExamItem {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_exam_item.ITEM_ID
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    private Integer itemId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_exam_item.ITEM_EXAM_ID
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    private Integer itemExamId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_exam_item.ITEM_SEQ
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    private Integer itemSeq;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_exam_item.ITEM_REGTIME
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    private Date itemRegtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_exam_item.ITEM_CONTENT
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    private String itemContent;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_exam_item.ITEM_ID
     *
     * @return the value of tp_exam_item.ITEM_ID
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    public Integer getItemId() {
        return itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_exam_item.ITEM_ID
     *
     * @param itemId the value for tp_exam_item.ITEM_ID
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_exam_item.ITEM_EXAM_ID
     *
     * @return the value of tp_exam_item.ITEM_EXAM_ID
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    public Integer getItemExamId() {
        return itemExamId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_exam_item.ITEM_EXAM_ID
     *
     * @param itemExamId the value for tp_exam_item.ITEM_EXAM_ID
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    public void setItemExamId(Integer itemExamId) {
        this.itemExamId = itemExamId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_exam_item.ITEM_SEQ
     *
     * @return the value of tp_exam_item.ITEM_SEQ
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    public Integer getItemSeq() {
        return itemSeq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_exam_item.ITEM_SEQ
     *
     * @param itemSeq the value for tp_exam_item.ITEM_SEQ
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    public void setItemSeq(Integer itemSeq) {
        this.itemSeq = itemSeq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_exam_item.ITEM_REGTIME
     *
     * @return the value of tp_exam_item.ITEM_REGTIME
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    public Date getItemRegtime() {
        return itemRegtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_exam_item.ITEM_REGTIME
     *
     * @param itemRegtime the value for tp_exam_item.ITEM_REGTIME
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    public void setItemRegtime(Date itemRegtime) {
        this.itemRegtime = itemRegtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_exam_item.ITEM_CONTENT
     *
     * @return the value of tp_exam_item.ITEM_CONTENT
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    public String getItemContent() {
        return itemContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_exam_item.ITEM_CONTENT
     *
     * @param itemContent the value for tp_exam_item.ITEM_CONTENT
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    public void setItemContent(String itemContent) {
        this.itemContent = itemContent == null ? null : itemContent.trim();
    }
}