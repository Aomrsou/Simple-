package com.zzy.service.Impl;

import com.zzy.mapper.VdDorMapper;
import com.zzy.model.dto.DorDTO;
import com.zzy.model.vo.DorVO;
import com.zzy.service.DormitoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DormitoryServiceImpl implements DormitoryService {
    @Autowired
    private VdDorMapper vdDorMapper;
    @Override
    public List<DorDTO> list(DorVO vo) {
        List<DorDTO> dorDTOS = vdDorMapper.selectAllDormitory(vo);
        return dorDTOS;
    }

    @Override
    public Boolean update(DorVO vo) {
        vdDorMapper.updateByPrimaryKey(vo);
        return true;
    }

    @Override
    public Boolean add(DorVO vo) {
        vdDorMapper.insert(vo);
        return true;
    }

    @Override
    public Boolean delete(DorVO vo) {
        vdDorMapper.deleteByPrimaryKey(vo.getDid());
        return true;
    }
}
