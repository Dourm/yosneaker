package com.rainy.sneaker.admin.collection.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.rainy.sneaker.admin.collection.dao.CollectionDao;
import com.rainy.sneaker.admin.collection.dto.Collection;
import com.rainy.sneaker.admin.collection.dto.CollectionExample;
import com.rainy.sneaker.admin.collection.dto.CollectionExample.Criteria;
import com.rainy.sneaker.admin.collection.service.ICollectionService;
import com.rainy.common.tools.ObjectUtils;
import com.rainy.common.tools.db.Page;


/**
 * 类名称:CollectionService
 * 类描述:收藏
 * 创建人:Rainy(yang.lin)
 * 创建时间:2015-02-03 19:16:56
 * @version
 */
@Service
public class CollectionService implements ICollectionService {
	
	@Resource
	CollectionDao collectionDao;
	
	@Override
	public boolean insert(Collection record) {
		boolean flag = false;		
		int i = collectionDao.insert(record);
		if(i>0){
			flag = true;
		}
		return flag;
	}

	@Override
	public boolean delete(Integer id) {
		boolean flag = false;
		if(ObjectUtils.isNotEmpty(id)){
			if(collectionDao.deleteByPrimaryKey(id)>0){
				flag = true;
			}
		}
		return flag;
	}

	@Override
	public List<Collection> getList(CollectionExample example) {
		return collectionDao.selectByExample(example);
	}

	@Override
	public boolean update(Collection record) {
		boolean  flag = false;
		if(ObjectUtils.isNotEmpty(record.getCollectionId())){
			if(collectionDao.updateByPrimaryKey(record)>0){
				flag = true;
			}
		}
		return flag;
	}
	@Override
	public boolean updateByPrimaryKeySelective(Collection record) {
		boolean  flag = false;
		if(ObjectUtils.isNotEmpty(record.getCollectionId())){
			if(collectionDao.updateByPrimaryKeySelective(record)>0){
				flag = true;
			}
		}
		return flag;
	}
	@Override
	public Collection getById(Integer id) {
		return collectionDao.selectByPrimaryKey(id);
	}

	@Override
	public int countByExample(CollectionExample example) {
		return collectionDao.countByExample(example);
	}
	
	}
