package com.rainy.sneaker.admin.appraisal.service;

import java.util.List;
import com.rainy.sneaker.admin.appraisal.dto.Appraisal;
import com.rainy.sneaker.admin.appraisal.dto.AppraisalExample;
import com.rainy.common.tools.db.Page;

/**
 * 类名称:IAppraisalService<br/>
 * 类描述:鉴定<br/>
 * 创建人:Rainy(yang.lin)<br/>
 * 创建时间:2015-02-03 19:13:22<br/>
 * @version
 */
public interface IAppraisalService {
	
	/**
	 * 保存记录
	 * @param record
	 * @return
	 */
	public boolean insert(Appraisal record);
	/**
	 * 删除记录
	 * @param id
	 * @return
	 */
	public boolean delete(Integer id);
	/**
	 * 获取鉴定类型
	 * @param example
	 * @return
	 */
	public List<Appraisal> getList(AppraisalExample example);
	/**
	 * 更新
	 * @param record
	 * @return
	 */
	public boolean update(Appraisal record);
	/**
	 * 更新
	 * @param record
	 * @return
	 */
	public boolean updateByPrimaryKeySelective(Appraisal record);
	/**
	 * 获取记录
	 * @param id
	 * @return
	 */
	public Appraisal getById(Integer id);
	/**
	 * 统计数量
	 * @param Appraisal record
	 * @return
	 */
	int countByExample(AppraisalExample example);
	
}
