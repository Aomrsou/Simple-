package com.zzy.service;

import com.zzy.model.po.Category;

import java.util.List;

public interface CategoryService {
    public List<Category> list();
    public Category get(int id);
}
