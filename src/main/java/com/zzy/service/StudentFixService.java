package com.zzy.service;

import com.zzy.model.dto.VdStudentFixDTO;
import com.zzy.model.po.VdStudentFixExample;
import com.zzy.model.vo.VdStudentFixVO;

import java.util.List;

public interface StudentFixService {

    int insert(VdStudentFixVO vo);

    List<VdStudentFixDTO> selectByExample(VdStudentFixExample example);


    List<VdStudentFixDTO> selectInfo(VdStudentFixVO vo);

    int updateByPrimaryKeySelective(VdStudentFixVO vo);

    int deleteByPrimaryKey(Integer id);
}
