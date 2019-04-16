package top.axbt.keshe.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.axbt.entity.PageResult;
import top.axbt.entity.Result;
import top.axbt.keshe.domain.TbInformation;
import top.axbt.keshe.service.InformationService;

import java.util.List;

/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/information")
public class InformationController {

	@Autowired
	private InformationService informationService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbInformation> findAll(){
		return informationService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult findPage(int page, int rows){
		return informationService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param information
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbInformation information){
		try {
			informationService.add(information);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param information
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbInformation information){
		try {
			informationService.update(information);
			return new Result(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}	
	
	/**
	 * 获取实体
	 * @param id
	 * @return
	 */
	@RequestMapping("/findOne")
	public TbInformation findOne(Integer id){
		return informationService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Integer [] ids){
		try {
			informationService.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
		/**
	 * 查询+分页
	 * @param information
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search(@RequestBody TbInformation information, int page, int rows  ){
		return informationService.findPage(information, page, rows);		
	}
	
}
