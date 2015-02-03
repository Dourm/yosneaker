package com.rainy.sneaker.admin.appraisal.dao;

import org.springframework.stereotype.Repository;

import com.rainy.sneaker.admin.appraisal.dto.Appraisal;
import com.rainy.sneaker.admin.appraisal.dto.AppraisalExample;
import com.rainy.common.tools.db.SimpleMybatisSupport;
/**
 * 类描述:鉴定
 * 创建人:Rainy(yang.lin)
 * 创建时间:2015-02-03 19:13:22
 * @version
 */
 
@Repository("appraisal")
public class AppraisalDao extends SimpleMybatisSupport<Appraisal, Integer, AppraisalExample>{
	
	@Override
    public String getMybatisMapperNamesapce() {
        return "com.rainy.sneaker.admin.appraisal.dao.AppraisalMapper";
    }


}