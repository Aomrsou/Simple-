package com.zzy.service;

import com.zzy.model.dto.StudentDTO;
import com.zzy.model.vo.StudentVO;

import java.util.List;

public interface StudentService {
    List<StudentDTO> list(StudentVO vo);
}
