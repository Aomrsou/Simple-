package com.zzy.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.zzy.model.dto.StudentDTO;
import com.zzy.model.result.Result;
import com.zzy.model.vo.StudentVO;
import com.zzy.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stu")
public class StuController {
    @Autowired
    private StudentService studentService;

    @CrossOrigin
    @RequestMapping("/list")
    public String list(@RequestBody StudentVO vo){
        List<StudentDTO> studentDTOS = studentService.list(vo);
        Result result = new Result();
        result.setCode(200);
        result.setData(studentDTOS);
        return JSON.toJSONString(result);
    }
}
