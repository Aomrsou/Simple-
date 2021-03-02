package com.zzy.controller;

import com.alibaba.fastjson.JSON;
import com.zzy.mapper.VdStudentFixMapper;
import com.zzy.model.result.Result;
import com.zzy.service.UpLoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/studentFix")
public class StudentFixController {

    @Autowired
    private VdStudentFixMapper vdStudentFixMapper;
    @Autowired
    private UpLoadService upLoadService;


    @CrossOrigin
    @RequestMapping("/imgUpload")
    public String saveImg(MultipartFile file) throws Exception {
        String s = upLoadService.upLoadImg(file);
        List<String> resultString = new ArrayList<>();
        Result result = new Result();
        if(StringUtils.isEmpty(s)){
            result.setCode(404);
        } else {
            result.setCode(200);
            resultString.add(s);
            result.setData(resultString);
        }
        return JSON.toJSONString(result);
    }
}
