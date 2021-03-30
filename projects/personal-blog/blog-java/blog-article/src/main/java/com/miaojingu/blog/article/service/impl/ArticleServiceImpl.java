package com.miaojingu.blog.article.service.impl;

import com.miaojingu.blog.entities.Article;
import com.miaojingu.blog.article.mapper.ArticleMapper;
import com.miaojingu.blog.article.service.IArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文章信息表 服务实现类
 * </p>
 *
 * @author Jenson Miao
 * @since 2021-03-30
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements IArticleService {

}
