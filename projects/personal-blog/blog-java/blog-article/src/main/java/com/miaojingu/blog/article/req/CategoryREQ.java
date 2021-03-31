package com.miaojingu.blog.article.req;

import com.miaojingu.blog.entities.Category;
import com.miaojingu.blog.util.base.BaseRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 分类请求类，封装查询条件
 */
@ApiModel(value="CategoryREQ对象",description = "类别查询条件") // Swagger
@Data
@Accessors(chain = true)
public class CategoryREQ extends BaseRequest<Category> {
    /**
     * 分类名称
     */
    @ApiModelProperty("分类名称")
    private String name;
    /**
     * 状态：（1：正常，0：禁用）
     */
    @ApiModelProperty("状态：（1：正常，0：禁用）")
    private Integer status;
}
