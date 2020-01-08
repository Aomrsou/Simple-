package com.zzy.controller;

import com.zzy.mapper.VdStuMapper;
import com.zzy.model.po.VdStu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private VdStuMapper vdStuMapper;

    @GetMapping("/")
    public String hello(){
        List<VdStu> vdStus = vdStuMapper.selectAll();
        vdStus.stream().forEach(c -> System.out.println(c.getName()));
        return "你好~";
    }
}
