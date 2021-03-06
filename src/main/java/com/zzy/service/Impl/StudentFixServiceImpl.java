package com.zzy.service.Impl;

import com.zzy.mapper.VdStudentFixMapper;
import com.zzy.model.dto.VdStudentFixDTO;
import com.zzy.model.po.VdStudentFixExample;
import com.zzy.model.vo.VdStudentFixVO;
import com.zzy.service.StudentFixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentFixServiceImpl implements StudentFixService {

    @Autowired
    private VdStudentFixMapper vdStudentFixMapper;

    @Override
    public int insert(VdStudentFixVO vo) {
        return vdStudentFixMapper.insert(vo);
    }

    @Override
    public List<VdStudentFixDTO> selectByExample(VdStudentFixExample example) {
        return vdStudentFixMapper.selectByExample(example);
    }

    @Override
    public int updateByPrimaryKeySelective(VdStudentFixVO vo) {
        return vdStudentFixMapper.updateByPrimaryKeySelective(vo);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return vdStudentFixMapper.deleteByPrimaryKey(id);
    }
}
