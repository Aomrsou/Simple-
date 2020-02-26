package com.zzy.controller;

import com.alibaba.fastjson.JSON;
import com.zzy.model.dto.ClassDTO;
import com.zzy.model.result.Result;
import com.zzy.model.vo.ClassVO;
import com.zzy.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/class")
public class ClassController {
    @Autowired
    private ClassService classService;

    @CrossOrigin
    @RequestMapping("/list")
    public String list(@RequestBody ClassVO vo) {
        List<ClassDTO> list = classService.list(vo);
        Result result = new Result();
        result.setCode(200);
        result.setData(list);
        String s = JSON.toJSONString(result);
        return s;
    }
    @CrossOrigin
    @RequestMapping("/getlist")
    public String getlist(ClassVO vo) {
        List<ClassDTO> list = classService.list(vo);
        Result result = new Result();
        result.setCode(200);
        result.setData(list);
        String s = JSON.toJSONString(result);
        return s;
    }
    @CrossOrigin
    @RequestMapping("/update")
    public String updateFlag(@RequestBody ClassVO vo) {
        classService.useOrNone(vo);
        Result result = new Result();
        result.setCode(200);
        String s = JSON.toJSONString(result);
        return s;
    }

    @CrossOrigin
    @RequestMapping("/add")
    public String add(@RequestBody ClassVO vo) {
        classService.add(vo);
        Result result = new Result();
        result.setCode(200);
        String s = JSON.toJSONString(result);
        return s;
    }
}
