package com.autolight.entity;

public class Light {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_light.light_id
     *
     * @mbg.generated Tue Mar 31 13:42:16 CST 2020
     */
    private Integer light_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_light.room_id
     *
     * @mbg.generated Tue Mar 31 13:42:16 CST 2020
     */
    private Integer room_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_light.room_name
     *
     * @mbg.generated Tue Mar 31 13:42:16 CST 2020
     */
    private String room_name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_light.lighttype_name
     *
     * @mbg.generated Tue Mar 31 13:42:16 CST 2020
     */
    private String lighttype_name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_light.light_id
     *
     * @return the value of tb_light.light_id
     *
     * @mbg.generated Tue Mar 31 13:42:16 CST 2020
     */
    public Integer getLight_id() {
        return light_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_light.light_id
     *
     * @param light_id the value for tb_light.light_id
     *
     * @mbg.generated Tue Mar 31 13:42:16 CST 2020
     */
    public void setLight_id(Integer light_id) {
        this.light_id = light_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_light.room_id
     *
     * @return the value of tb_light.room_id
     *
     * @mbg.generated Tue Mar 31 13:42:16 CST 2020
     */
    public Integer getRoom_id() {
        return room_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_light.room_id
     *
     * @param room_id the value for tb_light.room_id
     *
     * @mbg.generated Tue Mar 31 13:42:16 CST 2020
     */
    public void setRoom_id(Integer room_id) {
        this.room_id = room_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_light.room_name
     *
     * @return the value of tb_light.room_name
     *
     * @mbg.generated Tue Mar 31 13:42:16 CST 2020
     */
    public String getRoom_name() {
        return room_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_light.room_name
     *
     * @param room_name the value for tb_light.room_name
     *
     * @mbg.generated Tue Mar 31 13:42:16 CST 2020
     */
    public void setRoom_name(String room_name) {
        this.room_name = room_name == null ? null : room_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_light.lighttype_name
     *
     * @return the value of tb_light.lighttype_name
     *
     * @mbg.generated Tue Mar 31 13:42:16 CST 2020
     */
    public String getLighttype_name() {
        return lighttype_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_light.lighttype_name
     *
     * @param lighttype_name the value for tb_light.lighttype_name
     *
     * @mbg.generated Tue Mar 31 13:42:16 CST 2020
     */
    public void setLighttype_name(String lighttype_name) {
        this.lighttype_name = lighttype_name == null ? null : lighttype_name.trim();
    }
}