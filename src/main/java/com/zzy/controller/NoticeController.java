package com.zzy.controller;

import com.alibaba.fastjson.JSON;
import com.zzy.model.dto.NoticeDTO;
import com.zzy.model.result.Result;
import com.zzy.model.vo.NoticeVO;
import com.zzy.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/notice")
public class NoticeController {

    @Autowired
    private NoticeService noticeService;

    @CrossOrigin
    @RequestMapping("/list")
    public String list(@RequestBody NoticeVO vo) {
        List<NoticeDTO> noticeDTOS = noticeService.selectAll();
        Result result = new Result();
        result.setCode(200);
        result.setData(noticeDTOS);
        return JSON.toJSONString(result);
    }

    @CrossOrigin
    @RequestMapping("/insert")
    public String insert(@RequestBody NoticeVO vo) {
        noticeService.insert(vo);
        Result result = new Result();
        result.setCode(200);
        return JSON.toJSONString(result);
    }
    @CrossOrigin
    @RequestMapping("/delete")
    public String delete(@RequestBody NoticeVO vo) {
        noticeService.deleteByPrimaryKey(vo.getId());
        Result result = new Result();
        result.setCode(200);
        return JSON.toJSONString(result);
    }

    @CrossOrigin
    @RequestMapping("/update")
    public String update(@RequestBody NoticeVO vo) {
        noticeService.updateByPrimaryKey(vo);
        Result result = new Result();
        result.setCode(200);
        return JSON.toJSONString(result);
    }
}
