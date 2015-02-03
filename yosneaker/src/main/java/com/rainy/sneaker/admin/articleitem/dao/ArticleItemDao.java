package com.rainy.sneaker.admin.articleitem.dao;

import org.springframework.stereotype.Repository;

import com.rainy.sneaker.admin.articleitem.dto.ArticleItem;
import com.rainy.sneaker.admin.articleitem.dto.ArticleItemExample;
import com.rainy.common.tools.db.SimpleMybatisSupport;
/**
 * 类描述:测评项
 * 创建人:Rainy(yang.lin)
 * 创建时间:2015-02-03 19:14:38
 * @version
 */
 
@Repository("articleItem")
public class ArticleItemDao extends SimpleMybatisSupport<ArticleItem, Integer, ArticleItemExample>{
	
	@Override
    public String getMybatisMapperNamesapce() {
        return "com.rainy.sneaker.admin.articleitem.dao.ArticleItemMapper";
    }


}