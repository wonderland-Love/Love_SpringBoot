package com.love.module;

import java.util.Date;

public class Important_history {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column important_history.id
     *
     * @mbg.generated Wed Oct 19 18:43:23 CST 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column important_history.user_id
     *
     * @mbg.generated Wed Oct 19 18:43:23 CST 2022
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column important_history.location
     *
     * @mbg.generated Wed Oct 19 18:43:23 CST 2022
     */
    private String location;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column important_history.time
     *
     * @mbg.generated Wed Oct 19 18:43:23 CST 2022
     */
    private Date time;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column important_history.events
     *
     * @mbg.generated Wed Oct 19 18:43:23 CST 2022
     */
    private String events;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column important_history.id
     *
     * @return the value of important_history.id
     *
     * @mbg.generated Wed Oct 19 18:43:23 CST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column important_history.id
     *
     * @param id the value for important_history.id
     *
     * @mbg.generated Wed Oct 19 18:43:23 CST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column important_history.user_id
     *
     * @return the value of important_history.user_id
     *
     * @mbg.generated Wed Oct 19 18:43:23 CST 2022
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column important_history.user_id
     *
     * @param userId the value for important_history.user_id
     *
     * @mbg.generated Wed Oct 19 18:43:23 CST 2022
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column important_history.location
     *
     * @return the value of important_history.location
     *
     * @mbg.generated Wed Oct 19 18:43:23 CST 2022
     */
    public String getLocation() {
        return location;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column important_history.location
     *
     * @param location the value for important_history.location
     *
     * @mbg.generated Wed Oct 19 18:43:23 CST 2022
     */
    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column important_history.time
     *
     * @return the value of important_history.time
     *
     * @mbg.generated Wed Oct 19 18:43:23 CST 2022
     */
    public Date getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column important_history.time
     *
     * @param time the value for important_history.time
     *
     * @mbg.generated Wed Oct 19 18:43:23 CST 2022
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column important_history.events
     *
     * @return the value of important_history.events
     *
     * @mbg.generated Wed Oct 19 18:43:23 CST 2022
     */
    public String getEvents() {
        return events;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column important_history.events
     *
     * @param events the value for important_history.events
     *
     * @mbg.generated Wed Oct 19 18:43:23 CST 2022
     */
    public void setEvents(String events) {
        this.events = events == null ? null : events.trim();
    }
}