package com.autolight.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Orderofrepair {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_orderofrepair.orderofrepair_id
     *
     * @mbg.generated Tue Mar 31 13:42:16 CST 2020
     */
    private Integer orderofrepair_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_orderofrepair.room_name
     *
     * @mbg.generated Tue Mar 31 13:42:16 CST 2020
     */
    private String room_name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_orderofrepair.user_id
     *
     * @mbg.generated Tue Mar 31 13:42:16 CST 2020
     */
    private Integer user_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_orderofrepair.user_name
     *
     * @mbg.generated Tue Mar 31 13:42:16 CST 2020
     */
    private String user_name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_orderofrepair.orderofrepair_text
     *
     * @mbg.generated Tue Mar 31 13:42:16 CST 2020
     */
    private String orderofrepair_text;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_orderofrepair.orderofrepair_time
     *
     * @mbg.generated Tue Mar 31 13:42:16 CST 2020
     */

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date orderofrepair_time;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_orderofrepair.orderofrepair_id
     *
     * @return the value of tb_orderofrepair.orderofrepair_id
     *
     * @mbg.generated Tue Mar 31 13:42:16 CST 2020
     */
    public Integer getOrderofrepair_id() {
        return orderofrepair_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_orderofrepair.orderofrepair_id
     *
     * @param orderofrepair_id the value for tb_orderofrepair.orderofrepair_id
     *
     * @mbg.generated Tue Mar 31 13:42:16 CST 2020
     */
    public void setOrderofrepair_id(Integer orderofrepair_id) {
        this.orderofrepair_id = orderofrepair_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_orderofrepair.room_name
     *
     * @return the value of tb_orderofrepair.room_name
     *
     * @mbg.generated Tue Mar 31 13:42:16 CST 2020
     */
    public String getRoom_name() {
        return room_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_orderofrepair.room_name
     *
     * @param room_name the value for tb_orderofrepair.room_name
     *
     * @mbg.generated Tue Mar 31 13:42:16 CST 2020
     */
    public void setRoom_name(String room_name) {
        this.room_name = room_name == null ? null : room_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_orderofrepair.user_id
     *
     * @return the value of tb_orderofrepair.user_id
     *
     * @mbg.generated Tue Mar 31 13:42:16 CST 2020
     */
    public Integer getUser_id() {
        return user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_orderofrepair.user_id
     *
     * @param user_id the value for tb_orderofrepair.user_id
     *
     * @mbg.generated Tue Mar 31 13:42:16 CST 2020
     */
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_orderofrepair.user_name
     *
     * @return the value of tb_orderofrepair.user_name
     *
     * @mbg.generated Tue Mar 31 13:42:16 CST 2020
     */
    public String getUser_name() {
        return user_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_orderofrepair.user_name
     *
     * @param user_name the value for tb_orderofrepair.user_name
     *
     * @mbg.generated Tue Mar 31 13:42:16 CST 2020
     */
    public void setUser_name(String user_name) {
        this.user_name = user_name == null ? null : user_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_orderofrepair.orderofrepair_text
     *
     * @return the value of tb_orderofrepair.orderofrepair_text
     *
     * @mbg.generated Tue Mar 31 13:42:16 CST 2020
     */
    public String getOrderofrepair_text() {
        return orderofrepair_text;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_orderofrepair.orderofrepair_text
     *
     * @param orderofrepair_text the value for tb_orderofrepair.orderofrepair_text
     *
     * @mbg.generated Tue Mar 31 13:42:16 CST 2020
     */
    public void setOrderofrepair_text(String orderofrepair_text) {
        this.orderofrepair_text = orderofrepair_text == null ? null : orderofrepair_text.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_orderofrepair.orderofrepair_time
     *
     * @return the value of tb_orderofrepair.orderofrepair_time
     *
     * @mbg.generated Tue Mar 31 13:42:16 CST 2020
     */
    public Date getOrderofrepair_time() {
        return orderofrepair_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_orderofrepair.orderofrepair_time
     *
     * @param orderofrepair_time the value for tb_orderofrepair.orderofrepair_time
     *
     * @mbg.generated Tue Mar 31 13:42:16 CST 2020
     */
    public void setOrderofrepair_time(Date orderofrepair_time) {
        this.orderofrepair_time = orderofrepair_time;
    }
}