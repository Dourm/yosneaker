package com.rainy.sneaker.admin.account.ctrl;
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

import com.rainy.common.tools.ObjectUtils;
import com.rainy.common.tools.db.Page;
import com.rainy.sneaker.BaseController;
import com.rainy.sneaker.ResponseBean;
import com.rainy.sneaker.ResponseState;
import com.rainy.sneaker.admin.account.dto.Account;
import com.rainy.sneaker.admin.account.dto.AccountExample;
import com.rainy.sneaker.admin.account.service.IAccountService;

/**
 * 类描述:用户管理
 * 创建人:rainy(yang.lin)
 * 创建时间:2014-12-04 14:55:8
 * @version
 */
@Controller
@RequestMapping("/admin/account")
public class AccountController extends BaseController{
	private final static Logger logger = Logger.getLogger(AccountController.class);
	
	@Resource
    IAccountService accountService;//用户管理
	/**
	 * 获取用户管理列表
	 * @param record
	 
	 
	 * @param page
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "",method=RequestMethod.GET)
	public @ResponseBody
	Object getListPage(Account record,Page page,HttpServletRequest request) {
		int total = 0;
		List<Account> list = new ArrayList<Account>();
		try{
			/*	查询条件    */
			AccountExample example = new AccountExample();
			
			//统计数量
			total = accountService.countByExample(example);
			if(total>0){
				list = accountService.getList(example);
			}
		}catch (Exception e) {
			logger.error("error", e);
		}
		return new ResponseBean<Account>(total,list);
	}
	
	/**
	 * 插入记录
	 * @param record
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "",method=RequestMethod.POST)
	public @ResponseBody
	Object insert(Account record,HttpServletRequest request) {
		ResponseState state = new ResponseState(false,"");
		try{			
			boolean isSuccess = accountService.insert(record);
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
				boolean isSuccess = accountService.delete(id);
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
	Object update(@RequestBody Account record,HttpServletRequest request) {
		ResponseState state = new ResponseState(false,"");
		try{			
			boolean isSuccess = accountService.update(record);
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
