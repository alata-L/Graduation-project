package com.autolight.entity;

public class Dianlustatus {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_dianlustatus.dianlutype_id
     *
     * @mbg.generated Thu Mar 26 16:10:56 CST 2020
     */
    private Integer dianlutype_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_dianlustatus.dianlustatus_id
     *
     * @mbg.generated Thu Mar 26 16:10:56 CST 2020
     */
    private Integer dianlustatus_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_dianlustatus.dianlustatus_name
     *
     * @mbg.generated Thu Mar 26 16:10:56 CST 2020
     */
    private String dianlustatus_name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_dianlustatus.dianlutype_id
     *
     * @return the value of tb_dianlustatus.dianlutype_id
     *
     * @mbg.generated Thu Mar 26 16:10:56 CST 2020
     */
    public Integer getDianlutype_id() {
        return dianlutype_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_dianlustatus.dianlutype_id
     *
     * @param dianlutype_id the value for tb_dianlustatus.dianlutype_id
     *
     * @mbg.generated Thu Mar 26 16:10:56 CST 2020
     */
    public void setDianlutype_id(Integer dianlutype_id) {
        this.dianlutype_id = dianlutype_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_dianlustatus.dianlustatus_id
     *
     * @return the value of tb_dianlustatus.dianlustatus_id
     *
     * @mbg.generated Thu Mar 26 16:10:56 CST 2020
     */
    public Integer getDianlustatus_id() {
        return dianlustatus_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_dianlustatus.dianlustatus_id
     *
     * @param dianlustatus_id the value for tb_dianlustatus.dianlustatus_id
     *
     * @mbg.generated Thu Mar 26 16:10:56 CST 2020
     */
    public void setDianlustatus_id(Integer dianlustatus_id) {
        this.dianlustatus_id = dianlustatus_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_dianlustatus.dianlustatus_name
     *
     * @return the value of tb_dianlustatus.dianlustatus_name
     *
     * @mbg.generated Thu Mar 26 16:10:56 CST 2020
     */
    public String getDianlustatus_name() {
        return dianlustatus_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_dianlustatus.dianlustatus_name
     *
     * @param dianlustatus_name the value for tb_dianlustatus.dianlustatus_name
     *
     * @mbg.generated Thu Mar 26 16:10:56 CST 2020
     */
    public void setDianlustatus_name(String dianlustatus_name) {
        this.dianlustatus_name = dianlustatus_name == null ? null : dianlustatus_name.trim();
    }
}