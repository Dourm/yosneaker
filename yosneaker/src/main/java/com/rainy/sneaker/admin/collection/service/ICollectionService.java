package com.rainy.sneaker.admin.collection.service;

import java.util.List;
import com.rainy.sneaker.admin.collection.dto.Collection;
import com.rainy.sneaker.admin.collection.dto.CollectionExample;
import com.rainy.common.tools.db.Page;

/**
 * 类名称:ICollectionService<br/>
 * 类描述:收藏<br/>
 * 创建人:Rainy(yang.lin)<br/>
 * 创建时间:2015-02-03 19:16:56<br/>
 * @version
 */
public interface ICollectionService {
	
	/**
	 * 保存记录
	 * @param record
	 * @return
	 */
	public boolean insert(Collection record);
	/**
	 * 删除记录
	 * @param id
	 * @return
	 */
	public boolean delete(Integer id);
	/**
	 * 获取收藏类型
	 * @param example
	 * @return
	 */
	public List<Collection> getList(CollectionExample example);
	/**
	 * 更新
	 * @param record
	 * @return
	 */
	public boolean update(Collection record);
	/**
	 * 更新
	 * @param record
	 * @return
	 */
	public boolean updateByPrimaryKeySelective(Collection record);
	/**
	 * 获取记录
	 * @param id
	 * @return
	 */
	public Collection getById(Integer id);
	/**
	 * 统计数量
	 * @param Collection record
	 * @return
	 */
	int countByExample(CollectionExample example);
	
}
