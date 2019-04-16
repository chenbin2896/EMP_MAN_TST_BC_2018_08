package top.axbt.keshe.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.axbt.entity.PageResult;
import top.axbt.entity.Result;
import top.axbt.keshe.domain.TbBoothinfo;
import top.axbt.keshe.service.BoothinfoService;

import java.util.List;

/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/boothinfo")
public class BoothinfoController {

	@Autowired
	private BoothinfoService boothinfoService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbBoothinfo> findAll(){
		return boothinfoService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult findPage(int page, int rows){
		return boothinfoService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param boothinfo
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbBoothinfo boothinfo){
		try {
			boothinfoService.add(boothinfo);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param boothinfo
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbBoothinfo boothinfo){
		try {
			boothinfoService.update(boothinfo);
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
	public TbBoothinfo findOne(Integer id){
		return boothinfoService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Integer [] ids){
		try {
			boothinfoService.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
		/**
	 * 查询+分页
	 * @param boothinfo
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search(@RequestBody TbBoothinfo boothinfo, int page, int rows  ){
		return boothinfoService.findPage(boothinfo, page, rows);		
	}
	
}
