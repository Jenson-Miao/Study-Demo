package com.miaojingu.blog.article.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.miaojingu.blog.article.req.CategoryREQ;
import com.miaojingu.blog.entities.Category;
import com.miaojingu.blog.article.mapper.CategoryMapper;
import com.miaojingu.blog.article.service.ICategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.miaojingu.blog.util.base.Result;
import org.apache.commons.lang.StringUtils;
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
        // 创建查询条件对象
        QueryWrapper<Category> wrapper = new QueryWrapper<>();
        // 查看是否有分类名称，并添加条件
        if(StringUtils.isNotEmpty(req.getName())){
            wrapper.like("name",req.getName());
        }
        // 查看是否有分类状态，并添加条件
        if(req.getStatus()!= null){
            wrapper.like("status",req.getStatus());
        }
        // 先根据status降序排列，然后按照sort升序排列
        wrapper.orderByDesc("status").orderByAsc("sort");

        // 第一个参数为分页对象，第二个参数为查询条件
        IPage<Category> categoryIPage = baseMapper.selectPage(req.getPage(),wrapper);
        return Result.ok(categoryIPage);
    }
}
