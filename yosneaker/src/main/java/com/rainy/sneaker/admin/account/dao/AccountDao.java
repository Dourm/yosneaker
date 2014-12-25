package com.rainy.sneaker.admin.account.dao;

import org.springframework.stereotype.Repository;

import com.rainy.sneaker.admin.account.dto.Account;
import com.rainy.sneaker.admin.account.dto.AccountExample;
import com.nd.common.dao.SimpleMybatisSupport;
/**
 * 类描述:用户管理
 * 创建人:rainy(yang.lin)
 * 创建时间:2014-12-04 14:55:8
 * @version
 */
 
@Repository("account")
public class AccountDao extends SimpleMybatisSupport<Account, Integer, AccountExample>{
	
	@Override
    public String getMybatisMapperNamesapce() {
        return "com.rainy.sneaker.admin.account.dao.AccountMapper";
    }


}