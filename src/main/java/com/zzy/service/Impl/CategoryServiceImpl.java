package com.zzy.service.Impl;

import com.zzy.mapper.CategoryDAO;
import com.zzy.model.po.Category;
import com.zzy.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryDAO categoryDAO;

    @Override
    public List<Category> list() {
        return categoryDAO.findAll();
    }

    @Override
    public Category get(int id) {
        Category c = categoryDAO.findById(id).orElse(null);
        return c;
    }
}
