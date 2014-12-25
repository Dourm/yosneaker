package com.rainy.sneaker.admin.article.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.nd.common.util.ObjectUtils;
import com.rainy.sneaker.admin.article.dao.ArticleDao;
import com.rainy.sneaker.admin.article.dto.Article;
import com.rainy.sneaker.admin.article.dto.ArticleExample;
import com.rainy.sneaker.admin.article.service.IArticleService;


/**
 * 类名称:ArticleService
 * 类描述:测评管理
 * 创建人:rainy(yang.lin)
 * 创建时间:2014-12-04 17:11:21
 * @version
 */
@Service
public class ArticleService implements IArticleService {
	
	@Resource
	ArticleDao articleDao;
	
	@Override
	public boolean insert(Article record) {
		boolean flag = false;		
		int i = articleDao.insert(record);
		if(i>0){
			flag = true;
		}
		return flag;
	}

	@Override
	public boolean delete(Integer id) {
		boolean flag = false;
		if(ObjectUtils.isNotEmpty(id)){
			if(articleDao.deleteByPrimaryKey(id)>0){
				flag = true;
			}
		}
		return flag;
	}

	@Override
	public List<Article> getList(ArticleExample example) {
		return articleDao.selectByExample(example);
	}

	@Override
	public boolean update(Article record) {
		boolean  flag = false;
		if(ObjectUtils.isNotEmpty(record.getArticleId())){
			if(articleDao.updateByPrimaryKey(record)>0){
				flag = true;
			}
		}
		return flag;
	}
	@Override
	public boolean updateByPrimaryKeySelective(Article record) {
		boolean  flag = false;
		if(ObjectUtils.isNotEmpty(record.getArticleId())){
			if(articleDao.updateByPrimaryKeySelective(record)>0){
				flag = true;
			}
		}
		return flag;
	}
	@Override
	public Article getById(Integer id) {
		return articleDao.selectByPrimaryKey(id);
	}

	@Override
	public int countByExample(ArticleExample example) {
		return articleDao.countByExample(example);
	}
	
	}
