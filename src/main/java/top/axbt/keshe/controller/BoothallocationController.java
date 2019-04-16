package top.axbt.keshe.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.axbt.entity.PageResult;
import top.axbt.entity.Result;
import top.axbt.keshe.domain.TbBoothallocation;
import top.axbt.keshe.service.BoothallocationService;

import java.util.List;

/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/boothallocation")
public class BoothallocationController {

	@Autowired
	private BoothallocationService boothallocationService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbBoothallocation> findAll(){
		return boothallocationService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult findPage(int page, int rows){
		return boothallocationService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param boothallocation
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbBoothallocation boothallocation){
		try {
			boothallocationService.add(boothallocation);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param boothallocation
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbBoothallocation boothallocation){
		try {
			boothallocationService.update(boothallocation);
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
	public TbBoothallocation findOne(Integer id){
		return boothallocationService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Integer [] ids){
		try {
			boothallocationService.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
		/**
	 * 查询+分页
	 * @param boothallocation
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search(@RequestBody TbBoothallocation boothallocation, int page, int rows  ){
		return boothallocationService.findPage(boothallocation, page, rows);		
	}
	
}
