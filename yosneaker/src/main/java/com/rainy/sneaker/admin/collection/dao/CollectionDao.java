package com.rainy.sneaker.admin.collection.dao;

import org.springframework.stereotype.Repository;

import com.rainy.sneaker.admin.collection.dto.Collection;
import com.rainy.sneaker.admin.collection.dto.CollectionExample;
import com.rainy.common.tools.db.SimpleMybatisSupport;
/**
 * 类描述:收藏
 * 创建人:Rainy(yang.lin)
 * 创建时间:2015-02-03 19:16:56
 * @version
 */
 
@Repository("collection")
public class CollectionDao extends SimpleMybatisSupport<Collection, Integer, CollectionExample>{
	
	@Override
    public String getMybatisMapperNamesapce() {
        return "com.rainy.sneaker.admin.collection.dao.CollectionMapper";
    }


}