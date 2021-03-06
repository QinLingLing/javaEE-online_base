package com.chinasofti.cetp.study.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chinasofti.cetp.study.model.CourseStu;
import com.chinasofti.cetp.study.model.CourseStuExample;
import com.chinasofti.cetp.study.model.CourseStuKey;

public interface CourseStuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_course_stu
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    int countByExample(CourseStuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_course_stu
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    int deleteByExample(CourseStuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_course_stu
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    int deleteByPrimaryKey(CourseStuKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_course_stu
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    int insert(CourseStu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_course_stu
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    int insertSelective(CourseStu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_course_stu
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    List<CourseStu> selectByExample(CourseStuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_course_stu
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    CourseStu selectByPrimaryKey(CourseStuKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_course_stu
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    int updateByExampleSelective(@Param("record") CourseStu record, @Param("example") CourseStuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_course_stu
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    int updateByExample(@Param("record") CourseStu record, @Param("example") CourseStuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_course_stu
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    int updateByPrimaryKeySelective(CourseStu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_course_stu
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    int updateByPrimaryKey(CourseStu record);
}