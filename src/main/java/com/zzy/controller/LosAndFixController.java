package com.zzy.controller;

import com.alibaba.fastjson.JSON;
import com.zzy.model.dto.LosAndFixDTO;
import com.zzy.model.result.Result;
import com.zzy.model.vo.LosAndFixVO;
import com.zzy.service.LosAndFixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/losAndFix")
public class LosAndFixController {
    @Autowired
    private LosAndFixService losAndFixService;

    @CrossOrigin
    @RequestMapping("/listLos")
    public String listLos(@RequestBody LosAndFixVO vo) {
        List<LosAndFixDTO> list = losAndFixService.listLos(vo);
        Result result = new Result();
        result.setCode(200);
        result.setData(list);
        String s = JSON.toJSONString(result);
        return s;
    }
    @CrossOrigin
    @RequestMapping("/listFix")
    public String listFix(@RequestBody LosAndFixVO vo) {
        List<LosAndFixDTO> list = losAndFixService.listFix(vo);
        Result result = new Result();
        result.setCode(200);
        result.setData(list);
        String s = JSON.toJSONString(result);
        return s;
    }

    @CrossOrigin
    @RequestMapping("/updateLos")
    public String updateLos(@RequestBody LosAndFixVO vo) {
        losAndFixService.updateLos(vo);
        Result result = new Result();
        result.setCode(200);
        String s = JSON.toJSONString(result);
        return s;
    }

    @CrossOrigin
    @RequestMapping("/updateFix")
    public String updateFix(@RequestBody LosAndFixVO vo) {
        losAndFixService.updateFix(vo);
        Result result = new Result();
        result.setCode(200);
        String s = JSON.toJSONString(result);
        return s;
    }

    @CrossOrigin
    @RequestMapping("/addLos")
    public String addLos(@RequestBody LosAndFixVO vo) {
        losAndFixService.addLos(vo);
        Result result = new Result();
        result.setCode(200);
        String s = JSON.toJSONString(result);
        return s;
    }

    @CrossOrigin
    @RequestMapping("/addFix")
    public String addFix(@RequestBody LosAndFixVO vo) {
        losAndFixService.addFix(vo);
        Result result = new Result();
        result.setCode(200);
        String s = JSON.toJSONString(result);
        return s;
    }


    @CrossOrigin
    @RequestMapping("/deleteLos")
    public String deleteLos(@RequestBody LosAndFixVO vo) {
        losAndFixService.deleteLos(vo);
        Result result = new Result();
        result.setCode(200);
        String s = JSON.toJSONString(result);
        return s;
    }
    @CrossOrigin
    @RequestMapping("/deleteFix")
    public String deleteFix(@RequestBody LosAndFixVO vo) {
        losAndFixService.deleteFix(vo);
        Result result = new Result();
        result.setCode(200);
        String s = JSON.toJSONString(result);
        return s;
    }

}
