package com.rainy.sneaker.admin.comment.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.rainy.common.tools.ObjectUtils;
import com.rainy.sneaker.admin.comment.dao.CommentDao;
import com.rainy.sneaker.admin.comment.dto.Comment;
import com.rainy.sneaker.admin.comment.dto.CommentExample;
import com.rainy.sneaker.admin.comment.service.ICommentService;


/**
 * 类名称:CommentService
 * 类描述:评论管理
 * 创建人:rainy(yang.lin)
 * 创建时间:2014-12-04 17:22:52
 * @version
 */
@Service
public class CommentService implements ICommentService {
	
	@Resource
	CommentDao commentDao;
	
	@Override
	public boolean insert(Comment record) {
		boolean flag = false;		
		int i = commentDao.insert(record);
		if(i>0){
			flag = true;
		}
		return flag;
	}

	@Override
	public boolean delete(Integer id) {
		boolean flag = false;
		if(ObjectUtils.isNotEmpty(id)){
			if(commentDao.deleteByPrimaryKey(id)>0){
				flag = true;
			}
		}
		return flag;
	}

	@Override
	public List<Comment> getList(CommentExample example) {
		return commentDao.selectByExample(example);
	}

	@Override
	public boolean update(Comment record) {
		boolean  flag = false;
		if(ObjectUtils.isNotEmpty(record.getArticleCommentId())){
			if(commentDao.updateByPrimaryKey(record)>0){
				flag = true;
			}
		}
		return flag;
	}
	@Override
	public boolean updateByPrimaryKeySelective(Comment record) {
		boolean  flag = false;
		if(ObjectUtils.isNotEmpty(record.getArticleCommentId())){
			if(commentDao.updateByPrimaryKeySelective(record)>0){
				flag = true;
			}
		}
		return flag;
	}
	@Override
	public Comment getById(Integer id) {
		return commentDao.selectByPrimaryKey(id);
	}

	@Override
	public int countByExample(CommentExample example) {
		return commentDao.countByExample(example);
	}
	
	}
