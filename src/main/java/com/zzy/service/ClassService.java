package com.zzy.service;

import com.zzy.model.dto.ClassDTO;
import com.zzy.model.vo.ClassVO;

import java.util.List;

public interface ClassService {
    List<ClassDTO> list(ClassVO vo);

    Boolean useOrNone(ClassVO vo);

    Boolean add(ClassVO vo);
}
