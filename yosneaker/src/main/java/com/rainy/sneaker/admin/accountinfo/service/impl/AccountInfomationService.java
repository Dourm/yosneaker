package com.rainy.sneaker.admin.accountinfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.nd.common.util.ObjectUtils;
import com.rainy.sneaker.admin.accountinfo.dao.AccountInfomationDao;
import com.rainy.sneaker.admin.accountinfo.dto.AccountInfomation;
import com.rainy.sneaker.admin.accountinfo.dto.AccountInfomationExample;
import com.rainy.sneaker.admin.accountinfo.service.IAccountInfomationService;


/**
 * 类名称:AccountInfomationService
 * 类描述:个人数据管理
 * 创建人:rainy
 * 创建时间:2014-12-04 17:33:41
 * @version
 */
@Service
public class AccountInfomationService implements IAccountInfomationService {
	
	@Resource
	AccountInfomationDao accountInfomationDao;
	
	@Override
	public boolean insert(AccountInfomation record) {
		boolean flag = false;		
		int i = accountInfomationDao.insert(record);
		if(i>0){
			flag = true;
		}
		return flag;
	}

	@Override
	public boolean delete(Integer id) {
		boolean flag = false;
		if(ObjectUtils.isNotEmpty(id)){
			if(accountInfomationDao.deleteByPrimaryKey(id)>0){
				flag = true;
			}
		}
		return flag;
	}

	@Override
	public List<AccountInfomation> getList(AccountInfomationExample example) {
		return accountInfomationDao.selectByExample(example);
	}

	@Override
	public boolean update(AccountInfomation record) {
		boolean  flag = false;
		if(ObjectUtils.isNotEmpty(record.getAccountInformationId())){
			if(accountInfomationDao.updateByPrimaryKey(record)>0){
				flag = true;
			}
		}
		return flag;
	}
	@Override
	public boolean updateByPrimaryKeySelective(AccountInfomation record) {
		boolean  flag = false;
		if(ObjectUtils.isNotEmpty(record.getAccountInformationId())){
			if(accountInfomationDao.updateByPrimaryKeySelective(record)>0){
				flag = true;
			}
		}
		return flag;
	}
	@Override
	public AccountInfomation getById(Integer id) {
		return accountInfomationDao.selectByPrimaryKey(id);
	}

	@Override
	public int countByExample(AccountInfomationExample example) {
		return accountInfomationDao.countByExample(example);
	}
	
	}
