package com.zzy.service.Impl;

import com.zzy.mapper.VdStuMapper;
import com.zzy.model.po.VdStu;
import com.zzy.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private VdStuMapper vdStuMapper;
    @Override
    public boolean check(String userName, String passWord) {
        List<VdStu> vdStus = vdStuMapper.selectAll();
        return true;
    }
}
