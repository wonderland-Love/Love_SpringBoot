package com.love.Mapper;

import com.love.module.Small_notes_message;
import com.love.module.Small_notes_messageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Small_notes_messageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table small_notes_message
     *
     * @mbg.generated Wed Oct 19 18:43:22 CST 2022
     */
    long countByExample(Small_notes_messageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table small_notes_message
     *
     * @mbg.generated Wed Oct 19 18:43:22 CST 2022
     */
    int deleteByExample(Small_notes_messageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table small_notes_message
     *
     * @mbg.generated Wed Oct 19 18:43:22 CST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table small_notes_message
     *
     * @mbg.generated Wed Oct 19 18:43:22 CST 2022
     */
    int insert(Small_notes_message record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table small_notes_message
     *
     * @mbg.generated Wed Oct 19 18:43:22 CST 2022
     */
    int insertSelective(Small_notes_message record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table small_notes_message
     *
     * @mbg.generated Wed Oct 19 18:43:22 CST 2022
     */
    List<Small_notes_message> selectByExample(Small_notes_messageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table small_notes_message
     *
     * @mbg.generated Wed Oct 19 18:43:22 CST 2022
     */
    Small_notes_message selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table small_notes_message
     *
     * @mbg.generated Wed Oct 19 18:43:22 CST 2022
     */
    int updateByExampleSelective(@Param("record") Small_notes_message record, @Param("example") Small_notes_messageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table small_notes_message
     *
     * @mbg.generated Wed Oct 19 18:43:22 CST 2022
     */
    int updateByExample(@Param("record") Small_notes_message record, @Param("example") Small_notes_messageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table small_notes_message
     *
     * @mbg.generated Wed Oct 19 18:43:22 CST 2022
     */
    int updateByPrimaryKeySelective(Small_notes_message record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table small_notes_message
     *
     * @mbg.generated Wed Oct 19 18:43:22 CST 2022
     */
    int updateByPrimaryKey(Small_notes_message record);
}