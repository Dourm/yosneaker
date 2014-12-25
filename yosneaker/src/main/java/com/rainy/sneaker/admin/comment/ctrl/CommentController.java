package com.rainy.sneaker.admin.comment.ctrl;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nd.common.base.BaseController;
import com.nd.common.json.ResponseBean;
import com.nd.common.json.ResponseState;
import com.nd.common.util.ObjectUtils;
import com.nd.common.util.Page;
import com.rainy.sneaker.admin.comment.dto.Comment;
import com.rainy.sneaker.admin.comment.dto.CommentExample;
import com.rainy.sneaker.admin.comment.service.ICommentService;

/**
 * 类描述:评论管理
 * 创建人:rainy(yang.lin)
 * 创建时间:2014-12-04 17:22:52
 * @version
 */
@Controller
@RequestMapping("/admin/comment")
public class CommentController extends BaseController{
	private final static Logger logger = Logger.getLogger(CommentController.class);
	
	@Resource
    ICommentService commentService;//评论管理
	/**
	 * 获取评论管理列表
	 * @param record
	 
	 
	 * @param page
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "",method=RequestMethod.GET)
	public @ResponseBody
	Object getListPage(Comment record,Page page,HttpServletRequest request) {
		int total = 0;
		List<Comment> list = new ArrayList<Comment>();
		try{
			/*	查询条件    */
			CommentExample example = new CommentExample();
			
			//统计数量
			total = commentService.countByExample(example);
			if(total>0){
				list = commentService.getList(example);
			}
		}catch (Exception e) {
			logger.error("error", e);
		}
		return new ResponseBean<Comment>(total,list);
	}
	
	/**
	 * 插入记录
	 * @param record
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "",method=RequestMethod.POST)
	public @ResponseBody
	Object insert(Comment record,HttpServletRequest request) {
		ResponseState state = new ResponseState(false,"");
		try{			
			boolean isSuccess = commentService.insert(record);
			if(isSuccess){//成功
				state.setSuccess(true);
				state.setMsg("");
			}
		}catch (Exception e) {
			e.printStackTrace();
			logger.error("error", e);
		}
		return state;
	}
	/**
	 * 删除记录
	 * @param record
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/{id}",method=RequestMethod.DELETE)
	public @ResponseBody
	Object delete(@PathVariable("id") Integer id,HttpServletRequest request) {
		ResponseState state = new ResponseState(false,"");
		try{
			if(ObjectUtils.isNotEmpty(id)){
				boolean isSuccess = commentService.delete(id);
				if(isSuccess){//删除成功
					state.setSuccess(true);
					state.setMsg("");
				}
			}	
		}catch (Exception e) {
			e.printStackTrace();
			logger.error("error", e);
		}
		return state;
	}
	/**
	 * 更新
	 * @param record
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/{id}",method=RequestMethod.PUT)
	public @ResponseBody
	Object update(@RequestBody Comment record,HttpServletRequest request) {
		ResponseState state = new ResponseState(false,"");
		try{			
			boolean isSuccess = commentService.update(record);
			if(isSuccess){//删除成功
				state.setSuccess(true);
				state.setMsg("");
			}
		}catch (Exception e) {
			logger.error("error", e);
		}
		return state;
	}

}
