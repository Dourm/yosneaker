package com.rainy.sneaker.admin.accountinfo.service;

import java.util.List;

import com.rainy.sneaker.admin.accountinfo.dto.AccountInfomation;
import com.rainy.sneaker.admin.accountinfo.dto.AccountInfomationExample;

/**
 * 类名称:IAccountInfomationService<br/>
 * 类描述:个人数据管理<br/>
 * 创建人:rainy<br/>
 * 创建时间:2014-12-04 17:33:41<br/>
 * @version
 */
public interface IAccountInfomationService {
	
	/**
	 * 保存记录
	 * @param record
	 * @return
	 */
	public boolean insert(AccountInfomation record);
	/**
	 * 删除记录
	 * @param id
	 * @return
	 */
	public boolean delete(Integer id);
	/**
	 * 获取个人数据管理类型
	 * @param example
	 * @return
	 */
	public List<AccountInfomation> getList(AccountInfomationExample example);
	/**
	 * 更新
	 * @param record
	 * @return
	 */
	public boolean update(AccountInfomation record);
	/**
	 * 更新
	 * @param record
	 * @return
	 */
	public boolean updateByPrimaryKeySelective(AccountInfomation record);
	/**
	 * 获取记录
	 * @param id
	 * @return
	 */
	public AccountInfomation getById(Integer id);
	/**
	 * 统计数量
	 * @param AccountInfomation record
	 * @return
	 */
	int countByExample(AccountInfomationExample example);
	
}
