package com.wangzefeng.lovers.java.mapper;

import com.wangzefeng.lovers.java.domain.SysUser;
import com.wangzefeng.lovers.java.domain.UserMoodRecord;
import com.wangzefeng.lovers.java.domain.UserMoodRecordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface UserMoodRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_mood_record
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    long countByExample(UserMoodRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_mood_record
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    int deleteByExample(UserMoodRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_mood_record
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    int deleteByPrimaryKey(Integer recordId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_mood_record
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    int insert(UserMoodRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_mood_record
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    int insertSelective(UserMoodRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_mood_record
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    List<UserMoodRecord> selectByExample(UserMoodRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_mood_record
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    UserMoodRecord selectByPrimaryKey(Integer recordId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_mood_record
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    int updateByExampleSelective(@Param("record") UserMoodRecord record, @Param("example") UserMoodRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_mood_record
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    int updateByExample(@Param("record") UserMoodRecord record, @Param("example") UserMoodRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_mood_record
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    int updateByPrimaryKeySelective(UserMoodRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_mood_record
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    int updateByPrimaryKey(UserMoodRecord record);


    List<UserMoodRecord> selectByUsers(@Param("sysUsers") List<SysUser> sysUsers);
}