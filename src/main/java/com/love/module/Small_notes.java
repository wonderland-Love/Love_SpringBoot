package com.love.module;

import java.util.Date;

public class Small_notes {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column small_notes.id
     *
     * @mbg.generated Wed Oct 19 18:43:22 CST 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column small_notes.user_id
     *
     * @mbg.generated Wed Oct 19 18:43:22 CST 2022
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column small_notes.release_time
     *
     * @mbg.generated Wed Oct 19 18:43:22 CST 2022
     */
    private Date releaseTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column small_notes.location
     *
     * @mbg.generated Wed Oct 19 18:43:22 CST 2022
     */
    private String location;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column small_notes.content
     *
     * @mbg.generated Wed Oct 19 18:43:22 CST 2022
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column small_notes.title
     *
     * @mbg.generated Wed Oct 19 18:43:22 CST 2022
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column small_notes.small_notes_img
     *
     * @mbg.generated Wed Oct 19 18:43:22 CST 2022
     */
    private byte[] smallNotesImg;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column small_notes.id
     *
     * @return the value of small_notes.id
     *
     * @mbg.generated Wed Oct 19 18:43:22 CST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column small_notes.id
     *
     * @param id the value for small_notes.id
     *
     * @mbg.generated Wed Oct 19 18:43:22 CST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column small_notes.user_id
     *
     * @return the value of small_notes.user_id
     *
     * @mbg.generated Wed Oct 19 18:43:22 CST 2022
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column small_notes.user_id
     *
     * @param userId the value for small_notes.user_id
     *
     * @mbg.generated Wed Oct 19 18:43:22 CST 2022
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column small_notes.release_time
     *
     * @return the value of small_notes.release_time
     *
     * @mbg.generated Wed Oct 19 18:43:22 CST 2022
     */
    public Date getReleaseTime() {
        return releaseTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column small_notes.release_time
     *
     * @param releaseTime the value for small_notes.release_time
     *
     * @mbg.generated Wed Oct 19 18:43:22 CST 2022
     */
    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column small_notes.location
     *
     * @return the value of small_notes.location
     *
     * @mbg.generated Wed Oct 19 18:43:22 CST 2022
     */
    public String getLocation() {
        return location;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column small_notes.location
     *
     * @param location the value for small_notes.location
     *
     * @mbg.generated Wed Oct 19 18:43:22 CST 2022
     */
    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column small_notes.content
     *
     * @return the value of small_notes.content
     *
     * @mbg.generated Wed Oct 19 18:43:22 CST 2022
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column small_notes.content
     *
     * @param content the value for small_notes.content
     *
     * @mbg.generated Wed Oct 19 18:43:22 CST 2022
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column small_notes.title
     *
     * @return the value of small_notes.title
     *
     * @mbg.generated Wed Oct 19 18:43:22 CST 2022
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column small_notes.title
     *
     * @param title the value for small_notes.title
     *
     * @mbg.generated Wed Oct 19 18:43:22 CST 2022
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column small_notes.small_notes_img
     *
     * @return the value of small_notes.small_notes_img
     *
     * @mbg.generated Wed Oct 19 18:43:22 CST 2022
     */
    public byte[] getSmallNotesImg() {
        return smallNotesImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column small_notes.small_notes_img
     *
     * @param smallNotesImg the value for small_notes.small_notes_img
     *
     * @mbg.generated Wed Oct 19 18:43:22 CST 2022
     */
    public void setSmallNotesImg(byte[] smallNotesImg) {
        this.smallNotesImg = smallNotesImg;
    }
}