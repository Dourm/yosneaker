package com.rainy.sneaker.admin.account.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.rainy.common.tools.ObjectUtils;
import com.rainy.sneaker.admin.account.dao.AccountDao;
import com.rainy.sneaker.admin.account.dto.Account;
import com.rainy.sneaker.admin.account.dto.AccountExample;
import com.rainy.sneaker.admin.account.service.IAccountService;


/**
 * 类名称:AccountService
 * 类描述:用户管理
 * 创建人:rainy(yang.lin)
 * 创建时间:2014-12-04 14:55:8
 * @version
 */
@Service
public class AccountService implements IAccountService {
	
	@Resource
	AccountDao accountDao;
	
	@Override
	public boolean insert(Account record) {
		boolean flag = false;		
		int i = accountDao.insert(record);
		if(i>0){
			flag = true;
		}
		return flag;
	}

	@Override
	public boolean delete(Integer id) {
		boolean flag = false;
		if(ObjectUtils.isNotEmpty(id)){
			if(accountDao.deleteByPrimaryKey(id)>0){
				flag = true;
			}
		}
		return flag;
	}

	@Override
	public List<Account> getList(AccountExample example) {
		return accountDao.selectByExample(example);
	}

	@Override
	public boolean update(Account record) {
		boolean  flag = false;
		if(ObjectUtils.isNotEmpty(record.getAccountId())){
			if(accountDao.updateByPrimaryKey(record)>0){
				flag = true;
			}
		}
		return flag;
	}
	@Override
	public boolean updateByPrimaryKeySelective(Account record) {
		boolean  flag = false;
		if(ObjectUtils.isNotEmpty(record.getAccountId())){
			if(accountDao.updateByPrimaryKeySelective(record)>0){
				flag = true;
			}
		}
		return flag;
	}
	@Override
	public Account getById(Integer id) {
		return accountDao.selectByPrimaryKey(id);
	}

	@Override
	public int countByExample(AccountExample example) {
		return accountDao.countByExample(example);
	}
	
	}
