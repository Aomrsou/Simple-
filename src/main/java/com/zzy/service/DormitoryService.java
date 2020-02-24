package com.zzy.service;

import com.zzy.model.dto.DorDTO;
import com.zzy.model.vo.DorVO;

import java.util.List;

public interface DormitoryService {
    List<DorDTO> list(DorVO vo);
    Boolean update(DorVO vo);
    Boolean add(DorVO vo);
    Boolean delete(DorVO vo);
}
