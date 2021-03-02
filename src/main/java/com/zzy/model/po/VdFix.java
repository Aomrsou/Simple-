package com.zzy.model.po;

import lombok.Data;

@Data
public class VdFix {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vd_fix.id
     *
     * @mbg.generated Wed Jan 08 14:27:59 CST 2020
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vd_fix.title
     *
     * @mbg.generated Wed Jan 08 14:27:59 CST 2020
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vd_fix.content
     *
     * @mbg.generated Wed Jan 08 14:27:59 CST 2020
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vd_fix.flag
     *
     * @mbg.generated Wed Jan 08 14:27:59 CST 2020
     */
    private Integer flag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vd_fix.id
     *
     * @return the value of vd_fix.id
     * @mbg.generated Wed Jan 08 14:27:59 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vd_fix.id
     *
     * @param id the value for vd_fix.id
     * @mbg.generated Wed Jan 08 14:27:59 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vd_fix.title
     *
     * @return the value of vd_fix.title
     * @mbg.generated Wed Jan 08 14:27:59 CST 2020
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vd_fix.title
     *
     * @param title the value for vd_fix.title
     * @mbg.generated Wed Jan 08 14:27:59 CST 2020
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vd_fix.content
     *
     * @return the value of vd_fix.content
     * @mbg.generated Wed Jan 08 14:27:59 CST 2020
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vd_fix.content
     *
     * @param content the value for vd_fix.content
     * @mbg.generated Wed Jan 08 14:27:59 CST 2020
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vd_fix.flag
     *
     * @return the value of vd_fix.flag
     * @mbg.generated Wed Jan 08 14:27:59 CST 2020
     */
    public Integer getFlag() {
        return flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vd_fix.flag
     *
     * @param flag the value for vd_fix.flag
     * @mbg.generated Wed Jan 08 14:27:59 CST 2020
     */
    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}
