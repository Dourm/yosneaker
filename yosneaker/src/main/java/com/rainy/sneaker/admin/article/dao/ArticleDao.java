package com.rainy.sneaker.admin.article.dao;

import org.springframework.stereotype.Repository;

import com.rainy.sneaker.admin.article.dto.Article;
import com.rainy.sneaker.admin.article.dto.ArticleExample;
import com.nd.common.dao.SimpleMybatisSupport;
/**
 * 类描述:测评管理
 * 创建人:rainy(yang.lin)
 * 创建时间:2014-12-04 17:11:21
 * @version
 */
 
@Repository("article")
public class ArticleDao extends SimpleMybatisSupport<Article, Integer, ArticleExample>{
	
	@Override
    public String getMybatisMapperNamesapce() {
        return "com.rainy.sneaker.admin.article.dao.ArticleMapper";
    }


}