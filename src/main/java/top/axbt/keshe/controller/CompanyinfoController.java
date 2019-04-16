package top.axbt.keshe.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.axbt.entity.PageResult;
import top.axbt.entity.Result;
import top.axbt.keshe.domain.TbCompanyinfo;
import top.axbt.keshe.service.CompanyinfoService;

import java.util.List;

/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/companyinfo")
public class CompanyinfoController {

	@Autowired
	private CompanyinfoService companyinfoService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbCompanyinfo> findAll(){
		return companyinfoService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult findPage(int page, int rows){
		return companyinfoService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param companyinfo
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbCompanyinfo companyinfo){
		try {
			companyinfoService.add(companyinfo);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param companyinfo
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbCompanyinfo companyinfo){
		try {
			companyinfoService.update(companyinfo);
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
	public TbCompanyinfo findOne(Integer id){
		return companyinfoService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Integer [] ids){
		try {
			companyinfoService.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
		/**
	 * 查询+分页
	 * @param companyinfo
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search(@RequestBody TbCompanyinfo companyinfo, int page, int rows  ){
		return companyinfoService.findPage(companyinfo, page, rows);		
	}
	
}
