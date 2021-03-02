package com.zzy.controller;

import com.alibaba.fastjson.JSON;
import com.zzy.model.dto.DorDTO;
import com.zzy.model.result.Result;
import com.zzy.model.vo.DorVO;
import com.zzy.service.DormitoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dor")
public class DorController {

    @Autowired
    private DormitoryService dormitoryService;

    @CrossOrigin
    @RequestMapping("/list")
    public String list(@RequestBody DorVO vo) {
        List<DorDTO> list = dormitoryService.list(vo);
        Result result = new Result();
        result.setCode(200);
        result.setData(list);
        String s = JSON.toJSONString(result);
        return s;
    }

    @CrossOrigin
    @GetMapping("/getlist")
    public String getlist(DorVO vo) {
        List<DorDTO> list = dormitoryService.list(vo);
        Result result = new Result();
        result.setCode(200);
        result.setData(list);
        String s = JSON.toJSONString(result);
        return s;
    }

    @CrossOrigin
    @RequestMapping("/addOrUpdate")
    public String addOrUpdate(@RequestBody DorVO vo) {
        if (vo.getDid() != null && vo.getDid() != 0) {
            //update
            dormitoryService.update(vo);
        } else {
            //insert
            vo.setBid(Integer.parseInt(vo.getBuildName()));
            dormitoryService.add(vo);
        }
        Result result = new Result();
        return "ues";
    }

    @CrossOrigin
    @RequestMapping("/delete")
    public String delete(@RequestBody DorVO vo) {
        dormitoryService.delete(vo);
        Result result = new Result();
        result.setCode(200);
        String s = JSON.toJSONString(result);
        return s;
    }
}
