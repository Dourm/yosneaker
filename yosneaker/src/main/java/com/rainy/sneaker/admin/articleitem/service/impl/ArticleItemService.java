package com.rainy.sneaker.admin.articleitem.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.rainy.sneaker.admin.articleitem.dao.ArticleItemDao;
import com.rainy.sneaker.admin.articleitem.dto.ArticleItem;
import com.rainy.sneaker.admin.articleitem.dto.ArticleItemExample;
import com.rainy.sneaker.admin.articleitem.dto.ArticleItemExample.Criteria;
import com.rainy.sneaker.admin.articleitem.service.IArticleItemService;
import com.rainy.common.tools.ObjectUtils;
import com.rainy.common.tools.db.Page;


/**
 * 类名称:ArticleItemService
 * 类描述:测评项
 * 创建人:Rainy(yang.lin)
 * 创建时间:2015-02-03 19:14:38
 * @version
 */
@Service
public class ArticleItemService implements IArticleItemService {
	
	@Resource
	ArticleItemDao articleItemDao;
	
	@Override
	public boolean insert(ArticleItem record) {
		boolean flag = false;		
		int i = articleItemDao.insert(record);
		if(i>0){
			flag = true;
		}
		return flag;
	}

	@Override
	public boolean delete(Integer id) {
		boolean flag = false;
		if(ObjectUtils.isNotEmpty(id)){
			if(articleItemDao.deleteByPrimaryKey(id)>0){
				flag = true;
			}
		}
		return flag;
	}

	@Override
	public List<ArticleItem> getList(ArticleItemExample example) {
		return articleItemDao.selectByExample(example);
	}

	@Override
	public boolean update(ArticleItem record) {
		boolean  flag = false;
		if(ObjectUtils.isNotEmpty(record.getItemArticleId())){
			if(articleItemDao.updateByPrimaryKey(record)>0){
				flag = true;
			}
		}
		return flag;
	}
	@Override
	public boolean updateByPrimaryKeySelective(ArticleItem record) {
		boolean  flag = false;
		if(ObjectUtils.isNotEmpty(record.getItemArticleId())){
			if(articleItemDao.updateByPrimaryKeySelective(record)>0){
				flag = true;
			}
		}
		return flag;
	}
	@Override
	public ArticleItem getById(Integer id) {
		return articleItemDao.selectByPrimaryKey(id);
	}

	@Override
	public int countByExample(ArticleItemExample example) {
		return articleItemDao.countByExample(example);
	}
	
	}
