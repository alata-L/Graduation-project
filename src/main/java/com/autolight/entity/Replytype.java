package com.autolight.entity;

public class Replytype {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_replytype.reply_id
     *
     * @mbg.generated Thu Mar 26 16:10:56 CST 2020
     */
    private Integer reply_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_replytype.replytype_id
     *
     * @mbg.generated Thu Mar 26 16:10:56 CST 2020
     */
    private Integer replytype_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_replytype.replytype_name
     *
     * @mbg.generated Thu Mar 26 16:10:56 CST 2020
     */
    private String replytype_name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_replytype.reply_id
     *
     * @return the value of tb_replytype.reply_id
     *
     * @mbg.generated Thu Mar 26 16:10:56 CST 2020
     */
    public Integer getReply_id() {
        return reply_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_replytype.reply_id
     *
     * @param reply_id the value for tb_replytype.reply_id
     *
     * @mbg.generated Thu Mar 26 16:10:56 CST 2020
     */
    public void setReply_id(Integer reply_id) {
        this.reply_id = reply_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_replytype.replytype_id
     *
     * @return the value of tb_replytype.replytype_id
     *
     * @mbg.generated Thu Mar 26 16:10:56 CST 2020
     */
    public Integer getReplytype_id() {
        return replytype_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_replytype.replytype_id
     *
     * @param replytype_id the value for tb_replytype.replytype_id
     *
     * @mbg.generated Thu Mar 26 16:10:56 CST 2020
     */
    public void setReplytype_id(Integer replytype_id) {
        this.replytype_id = replytype_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_replytype.replytype_name
     *
     * @return the value of tb_replytype.replytype_name
     *
     * @mbg.generated Thu Mar 26 16:10:56 CST 2020
     */
    public String getReplytype_name() {
        return replytype_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_replytype.replytype_name
     *
     * @param replytype_name the value for tb_replytype.replytype_name
     *
     * @mbg.generated Thu Mar 26 16:10:56 CST 2020
     */
    public void setReplytype_name(String replytype_name) {
        this.replytype_name = replytype_name == null ? null : replytype_name.trim();
    }
}