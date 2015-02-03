package com.rainy.sneaker.admin.accountreference.dao;

import org.springframework.stereotype.Repository;

import com.rainy.sneaker.admin.accountreference.dto.AccountReference;
import com.rainy.sneaker.admin.accountreference.dto.AccountReferenceExample;
import com.rainy.common.tools.db.SimpleMybatisSupport;
/**
 * 类描述:用户关系表
 * 创建人:Rainy(yang.lin)
 * 创建时间:2015-02-03 19:10:50
 * @version
 */
 
@Repository("accountReference")
public class AccountReferenceDao extends SimpleMybatisSupport<AccountReference, Integer, AccountReferenceExample>{
	
	@Override
    public String getMybatisMapperNamesapce() {
        return "com.rainy.sneaker.admin.accountreference.dao.AccountReferenceMapper";
    }


}