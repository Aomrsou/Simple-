package com.zzy.service.Impl;

import com.zzy.mapper.VdNoticeMapper;
import com.zzy.model.dto.NoticeDTO;
import com.zzy.model.vo.NoticeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeServiceImpl implements com.zzy.service.NoticeService {
    @Autowired
    private VdNoticeMapper vdNoticeMapper;
    @Override
    public int updateByPrimaryKey(NoticeVO vo) {
        return vdNoticeMapper.updateByPrimaryKey(vo);
    }

    @Override
    public List<NoticeDTO> selectAll() {
        return vdNoticeMapper.selectAll();
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return vdNoticeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(NoticeVO vo) {
        return vdNoticeMapper.insert(vo);
    }
}
