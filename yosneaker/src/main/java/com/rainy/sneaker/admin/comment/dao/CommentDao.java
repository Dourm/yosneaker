package com.rainy.sneaker.admin.comment.dao;

import org.springframework.stereotype.Repository;

import com.rainy.sneaker.admin.comment.dto.Comment;
import com.rainy.sneaker.admin.comment.dto.CommentExample;
import com.nd.common.dao.SimpleMybatisSupport;
/**
 * 类描述:评论管理
 * 创建人:rainy(yang.lin)
 * 创建时间:2014-12-04 17:22:52
 * @version
 */
 
@Repository("comment")
public class CommentDao extends SimpleMybatisSupport<Comment, Integer, CommentExample>{
	
	@Override
    public String getMybatisMapperNamesapce() {
        return "com.rainy.sneaker.admin.comment.dao.CommentMapper";
    }


}