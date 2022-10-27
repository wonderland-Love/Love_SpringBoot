package com.love.Mapper;

import com.love.module.User_love;
import com.love.module.User_loveExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface User_loveMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_love
     *
     * @mbg.generated Wed Oct 19 18:43:22 CST 2022
     */
    long countByExample(User_loveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_love
     *
     * @mbg.generated Wed Oct 19 18:43:22 CST 2022
     */
    int deleteByExample(User_loveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_love
     *
     * @mbg.generated Wed Oct 19 18:43:22 CST 2022
     */
    int insert(User_love record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_love
     *
     * @mbg.generated Wed Oct 19 18:43:22 CST 2022
     */
    int insertSelective(User_love record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_love
     *
     * @mbg.generated Wed Oct 19 18:43:22 CST 2022
     */
    List<User_love> selectByExample(User_loveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_love
     *
     * @mbg.generated Wed Oct 19 18:43:22 CST 2022
     */
    int updateByExampleSelective(@Param("record") User_love record, @Param("example") User_loveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_love
     *
     * @mbg.generated Wed Oct 19 18:43:22 CST 2022
     */
    int updateByExample(@Param("record") User_love record, @Param("example") User_loveExample example);
}