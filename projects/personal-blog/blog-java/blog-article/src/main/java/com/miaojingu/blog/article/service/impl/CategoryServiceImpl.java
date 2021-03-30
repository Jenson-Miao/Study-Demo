package com.miaojingu.blog.article.service.impl;

import com.miaojingu.blog.article.req.CategoryREQ;
import com.miaojingu.blog.entities.Category;
import com.miaojingu.blog.article.mapper.CategoryMapper;
import com.miaojingu.blog.article.service.ICategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.miaojingu.blog.util.base.Result;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文章分类表 服务实现类
 * </p>
 *
 * @author Jenson Miao
 * @since 2021-03-30
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements ICategoryService {

    @Override
    public Result queryPage(CategoryREQ req) {
        return null;
    }
}
