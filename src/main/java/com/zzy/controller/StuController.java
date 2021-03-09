package com.zzy.controller;

import com.alibaba.fastjson.JSON;
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
    public String list(@RequestBody StudentVO vo) {
        List<StudentDTO> studentDTOS = studentService.list(vo);
        Result result = new Result();
        result.setCode(200);
        result.setData(studentDTOS);
        return JSON.toJSONString(result);
    }

    @CrossOrigin
    @GetMapping("/getlist")
    public String getList(StudentVO vo) {
        List<StudentDTO> studentDTOS = studentService.list(vo);
        Result result = new Result();
        result.setCode(200);
        result.setData(studentDTOS);
        return JSON.toJSONString(result);
    }

    @CrossOrigin
    @RequestMapping("/addOrUpdate")
    public String add(@RequestBody StudentVO vo) {
        if (vo.getId() != null && vo.getId() != 0) {
            //update
            if ("noAdjust".equals(vo.getBuildName())) {
                vo.setDor(vo.getDid());
            }
            studentService.update(vo);
        } else {
            //insert
            studentService.add(vo);
        }
        Result result = new Result();
        result.setCode(200);
        return JSON.toJSONString(result);
    }

    @CrossOrigin
    @RequestMapping("/delete")
    public String delete(@RequestBody StudentVO vo) {
        studentService.delete(vo);
        Result result = new Result();
        result.setCode(200);
        return JSON.toJSONString(result);
    }

    @CrossOrigin
    @RequestMapping("/updatePass")
    public String updatePass(@RequestBody StudentVO vo) {
        studentService.updatePass(vo);
        Result result = new Result();
        result.setCode(200);
        return JSON.toJSONString(result);
    }

    @CrossOrigin
    @RequestMapping("/updateCover")
    public String updateCover(@RequestBody StudentVO vo) {
        studentService.updateCover(vo);
        Result result = new Result();
        result.setCode(200);
        return JSON.toJSONString(result);
    }
}
