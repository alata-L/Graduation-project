package com.autolight.entity;

import java.util.Date;

public class Replyasklight {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_replyasklight.replylight_id
     *
     * @mbg.generated Mon Mar 30 16:36:45 CST 2020
     */
    private Integer replylight_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_replyasklight.asklight_id
     *
     * @mbg.generated Mon Mar 30 16:36:45 CST 2020
     */
    private Integer asklight_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_replyasklight.room_name
     *
     * @mbg.generated Mon Mar 30 16:36:45 CST 2020
     */
    private String room_name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_replyasklight.user_id
     *
     * @mbg.generated Mon Mar 30 16:36:45 CST 2020
     */
    private Integer user_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_replyasklight.user_name
     *
     * @mbg.generated Mon Mar 30 16:36:45 CST 2020
     */
    private String user_name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_replyasklight.asklight_text
     *
     * @mbg.generated Mon Mar 30 16:36:45 CST 2020
     */
    private String asklight_text;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_replyasklight.asklight_time
     *
     * @mbg.generated Mon Mar 30 16:36:45 CST 2020
     */
    private Date asklight_time;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_replyasklight.replyuser_id
     *
     * @mbg.generated Mon Mar 30 16:36:45 CST 2020
     */
    private Integer replyuser_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_replyasklight.replyuser_name
     *
     * @mbg.generated Mon Mar 30 16:36:45 CST 2020
     */
    private String replyuser_name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_replyasklight.replylight_time
     *
     * @mbg.generated Mon Mar 30 16:36:45 CST 2020
     */
    private Date replylight_time;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_replyasklight.replylight_id
     *
     * @return the value of tb_replyasklight.replylight_id
     *
     * @mbg.generated Mon Mar 30 16:36:45 CST 2020
     */
    public Integer getReplylight_id() {
        return replylight_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_replyasklight.replylight_id
     *
     * @param replylight_id the value for tb_replyasklight.replylight_id
     *
     * @mbg.generated Mon Mar 30 16:36:45 CST 2020
     */
    public void setReplylight_id(Integer replylight_id) {
        this.replylight_id = replylight_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_replyasklight.asklight_id
     *
     * @return the value of tb_replyasklight.asklight_id
     *
     * @mbg.generated Mon Mar 30 16:36:45 CST 2020
     */
    public Integer getAsklight_id() {
        return asklight_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_replyasklight.asklight_id
     *
     * @param asklight_id the value for tb_replyasklight.asklight_id
     *
     * @mbg.generated Mon Mar 30 16:36:45 CST 2020
     */
    public void setAsklight_id(Integer asklight_id) {
        this.asklight_id = asklight_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_replyasklight.room_name
     *
     * @return the value of tb_replyasklight.room_name
     *
     * @mbg.generated Mon Mar 30 16:36:45 CST 2020
     */
    public String getRoom_name() {
        return room_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_replyasklight.room_name
     *
     * @param room_name the value for tb_replyasklight.room_name
     *
     * @mbg.generated Mon Mar 30 16:36:45 CST 2020
     */
    public void setRoom_name(String room_name) {
        this.room_name = room_name == null ? null : room_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_replyasklight.user_id
     *
     * @return the value of tb_replyasklight.user_id
     *
     * @mbg.generated Mon Mar 30 16:36:45 CST 2020
     */
    public Integer getUser_id() {
        return user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_replyasklight.user_id
     *
     * @param user_id the value for tb_replyasklight.user_id
     *
     * @mbg.generated Mon Mar 30 16:36:45 CST 2020
     */
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_replyasklight.user_name
     *
     * @return the value of tb_replyasklight.user_name
     *
     * @mbg.generated Mon Mar 30 16:36:45 CST 2020
     */
    public String getUser_name() {
        return user_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_replyasklight.user_name
     *
     * @param user_name the value for tb_replyasklight.user_name
     *
     * @mbg.generated Mon Mar 30 16:36:45 CST 2020
     */
    public void setUser_name(String user_name) {
        this.user_name = user_name == null ? null : user_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_replyasklight.asklight_text
     *
     * @return the value of tb_replyasklight.asklight_text
     *
     * @mbg.generated Mon Mar 30 16:36:45 CST 2020
     */
    public String getAsklight_text() {
        return asklight_text;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_replyasklight.asklight_text
     *
     * @param asklight_text the value for tb_replyasklight.asklight_text
     *
     * @mbg.generated Mon Mar 30 16:36:45 CST 2020
     */
    public void setAsklight_text(String asklight_text) {
        this.asklight_text = asklight_text == null ? null : asklight_text.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_replyasklight.asklight_time
     *
     * @return the value of tb_replyasklight.asklight_time
     *
     * @mbg.generated Mon Mar 30 16:36:45 CST 2020
     */
    public Date getAsklight_time() {
        return asklight_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_replyasklight.asklight_time
     *
     * @param asklight_time the value for tb_replyasklight.asklight_time
     *
     * @mbg.generated Mon Mar 30 16:36:45 CST 2020
     */
    public void setAsklight_time(Date asklight_time) {
        this.asklight_time = asklight_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_replyasklight.replyuser_id
     *
     * @return the value of tb_replyasklight.replyuser_id
     *
     * @mbg.generated Mon Mar 30 16:36:45 CST 2020
     */
    public Integer getReplyuser_id() {
        return replyuser_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_replyasklight.replyuser_id
     *
     * @param replyuser_id the value for tb_replyasklight.replyuser_id
     *
     * @mbg.generated Mon Mar 30 16:36:45 CST 2020
     */
    public void setReplyuser_id(Integer replyuser_id) {
        this.replyuser_id = replyuser_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_replyasklight.replyuser_name
     *
     * @return the value of tb_replyasklight.replyuser_name
     *
     * @mbg.generated Mon Mar 30 16:36:45 CST 2020
     */
    public String getReplyuser_name() {
        return replyuser_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_replyasklight.replyuser_name
     *
     * @param replyuser_name the value for tb_replyasklight.replyuser_name
     *
     * @mbg.generated Mon Mar 30 16:36:45 CST 2020
     */
    public void setReplyuser_name(String replyuser_name) {
        this.replyuser_name = replyuser_name == null ? null : replyuser_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_replyasklight.replylight_time
     *
     * @return the value of tb_replyasklight.replylight_time
     *
     * @mbg.generated Mon Mar 30 16:36:45 CST 2020
     */
    public Date getReplylight_time() {
        return replylight_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_replyasklight.replylight_time
     *
     * @param replylight_time the value for tb_replyasklight.replylight_time
     *
     * @mbg.generated Mon Mar 30 16:36:45 CST 2020
     */
    public void setReplylight_time(Date replylight_time) {
        this.replylight_time = replylight_time;
    }
}