package com.rainy.sneaker.admin.account.service;

import java.util.List;

import com.rainy.sneaker.admin.account.dto.Account;
import com.rainy.sneaker.admin.account.dto.AccountExample;

/**
 * 类名称:IAccountService<br/>
 * 类描述:用户管理<br/>
 * 创建人:rainy(yang.lin)<br/>
 * 创建时间:2014-12-04 14:55:8<br/>
 * @version
 */
public interface IAccountService {
	
	/**
	 * 保存记录
	 * @param record
	 * @return
	 */
	public boolean insert(Account record);
	/**
	 * 删除记录
	 * @param id
	 * @return
	 */
	public boolean delete(Integer id);
	/**
	 * 获取用户管理类型
	 * @param example
	 * @return
	 */
	public List<Account> getList(AccountExample example);
	/**
	 * 更新
	 * @param record
	 * @return
	 */
	public boolean update(Account record);
	/**
	 * 更新
	 * @param record
	 * @return
	 */
	public boolean updateByPrimaryKeySelective(Account record);
	/**
	 * 获取记录
	 * @param id
	 * @return
	 */
	public Account getById(Integer id);
	/**
	 * 统计数量
	 * @param Account record
	 * @return
	 */
	int countByExample(AccountExample example);
	
}
