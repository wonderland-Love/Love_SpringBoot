package com.love.module;

public class Small_notes_message {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column small_notes_message.id
     *
     * @mbg.generated Wed Oct 19 18:43:22 CST 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column small_notes_message.small_notes_id
     *
     * @mbg.generated Wed Oct 19 18:43:22 CST 2022
     */
    private Integer smallNotesId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column small_notes_message.user_id
     *
     * @mbg.generated Wed Oct 19 18:43:22 CST 2022
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column small_notes_message.message
     *
     * @mbg.generated Wed Oct 19 18:43:22 CST 2022
     */
    private String message;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column small_notes_message.id
     *
     * @return the value of small_notes_message.id
     *
     * @mbg.generated Wed Oct 19 18:43:22 CST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column small_notes_message.id
     *
     * @param id the value for small_notes_message.id
     *
     * @mbg.generated Wed Oct 19 18:43:22 CST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column small_notes_message.small_notes_id
     *
     * @return the value of small_notes_message.small_notes_id
     *
     * @mbg.generated Wed Oct 19 18:43:22 CST 2022
     */
    public Integer getSmallNotesId() {
        return smallNotesId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column small_notes_message.small_notes_id
     *
     * @param smallNotesId the value for small_notes_message.small_notes_id
     *
     * @mbg.generated Wed Oct 19 18:43:22 CST 2022
     */
    public void setSmallNotesId(Integer smallNotesId) {
        this.smallNotesId = smallNotesId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column small_notes_message.user_id
     *
     * @return the value of small_notes_message.user_id
     *
     * @mbg.generated Wed Oct 19 18:43:22 CST 2022
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column small_notes_message.user_id
     *
     * @param userId the value for small_notes_message.user_id
     *
     * @mbg.generated Wed Oct 19 18:43:22 CST 2022
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column small_notes_message.message
     *
     * @return the value of small_notes_message.message
     *
     * @mbg.generated Wed Oct 19 18:43:22 CST 2022
     */
    public String getMessage() {
        return message;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column small_notes_message.message
     *
     * @param message the value for small_notes_message.message
     *
     * @mbg.generated Wed Oct 19 18:43:22 CST 2022
     */
    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }
}