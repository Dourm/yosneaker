package com.rainy.sneaker.admin.collection.ctrl;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import com.rainy.sneaker.BaseController;
import com.rainy.sneaker.admin.collection.dto.Collection;
import com.rainy.sneaker.admin.collection.dto.CollectionExample;
import com.rainy.sneaker.admin.collection.service.ICollectionService;
import com.rainy.sneaker.ResponseBean;
import com.rainy.sneaker.ResponseState;
import com.rainy.common.tools.db.Page;
import com.rainy.common.tools.ObjectUtils;

/**
 * 类描述:收藏
 * 创建人:Rainy(yang.lin)
 * 创建时间:2015-02-03 19:16:56
 * @version
 */
@Controller
@RequestMapping("/admin/collection")
public class CollectionController extends BaseController{
	private final static Logger logger = Logger.getLogger(CollectionController.class);
	
	@Resource
    ICollectionService collectionService;//收藏
	/**
	 * 获取收藏列表
	 * @param record
	 
	 
	 * @param page
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "",method=RequestMethod.GET)
	public @ResponseBody
	Object getListPage(Collection record,Page page,HttpServletRequest request) {
		int total = 0;
		List<Collection> list = new ArrayList<Collection>();
		try{
			/*	查询条件    */
			CollectionExample example = new CollectionExample();
			
			//统计数量
			total = collectionService.countByExample(example);
			if(total>0){
				list = collectionService.getList(example);
			}
		}catch (Exception e) {
			logger.error("error", e);
		}
		return new ResponseBean<Collection>(total,list);
	}
	
	/**
	 * 插入记录
	 * @param record
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "",method=RequestMethod.POST)
	public @ResponseBody
	Object insert(Collection record,HttpServletRequest request) {
		ResponseState state = new ResponseState(false,"");
		try{			
			boolean isSuccess = collectionService.insert(record);
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
				boolean isSuccess = collectionService.delete(id);
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
	Object update(@RequestBody Collection record,HttpServletRequest request) {
		ResponseState state = new ResponseState(false,"");
		try{			
			boolean isSuccess = collectionService.update(record);
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
