package com.rainy.sneaker.admin.comment.service;

import java.util.List;

import com.rainy.sneaker.admin.comment.dto.Comment;
import com.rainy.sneaker.admin.comment.dto.CommentExample;

/**
 * 类名称:ICommentService<br/>
 * 类描述:评论管理<br/>
 * 创建人:rainy(yang.lin)<br/>
 * 创建时间:2014-12-04 17:22:52<br/>
 * @version
 */
public interface ICommentService {
	
	/**
	 * 保存记录
	 * @param record
	 * @return
	 */
	public boolean insert(Comment record);
	/**
	 * 删除记录
	 * @param id
	 * @return
	 */
	public boolean delete(Integer id);
	/**
	 * 获取评论管理类型
	 * @param example
	 * @return
	 */
	public List<Comment> getList(CommentExample example);
	/**
	 * 更新
	 * @param record
	 * @return
	 */
	public boolean update(Comment record);
	/**
	 * 更新
	 * @param record
	 * @return
	 */
	public boolean updateByPrimaryKeySelective(Comment record);
	/**
	 * 获取记录
	 * @param id
	 * @return
	 */
	public Comment getById(Integer id);
	/**
	 * 统计数量
	 * @param Comment record
	 * @return
	 */
	int countByExample(CommentExample example);
	
}
