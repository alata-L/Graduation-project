package com.autolight.entity;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Orderofreply {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_orderofreply.orderofreply_id
     *
     * @mbg.generated Sat Mar 28 14:31:08 CST 2020
     */
	
    private Integer orderofreply_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_orderofreply.orderofrepair_id
     *
     * @mbg.generated Sat Mar 28 14:31:08 CST 2020
     */
    private Integer orderofrepair_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_orderofreply.room_name
     *
     * @mbg.generated Sat Mar 28 14:31:08 CST 2020
     */
    private String room_name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_orderofreply.user_id
     *
     * @mbg.generated Sat Mar 28 14:31:08 CST 2020
     */
    private Integer user_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_orderofreply.user_name
     *
     * @mbg.generated Sat Mar 28 14:31:08 CST 2020
     */
    private String user_name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_orderofreply.orderofrepair_text
     *
     * @mbg.generated Sat Mar 28 14:31:08 CST 2020
     */
    private String orderofrepair_text;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_orderofreply.orderofrepair_time
     *
     * @mbg.generated Sat Mar 28 14:31:08 CST 2020
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date orderofrepair_time;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_orderofreply.replyuser_id
     *
     * @mbg.generated Sat Mar 28 14:31:08 CST 2020
     */
    private Integer replyuser_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_orderofreply.replyuser_name
     *
     * @mbg.generated Sat Mar 28 14:31:08 CST 2020
     */
    private String replyuser_name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_orderofreply.replytype_name
     *
     * @mbg.generated Sat Mar 28 14:31:08 CST 2020
     */
    private String replytype_name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_orderofreply.orderofreply_time
     *
     * @mbg.generated Sat Mar 28 14:31:08 CST 2020
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date orderofreply_time;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_orderofreply.orderofreply_id
     *
     * @return the value of tb_orderofreply.orderofreply_id
     *
     * @mbg.generated Sat Mar 28 14:31:08 CST 2020
     */
    public Integer getOrderofreply_id() {
        return orderofreply_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_orderofreply.orderofreply_id
     *
     * @param orderofreply_id the value for tb_orderofreply.orderofreply_id
     *
     * @mbg.generated Sat Mar 28 14:31:08 CST 2020
     */
    public void setOrderofreply_id(Integer orderofreply_id) {
        this.orderofreply_id = orderofreply_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_orderofreply.orderofrepair_id
     *
     * @return the value of tb_orderofreply.orderofrepair_id
     *
     * @mbg.generated Sat Mar 28 14:31:08 CST 2020
     */
    public Integer getOrderofrepair_id() {
        return orderofrepair_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_orderofreply.orderofrepair_id
     *
     * @param orderofrepair_id the value for tb_orderofreply.orderofrepair_id
     *
     * @mbg.generated Sat Mar 28 14:31:08 CST 2020
     */
    public void setOrderofrepair_id(Integer orderofrepair_id) {
        this.orderofrepair_id = orderofrepair_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_orderofreply.room_name
     *
     * @return the value of tb_orderofreply.room_name
     *
     * @mbg.generated Sat Mar 28 14:31:08 CST 2020
     */
    public String getRoom_name() {
        return room_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_orderofreply.room_name
     *
     * @param room_name the value for tb_orderofreply.room_name
     *
     * @mbg.generated Sat Mar 28 14:31:08 CST 2020
     */
    public void setRoom_name(String room_name) {
        this.room_name = room_name == null ? null : room_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_orderofreply.user_id
     *
     * @return the value of tb_orderofreply.user_id
     *
     * @mbg.generated Sat Mar 28 14:31:08 CST 2020
     */
    public Integer getUser_id() {
        return user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_orderofreply.user_id
     *
     * @param user_id the value for tb_orderofreply.user_id
     *
     * @mbg.generated Sat Mar 28 14:31:08 CST 2020
     */
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_orderofreply.user_name
     *
     * @return the value of tb_orderofreply.user_name
     *
     * @mbg.generated Sat Mar 28 14:31:08 CST 2020
     */
    public String getUser_name() {
        return user_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_orderofreply.user_name
     *
     * @param user_name the value for tb_orderofreply.user_name
     *
     * @mbg.generated Sat Mar 28 14:31:08 CST 2020
     */
    public void setUser_name(String user_name) {
        this.user_name = user_name == null ? null : user_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_orderofreply.orderofrepair_text
     *
     * @return the value of tb_orderofreply.orderofrepair_text
     *
     * @mbg.generated Sat Mar 28 14:31:08 CST 2020
     */
    public String getOrderofrepair_text() {
        return orderofrepair_text;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_orderofreply.orderofrepair_text
     *
     * @param orderofrepair_text the value for tb_orderofreply.orderofrepair_text
     *
     * @mbg.generated Sat Mar 28 14:31:08 CST 2020
     */
    public void setOrderofrepair_text(String orderofrepair_text) {
        this.orderofrepair_text = orderofrepair_text == null ? null : orderofrepair_text.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_orderofreply.orderofrepair_time
     *
     * @return the value of tb_orderofreply.orderofrepair_time
     *
     * @mbg.generated Sat Mar 28 14:31:08 CST 2020
     */
    public Date getOrderofrepair_time() {
        return orderofrepair_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_orderofreply.orderofrepair_time
     *
     * @param orderofrepair_time the value for tb_orderofreply.orderofrepair_time
     *
     * @mbg.generated Sat Mar 28 14:31:08 CST 2020
     */
    public void setOrderofrepair_time(Date orderofrepair_time) {
        this.orderofrepair_time = orderofrepair_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_orderofreply.replyuser_id
     *
     * @return the value of tb_orderofreply.replyuser_id
     *
     * @mbg.generated Sat Mar 28 14:31:08 CST 2020
     */
    public Integer getReplyuser_id() {
        return replyuser_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_orderofreply.replyuser_id
     *
     * @param replyuser_id the value for tb_orderofreply.replyuser_id
     *
     * @mbg.generated Sat Mar 28 14:31:08 CST 2020
     */
    public void setReplyuser_id(Integer replyuser_id) {
        this.replyuser_id = replyuser_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_orderofreply.replyuser_name
     *
     * @return the value of tb_orderofreply.replyuser_name
     *
     * @mbg.generated Sat Mar 28 14:31:08 CST 2020
     */
    public String getReplyuser_name() {
        return replyuser_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_orderofreply.replyuser_name
     *
     * @param replyuser_name the value for tb_orderofreply.replyuser_name
     *
     * @mbg.generated Sat Mar 28 14:31:08 CST 2020
     */
    public void setReplyuser_name(String replyuser_name) {
        this.replyuser_name = replyuser_name == null ? null : replyuser_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_orderofreply.replytype_name
     *
     * @return the value of tb_orderofreply.replytype_name
     *
     * @mbg.generated Sat Mar 28 14:31:08 CST 2020
     */
    public String getReplytype_name() {
        return replytype_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_orderofreply.replytype_name
     *
     * @param replytype_name the value for tb_orderofreply.replytype_name
     *
     * @mbg.generated Sat Mar 28 14:31:08 CST 2020
     */
    public void setReplytype_name(String replytype_name) {
        this.replytype_name = replytype_name == null ? null : replytype_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_orderofreply.orderofreply_time
     *
     * @return the value of tb_orderofreply.orderofreply_time
     *
     * @mbg.generated Sat Mar 28 14:31:08 CST 2020
     */
    public Date getOrderofreply_time() {
        return orderofreply_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_orderofreply.orderofreply_time
     *
     * @param orderofreply_time the value for tb_orderofreply.orderofreply_time
     *
     * @mbg.generated Sat Mar 28 14:31:08 CST 2020
     */
    public void setOrderofreply_time(Date orderofreply_time) {
        this.orderofreply_time = orderofreply_time;
    }
}