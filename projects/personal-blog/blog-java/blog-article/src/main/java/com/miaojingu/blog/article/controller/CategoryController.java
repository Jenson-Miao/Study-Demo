package com.miaojingu.blog.article.controller;


import com.miaojingu.blog.article.req.CategoryREQ;
import com.miaojingu.blog.article.service.ICategoryService;
import com.miaojingu.blog.util.base.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 文章分类表 前端控制器
 * </p>
 *
 * @author Jenson Miao
 * @since 2021-03-30
 */
@Api(value="分类管理接口",description="分类管理接口，提供分类的增删改查") //Swagger
@RestController //所有方法都会返回json字符串进行响应
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private ICategoryService iCategoryService;

    /**
     * 分页条件查询分类信息
     * @param req
     * @return
     */
    @ApiOperation("根据分类名称与状态查询分类列表接口") //Swagger对接口的介绍
    @PostMapping("/search") //请求路径： /category/search
    public Result search(@RequestBody CategoryREQ req){

        return iCategoryService.queryPage(req);
    }
}
