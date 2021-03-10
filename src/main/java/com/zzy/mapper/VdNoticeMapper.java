package com.zzy.mapper;

import com.zzy.model.dto.NoticeDTO;
import com.zzy.model.po.VdNotice;
import com.zzy.model.po.VdNoticeExample;
import java.util.List;

import com.zzy.model.vo.NoticeVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface VdNoticeMapper {
    long countByExample(VdNoticeExample example);

    int deleteByExample(VdNoticeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NoticeVO vo);

    int insertSelective(VdNotice record);

    List<NoticeDTO> selectAll();

    VdNotice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VdNotice record, @Param("example") VdNoticeExample example);

    int updateByExample(@Param("record") VdNotice record, @Param("example") VdNoticeExample example);

    int updateByPrimaryKeySelective(VdNotice record);

    int updateByPrimaryKey(NoticeVO vo);
}
