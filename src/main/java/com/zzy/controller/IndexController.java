package com.zzy.controller;

import com.alibaba.fastjson.JSON;
import com.zzy.model.dto.StudentDTO;
import com.zzy.model.result.Result;
import com.zzy.model.vo.RoleVO;
import com.zzy.model.vo.StudentVO;
import com.zzy.service.RoleService;
import com.zzy.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexController {
    @Autowired
    private RoleService roleService;
    @Autowired
    private StudentService studentService;

    @CrossOrigin
    @RequestMapping("/login")
    public String hello(@RequestBody RoleVO roleVo){
        boolean check = roleService.check(roleVo.getName(), roleVo.getPassword());
        Result result = new Result();
        if (check) {
            result.setCode(200);
        }else {
            result.setCode(404);
        }
        String s = JSON.toJSONString(result);
        return s;
    }
    @CrossOrigin
    @RequestMapping("/loginStudent")
    public String hi(@RequestBody StudentVO vo){
        List<StudentDTO> studentDTOS = studentService.checkStudent(vo);
        Result result = new Result();
        if (CollectionUtils.isEmpty(studentDTOS)) {
            result.setCode(404);
        }else {
            result.setCode(200);
        }
        result.setData(studentDTOS);
        String s = JSON.toJSONString(result);
        return s;
    }
}
