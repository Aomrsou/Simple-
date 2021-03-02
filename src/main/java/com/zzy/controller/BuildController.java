package com.zzy.controller;

import com.alibaba.fastjson.JSON;
import com.zzy.model.dto.BuildDTO;
import com.zzy.model.dto.DorDTO;
import com.zzy.model.result.Result;
import com.zzy.model.vo.BuildVO;
import com.zzy.service.BuildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/build")
public class BuildController {
    @Autowired
    private BuildService buildService;

    @CrossOrigin
    @RequestMapping("/list")
    public String list(@RequestBody BuildVO vo) {
        List<BuildDTO> list = buildService.list(vo);
        Result result = new Result();
        result.setCode(200);
        result.setData(list);
        String s = JSON.toJSONString(result);
        return s;
    }

    @CrossOrigin
    @RequestMapping("/getlist")
    public String getlist(BuildVO vo) {
        List<BuildDTO> list = buildService.list(vo);
        Result result = new Result();
        result.setCode(200);
        result.setData(list);
        String s = JSON.toJSONString(result);
        return s;
    }

    @CrossOrigin
    @RequestMapping("/addOrUpdate")
    public String addOrUpdate(@RequestBody BuildVO vo) {
        Boolean success = false;
        if (StringUtils.isEmpty(vo.getBid())) {
            //insert
            success = buildService.add(vo);
        } else {
            //update
            success = buildService.update(vo);
        }
        Result result = new Result();
        if (success) {
            result.setCode(200);
        } else {
            result.setCode(404);
        }
        String s = JSON.toJSONString(result);
        return s;
    }

    @CrossOrigin
    @RequestMapping("/delete")
    public String delete(@RequestBody BuildVO vo) {
        List<DorDTO> delete = buildService.delete(vo);
        Result result = new Result();
        if (CollectionUtils.isEmpty(delete)) {
            result.setCode(200);
        } else {
            result.setCode(404);
        }
        result.setData(delete);
        String s = JSON.toJSONString(result);
        return s;
    }

    @CrossOrigin
    @GetMapping("/buildSelect")
    public String buildSelect(BuildVO vo) {
        List<BuildDTO> list = buildService.buildSelect(vo);
        Result result = new Result();
        result.setCode(200);
        result.setData(list);
        String s = JSON.toJSONString(result);
        return s;
    }
}
