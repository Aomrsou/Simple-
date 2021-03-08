package com.zzy.mapper;

import com.zzy.model.dto.VdStudentFixDTO;
import com.zzy.model.po.VdStudentFix;
import com.zzy.model.po.VdStudentFixExample;
import java.util.List;

import com.zzy.model.vo.VdStudentFixVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface VdStudentFixMapper {
    long countByExample(VdStudentFixExample example);

    int deleteByExample(VdStudentFixExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(VdStudentFixVO vo);

    int insertSelective(VdStudentFix record);

    List<VdStudentFixDTO> selectByExample(VdStudentFixExample example);

    List<VdStudentFixDTO> selectInfo(VdStudentFixVO vo);

    VdStudentFix selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VdStudentFix record, @Param("example") VdStudentFixExample example);

    int updateByExample(@Param("record") VdStudentFix record, @Param("example") VdStudentFixExample example);

    int updateByPrimaryKeySelective(VdStudentFixVO vo);

    int updateByPrimaryKey(VdStudentFix record);
}
