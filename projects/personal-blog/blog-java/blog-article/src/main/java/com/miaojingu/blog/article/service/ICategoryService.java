package com.miaojingu.blog.article.service;

import com.miaojingu.blog.article.req.CategoryREQ;
import com.miaojingu.blog.entities.Category;
import com.baomidou.mybatisplus.extension.service.IService;
import com.miaojingu.blog.util.base.Result;

/**
 * <p>
 * 文章分类表 服务类
 * </p>
 *
 * @author Jenson Miao
 * @since 2021-03-30
 */
public interface ICategoryService extends IService<Category> {
    /**
     * 分页条件查询分类信息
     * @param req 条件
     * @return
     */
    Result queryPage(CategoryREQ req);

}
