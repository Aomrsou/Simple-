package com.zzy.service.Impl;

import com.zzy.mapper.VdBuildMapper;
import com.zzy.mapper.VdDorMapper;
import com.zzy.model.dto.BuildDTO;
import com.zzy.model.dto.DorDTO;
import com.zzy.model.po.VdBuild;
import com.zzy.model.vo.BuildVO;
import com.zzy.model.vo.DorVO;
import com.zzy.service.BuildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collections;
import java.util.List;

@Service
public class BuildServiceImpl implements BuildService {
    @Autowired
    private VdBuildMapper vdBuildMapper;
    @Autowired
    private VdDorMapper vdDorMapper;

    @Override
    public List<BuildDTO> list(BuildVO vo) {
        List<BuildDTO> buildDTOS = vdBuildMapper.selectByCondition(vo);
        return buildDTOS;
    }

    @Override
    public Boolean add(BuildVO vo) {
        VdBuild vd = new VdBuild();
        vd.setId(vo.getBid());
        vd.setName(vo.getBuildName());
        vd.setNo(vo.getBuildNo());
        int insert = vdBuildMapper.insert(vd);
        return insert == 0 ? false : true;
    }

    @Override
    public Boolean update(BuildVO vo) {
        VdBuild vd = new VdBuild();
        vd.setId(vo.getBid());
        vd.setName(vo.getBuildName());
        vd.setNo(vo.getBuildNo());
        int update = vdBuildMapper.updateByPrimaryKey(vd);
        return update == 0 ? false : true;
    }

    @Override
    public List<DorDTO> delete(BuildVO vo) {
        DorVO dorVO = new DorVO();
        dorVO.setBid(vo.getBid());
        List<DorDTO> dorDTOS = vdDorMapper.selectIsEmpty(dorVO);
        if (CollectionUtils.isEmpty(dorDTOS)) {
            vdDorMapper.deleteByBid(vo.getBid());
            vdBuildMapper.deleteByPrimaryKey(vo.getBid());
        }
        return dorDTOS;
    }

    @Override
    public List<BuildDTO> buildSelect(BuildVO vo) {
        List<BuildDTO> buildDTOS = vdBuildMapper.buildSelect(vo);
        return buildDTOS;
    }
}
