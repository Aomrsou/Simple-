package com.zzy.controller;

import com.alibaba.fastjson.JSON;
import com.zzy.mapper.VdStudentFixMapper;
import com.zzy.model.dto.VdStudentFixDTO;
import com.zzy.model.po.VdStudentFixExample;
import com.zzy.model.result.Result;
import com.zzy.model.vo.VdStudentFixVO;
import com.zzy.service.StudentFixService;
import com.zzy.service.UpLoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/studentFix")
public class StudentFixController {

    @Autowired
    private StudentFixService studentFixService;

    @Autowired
    private UpLoadService upLoadService;

    @CrossOrigin
    @RequestMapping("/insert")
    public String insertFix(@RequestBody VdStudentFixVO vo){
        int insert = studentFixService.insert(vo);
        Result result = new Result();
        if(insert == 1){
            result.setCode(200);
        }else{
            result.setCode(404);
        }
        return JSON.toJSONString(result);
    }
    @CrossOrigin
    @RequestMapping("/update")
    public String updateFix(@RequestBody VdStudentFixVO vo){
        int update = studentFixService.updateByPrimaryKeySelective(vo);
        Result result = new Result();
        if(update == 1){
            result.setCode(200);
        }else{
            result.setCode(404);
        }
        return JSON.toJSONString(result);
    }
    @CrossOrigin
    @RequestMapping("/list")
    public String listFix(@RequestBody VdStudentFixVO vo){
        List<VdStudentFixDTO> vdStudentFixDTOS = studentFixService.selectInfo(vo);
        Result result = new Result();
        if(CollectionUtils.isEmpty(vdStudentFixDTOS)){
            result.setCode(404);
        }else{
            result.setCode(200);
        }
        result.setData(vdStudentFixDTOS);
        return JSON.toJSONString(result);
    }

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
