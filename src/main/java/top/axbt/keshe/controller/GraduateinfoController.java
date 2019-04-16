package top.axbt.keshe.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.axbt.entity.PageResult;
import top.axbt.entity.Result;
import top.axbt.keshe.domain.TbGraduateinfo;
import top.axbt.keshe.service.GraduateinfoService;

import java.util.List;

/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/graduateinfo")
public class GraduateinfoController {

	@Autowired
	private GraduateinfoService graduateinfoService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbGraduateinfo> findAll(){
		return graduateinfoService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult findPage(int page, int rows){
		return graduateinfoService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param graduateinfo
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbGraduateinfo graduateinfo){
		try {
			graduateinfoService.add(graduateinfo);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param graduateinfo
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbGraduateinfo graduateinfo){
		try {
			graduateinfoService.update(graduateinfo);
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
	public TbGraduateinfo findOne(Integer id){
		return graduateinfoService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Integer [] ids){
		try {
			graduateinfoService.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
		/**
	 * 查询+分页
	 * @param graduateinfo
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search(@RequestBody TbGraduateinfo graduateinfo, int page, int rows  ){
		return graduateinfoService.findPage(graduateinfo, page, rows);		
	}
	
}
