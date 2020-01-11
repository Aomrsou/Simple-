package com.zzy.controller;

import com.zzy.model.result.Result;
import com.zzy.model.vo.RoleVO;
import com.zzy.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Autowired
    private RoleService roleService;

    @CrossOrigin
    @RequestMapping("/login")
    public Result hello(@RequestBody RoleVO roleVo){
        boolean check = roleService.check(roleVo.getUserName(), roleVo.getPassWord());
        Result result = new Result();
        if (check) {
            result.setCode(200);
        }else {
            result.setCode(404);
        }
        return result;
    }
}
