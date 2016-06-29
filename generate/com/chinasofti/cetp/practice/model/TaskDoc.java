package com.chinasofti.cetp.practice.model;

import java.util.Date;

public class TaskDoc {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_task_doc.TD_DOC_ID
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    private Integer tdDocId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_task_doc.TD_TASK_ID
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    private Integer tdTaskId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_task_doc.TD_DOC_NAME
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    private String tdDocName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_task_doc.TD_DOC_FLAG
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    private String tdDocFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_task_doc.TD_DOC_URL
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    private String tdDocUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_task_doc.TD_DOC_VIDEO_URL
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    private String tdDocVideoUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_task_doc.TD_REGTIME
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    private Date tdRegtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_task_doc.TD_DOC_ID
     *
     * @return the value of tp_task_doc.TD_DOC_ID
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    public Integer getTdDocId() {
        return tdDocId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_task_doc.TD_DOC_ID
     *
     * @param tdDocId the value for tp_task_doc.TD_DOC_ID
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    public void setTdDocId(Integer tdDocId) {
        this.tdDocId = tdDocId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_task_doc.TD_TASK_ID
     *
     * @return the value of tp_task_doc.TD_TASK_ID
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    public Integer getTdTaskId() {
        return tdTaskId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_task_doc.TD_TASK_ID
     *
     * @param tdTaskId the value for tp_task_doc.TD_TASK_ID
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    public void setTdTaskId(Integer tdTaskId) {
        this.tdTaskId = tdTaskId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_task_doc.TD_DOC_NAME
     *
     * @return the value of tp_task_doc.TD_DOC_NAME
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    public String getTdDocName() {
        return tdDocName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_task_doc.TD_DOC_NAME
     *
     * @param tdDocName the value for tp_task_doc.TD_DOC_NAME
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    public void setTdDocName(String tdDocName) {
        this.tdDocName = tdDocName == null ? null : tdDocName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_task_doc.TD_DOC_FLAG
     *
     * @return the value of tp_task_doc.TD_DOC_FLAG
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    public String getTdDocFlag() {
        return tdDocFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_task_doc.TD_DOC_FLAG
     *
     * @param tdDocFlag the value for tp_task_doc.TD_DOC_FLAG
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    public void setTdDocFlag(String tdDocFlag) {
        this.tdDocFlag = tdDocFlag == null ? null : tdDocFlag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_task_doc.TD_DOC_URL
     *
     * @return the value of tp_task_doc.TD_DOC_URL
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    public String getTdDocUrl() {
        return tdDocUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_task_doc.TD_DOC_URL
     *
     * @param tdDocUrl the value for tp_task_doc.TD_DOC_URL
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    public void setTdDocUrl(String tdDocUrl) {
        this.tdDocUrl = tdDocUrl == null ? null : tdDocUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_task_doc.TD_DOC_VIDEO_URL
     *
     * @return the value of tp_task_doc.TD_DOC_VIDEO_URL
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    public String getTdDocVideoUrl() {
        return tdDocVideoUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_task_doc.TD_DOC_VIDEO_URL
     *
     * @param tdDocVideoUrl the value for tp_task_doc.TD_DOC_VIDEO_URL
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    public void setTdDocVideoUrl(String tdDocVideoUrl) {
        this.tdDocVideoUrl = tdDocVideoUrl == null ? null : tdDocVideoUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_task_doc.TD_REGTIME
     *
     * @return the value of tp_task_doc.TD_REGTIME
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    public Date getTdRegtime() {
        return tdRegtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_task_doc.TD_REGTIME
     *
     * @param tdRegtime the value for tp_task_doc.TD_REGTIME
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    public void setTdRegtime(Date tdRegtime) {
        this.tdRegtime = tdRegtime;
    }
}