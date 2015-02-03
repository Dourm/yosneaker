package com.rainy.sneaker.admin.accountreference.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.rainy.sneaker.admin.accountreference.dao.AccountReferenceDao;
import com.rainy.sneaker.admin.accountreference.dto.AccountReference;
import com.rainy.sneaker.admin.accountreference.dto.AccountReferenceExample;
import com.rainy.sneaker.admin.accountreference.dto.AccountReferenceExample.Criteria;
import com.rainy.sneaker.admin.accountreference.service.IAccountReferenceService;
import com.rainy.common.tools.ObjectUtils;
import com.rainy.common.tools.db.Page;


/**
 * 类名称:AccountReferenceService
 * 类描述:用户关系表
 * 创建人:Rainy(yang.lin)
 * 创建时间:2015-02-03 19:10:50
 * @version
 */
@Service
public class AccountReferenceService implements IAccountReferenceService {
	
	@Resource
	AccountReferenceDao accountReferenceDao;
	
	@Override
	public boolean insert(AccountReference record) {
		boolean flag = false;		
		int i = accountReferenceDao.insert(record);
		if(i>0){
			flag = true;
		}
		return flag;
	}

	@Override
	public boolean delete(Integer id) {
		boolean flag = false;
		if(ObjectUtils.isNotEmpty(id)){
			if(accountReferenceDao.deleteByPrimaryKey(id)>0){
				flag = true;
			}
		}
		return flag;
	}

	@Override
	public List<AccountReference> getList(AccountReferenceExample example) {
		return accountReferenceDao.selectByExample(example);
	}

	@Override
	public boolean update(AccountReference record) {
		boolean  flag = false;
		if(ObjectUtils.isNotEmpty(record.getAccountReferenceId())){
			if(accountReferenceDao.updateByPrimaryKey(record)>0){
				flag = true;
			}
		}
		return flag;
	}
	@Override
	public boolean updateByPrimaryKeySelective(AccountReference record) {
		boolean  flag = false;
		if(ObjectUtils.isNotEmpty(record.getAccountReferenceId())){
			if(accountReferenceDao.updateByPrimaryKeySelective(record)>0){
				flag = true;
			}
		}
		return flag;
	}
	@Override
	public AccountReference getById(Integer id) {
		return accountReferenceDao.selectByPrimaryKey(id);
	}

	@Override
	public int countByExample(AccountReferenceExample example) {
		return accountReferenceDao.countByExample(example);
	}
	
	}
