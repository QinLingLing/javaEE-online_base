package com.chinasofti.cetp.ability.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.chinasofti.cetp.ability.model.MorePabWcon;
import com.chinasofti.cetp.ability.model.PabWcon;
import com.chinasofti.cetp.ability.model.PabWconExample;
import com.chinasofti.cetp.ability.model.PabWconKey;

public interface PabWconMapper {
	/**
	 * <p>
	 * 		method:getPabWcongriddata
	 * 		<br>
	 * 		description:获取职业功能未选择的工作内容列表的方法
	 * </p>
	 * @param pabWcon MorePabWcon
	 * @return List<MorePabWcon>
	 * */
	List<MorePabWcon> getSelWcongriddata(MorePabWcon pabWcon);
	/**
	 * <p>
	 * 		method:insertSavePabWcon
	 * 		<br>
	 * 		description:新建工作内容的方法
	 * </p>
	 * @param pabWcon MorePabWcon
	 * @return int
	 * */
	int insertSavePabWcon(MorePabWcon pabWcon);
	/**
	 * <p>
	 * 		method:insertSelective1
	 * 		<br>
	 * 		description:新建职业功能已选择的工作内容的方法
	 * </p>
	 * @return int
	 * */
	int insertSelective1(MorePabWcon record);
	/**
	 * <p>
	 * 		method:getPabWcongriddata
	 * 		<br>
	 * 		description:获取职业功能已选择的工作内容列表的方法
	 * </p>
	 * @param pabId Integer
	 * @return List<MorePabWcon>
	 * */
	List<MorePabWcon> getPabWcongriddata(Integer pabId,RowBounds rowBounds);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_pab_wcon
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    int countByExample(PabWconExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_pab_wcon
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    int deleteByExample(PabWconExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_pab_wcon
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    int deleteByPrimaryKey(PabWconKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_pab_wcon
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    int insert(PabWcon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_pab_wcon
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    int insertSelective(PabWcon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_pab_wcon
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    List<PabWcon> selectByExample(PabWconExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_pab_wcon
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    PabWcon selectByPrimaryKey(PabWconKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_pab_wcon
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    int updateByExampleSelective(@Param("record") PabWcon record, @Param("example") PabWconExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_pab_wcon
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    int updateByExample(@Param("record") PabWcon record, @Param("example") PabWconExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_pab_wcon
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    int updateByPrimaryKeySelective(PabWcon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_pab_wcon
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    int updateByPrimaryKey(PabWcon record);
}