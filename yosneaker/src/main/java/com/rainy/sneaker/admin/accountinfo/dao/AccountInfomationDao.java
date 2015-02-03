package com.rainy.sneaker.admin.accountinfo.dao;

import org.springframework.stereotype.Repository;

import com.rainy.common.tools.db.SimpleMybatisSupport;
import com.rainy.sneaker.admin.accountinfo.dto.AccountInfomation;
import com.rainy.sneaker.admin.accountinfo.dto.AccountInfomationExample;
/**
 * 类描述:个人数据管理
 * 创建人:rainy
 * 创建时间:2014-12-04 17:33:41
 * @version
 */
 
@Repository("accountInfomation")
public class AccountInfomationDao extends SimpleMybatisSupport<AccountInfomation, Integer, AccountInfomationExample>{
	
	@Override
    public String getMybatisMapperNamesapce() {
        return "com.rainy.sneaker.admin.accountinfo.dao.AccountInfomationMapper";
    }


}