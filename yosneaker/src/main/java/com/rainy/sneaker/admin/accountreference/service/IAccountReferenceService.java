package com.rainy.sneaker.admin.accountreference.service;

import java.util.List;
import com.rainy.sneaker.admin.accountreference.dto.AccountReference;
import com.rainy.sneaker.admin.accountreference.dto.AccountReferenceExample;
import com.rainy.common.tools.db.Page;

/**
 * 类名称:IAccountReferenceService<br/>
 * 类描述:用户关系表<br/>
 * 创建人:Rainy(yang.lin)<br/>
 * 创建时间:2015-02-03 19:10:50<br/>
 * @version
 */
public interface IAccountReferenceService {
	
	/**
	 * 保存记录
	 * @param record
	 * @return
	 */
	public boolean insert(AccountReference record);
	/**
	 * 删除记录
	 * @param id
	 * @return
	 */
	public boolean delete(Integer id);
	/**
	 * 获取用户关系表类型
	 * @param example
	 * @return
	 */
	public List<AccountReference> getList(AccountReferenceExample example);
	/**
	 * 更新
	 * @param record
	 * @return
	 */
	public boolean update(AccountReference record);
	/**
	 * 更新
	 * @param record
	 * @return
	 */
	public boolean updateByPrimaryKeySelective(AccountReference record);
	/**
	 * 获取记录
	 * @param id
	 * @return
	 */
	public AccountReference getById(Integer id);
	/**
	 * 统计数量
	 * @param AccountReference record
	 * @return
	 */
	int countByExample(AccountReferenceExample example);
	
}
