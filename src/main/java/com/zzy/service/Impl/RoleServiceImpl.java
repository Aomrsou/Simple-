package com.zzy.service.Impl;

import com.zzy.mapper.VdRoleMapper;
import com.zzy.mapper.VdStuMapper;
import com.zzy.model.po.VdRole;
import com.zzy.model.po.VdStu;
import com.zzy.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private VdRoleMapper vdRoleMapper;
    @Override
    public boolean check(String userName, String passWord) {
        VdRole vdRole = vdRoleMapper.checkRole(userName, passWord);
        if(vdRole == null){
            return false;
        }else {
            return true;
        }
    }
}
