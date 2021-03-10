package com.zzy.service;

import com.zzy.model.dto.NoticeDTO;
import com.zzy.model.vo.NoticeVO;

import java.util.List;

public interface NoticeService {

    int updateByPrimaryKey(NoticeVO vo);

    List<NoticeDTO> selectAll();

    int deleteByPrimaryKey(Integer id);

    int insert(NoticeVO vo);
}
