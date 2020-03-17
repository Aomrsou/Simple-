package com.zzy.service.Impl;

import com.zzy.mapper.VdFixMapper;
import com.zzy.mapper.VdLosMapper;
import com.zzy.model.dto.LosAndFixDTO;
import com.zzy.model.vo.LosAndFixVO;
import com.zzy.service.LosAndFixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LosAndFixServiceImpl implements LosAndFixService {
    @Autowired
    private VdLosMapper vdLosMapper;
    @Autowired
    private VdFixMapper vdFixMapper;
    @Override
    public List<LosAndFixDTO> listLos(LosAndFixVO vo) {
        List<LosAndFixDTO> losAndFixDTOS = vdLosMapper.selectAll(vo);
        return losAndFixDTOS;
    }

    @Override
    public List<LosAndFixDTO> listFix(LosAndFixVO vo) {
        List<LosAndFixDTO> losAndFixDTOS = vdFixMapper.selectAll(vo);
        return losAndFixDTOS;
    }

    @Override
    public Boolean updateLos(LosAndFixVO vo) {
        int i = vdLosMapper.updateByPrimaryKey(vo);
        return i == 0 ? false : true;
    }

    @Override
    public Boolean updateFix(LosAndFixVO vo) {
        int i = vdFixMapper.updateByPrimaryKey(vo);
        return i == 0 ? false : true;
    }

    @Override
    public Boolean addLos(LosAndFixVO vo) {
        int insert = vdLosMapper.insert(vo);
        return insert == 0 ? false : true;
    }

    @Override
    public Boolean addFix(LosAndFixVO vo) {
        int insert = vdFixMapper.insert(vo);
        return insert == 0 ? false : true;
    }

    @Override
    public Boolean deleteLos(LosAndFixVO vo) {
        int i = vdLosMapper.deleteByPrimaryKey(vo.getId());
        return i == 0 ? false : true;
    }

    @Override
    public Boolean deleteFix(LosAndFixVO vo) {
        int i = vdFixMapper.deleteByPrimaryKey(vo.getId());
        return i == 0 ? false : true;
    }
}
