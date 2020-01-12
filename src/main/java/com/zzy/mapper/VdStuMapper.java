package com.zzy.mapper;

import com.zzy.model.po.VdStu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface VdStuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vd_stu
     *
     * @mbg.generated Wed Jan 08 14:27:59 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vd_stu
     *
     * @mbg.generated Wed Jan 08 14:27:59 CST 2020
     */
    int insert(VdStu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vd_stu
     *
     * @mbg.generated Wed Jan 08 14:27:59 CST 2020
     */
    VdStu selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vd_stu
     *
     * @mbg.generated Wed Jan 08 14:27:59 CST 2020
     */
    List<VdStu> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vd_stu
     *
     * @mbg.generated Wed Jan 08 14:27:59 CST 2020
     */
    int updateByPrimaryKey(VdStu record);

    VdStu checkUser(String username, String password);
}
