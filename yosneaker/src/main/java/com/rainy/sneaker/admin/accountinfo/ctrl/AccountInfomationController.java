package com.rainy.sneaker.admin.accountinfo.ctrl;
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
import com.rainy.sneaker.admin.accountinfo.dto.AccountInfomation;
import com.rainy.sneaker.admin.accountinfo.dto.AccountInfomationExample;
import com.rainy.sneaker.admin.accountinfo.service.IAccountInfomationService;

/**
 * 类描述:个人数据管理
 * 创建人:rainy
 * 创建时间:2014-12-04 17:33:41
 * @version
 */
@Controller
@RequestMapping("/admin/accountInfomation")
public class AccountInfomationController extends BaseController{
	private final static Logger logger = Logger.getLogger(AccountInfomationController.class);
	
	@Resource
    IAccountInfomationService accountInfomationService;//个人数据管理
	/**
	 * 获取个人数据管理列表
	 * @param record
	 
	 
	 * @param page
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "",method=RequestMethod.GET)
	public @ResponseBody
	Object getListPage(AccountInfomation record,Page page,HttpServletRequest request) {
		int total = 0;
		List<AccountInfomation> list = new ArrayList<AccountInfomation>();
		try{
			/*	查询条件    */
			AccountInfomationExample example = new AccountInfomationExample();
			
			//统计数量
			total = accountInfomationService.countByExample(example);
			if(total>0){
				list = accountInfomationService.getList(example);
			}
		}catch (Exception e) {
			logger.error("error", e);
		}
		return new ResponseBean<AccountInfomation>(total,list);
	}
	
	/**
	 * 插入记录
	 * @param record
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "",method=RequestMethod.POST)
	public @ResponseBody
	Object insert(AccountInfomation record,HttpServletRequest request) {
		ResponseState state = new ResponseState(false,"");
		try{			
			boolean isSuccess = accountInfomationService.insert(record);
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
				boolean isSuccess = accountInfomationService.delete(id);
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
	Object update(@RequestBody AccountInfomation record,HttpServletRequest request) {
		ResponseState state = new ResponseState(false,"");
		try{			
			boolean isSuccess = accountInfomationService.update(record);
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
