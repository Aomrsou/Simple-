package com.zzy.service.Impl;

import com.zzy.mapper.VdStuMapper;
import com.zzy.model.dto.StudentDTO;
import com.zzy.model.vo.StudentVO;
import com.zzy.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private VdStuMapper stuMapper;

    public List<StudentDTO> list(StudentVO vo) {
        List<StudentDTO> studentDTOS = stuMapper.selectAllDTO(vo);
        return studentDTOS;
    }

    @Override
    public void add(StudentVO vo) {
        stuMapper.insert(vo);
    }

    @Override
    public void delete(StudentVO vo) {
        stuMapper.deleteByPrimaryKey(vo.getId());
    }

    @Override
    public void update(StudentVO vo) {
        stuMapper.updateByPrimaryKey(vo);
    }

    @Override
    public List<StudentDTO> checkStudent(StudentVO vo) {
        List<StudentDTO> studentDTOS = stuMapper.checkUser(vo.getName(), vo.getPassword());
        return studentDTOS;
    }
}
