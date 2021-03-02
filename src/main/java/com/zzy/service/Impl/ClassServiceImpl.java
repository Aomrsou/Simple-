package com.zzy.service.Impl;

import com.zzy.mapper.VdClsMapper;
import com.zzy.model.dto.ClassDTO;
import com.zzy.model.vo.ClassVO;
import com.zzy.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassServiceImpl implements ClassService {
    @Autowired
    private VdClsMapper vdClsMapper;

    @Override
    public List<ClassDTO> list(ClassVO vo) {
        List<ClassDTO> classDTOS = vdClsMapper.selectAll(vo);
        return classDTOS;
    }

    @Override
    public Boolean useOrNone(ClassVO vo) {
        vdClsMapper.updateByPrimaryKey(vo);
        return true;
    }

    @Override
    public Boolean add(ClassVO vo) {
        vdClsMapper.insert(vo);
        return true;
    }
}
