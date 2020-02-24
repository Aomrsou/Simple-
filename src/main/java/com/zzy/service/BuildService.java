package com.zzy.service;

import com.zzy.model.dto.BuildDTO;
import com.zzy.model.dto.DorDTO;
import com.zzy.model.vo.BuildVO;

import java.util.List;

public interface BuildService {
    List<BuildDTO> list(BuildVO vo);

    Boolean add(BuildVO vo);

    Boolean update(BuildVO vo);

    List<DorDTO> delete(BuildVO vo);

    List<BuildDTO> buildSelect(BuildVO vo);
}
