package com.rainy.sneaker.admin.appraisal.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.rainy.sneaker.admin.appraisal.dao.AppraisalDao;
import com.rainy.sneaker.admin.appraisal.dto.Appraisal;
import com.rainy.sneaker.admin.appraisal.dto.AppraisalExample;
import com.rainy.sneaker.admin.appraisal.dto.AppraisalExample.Criteria;
import com.rainy.sneaker.admin.appraisal.service.IAppraisalService;
import com.rainy.common.tools.ObjectUtils;
import com.rainy.common.tools.db.Page;


/**
 * 类名称:AppraisalService
 * 类描述:鉴定
 * 创建人:Rainy(yang.lin)
 * 创建时间:2015-02-03 19:13:22
 * @version
 */
@Service
public class AppraisalService implements IAppraisalService {
	
	@Resource
	AppraisalDao appraisalDao;
	
	@Override
	public boolean insert(Appraisal record) {
		boolean flag = false;		
		int i = appraisalDao.insert(record);
		if(i>0){
			flag = true;
		}
		return flag;
	}

	@Override
	public boolean delete(Integer id) {
		boolean flag = false;
		if(ObjectUtils.isNotEmpty(id)){
			if(appraisalDao.deleteByPrimaryKey(id)>0){
				flag = true;
			}
		}
		return flag;
	}

	@Override
	public List<Appraisal> getList(AppraisalExample example) {
		return appraisalDao.selectByExample(example);
	}

	@Override
	public boolean update(Appraisal record) {
		boolean  flag = false;
		if(ObjectUtils.isNotEmpty(record.getAppraisalId())){
			if(appraisalDao.updateByPrimaryKey(record)>0){
				flag = true;
			}
		}
		return flag;
	}
	@Override
	public boolean updateByPrimaryKeySelective(Appraisal record) {
		boolean  flag = false;
		if(ObjectUtils.isNotEmpty(record.getAppraisalId())){
			if(appraisalDao.updateByPrimaryKeySelective(record)>0){
				flag = true;
			}
		}
		return flag;
	}
	@Override
	public Appraisal getById(Integer id) {
		return appraisalDao.selectByPrimaryKey(id);
	}

	@Override
	public int countByExample(AppraisalExample example) {
		return appraisalDao.countByExample(example);
	}
	
	}
