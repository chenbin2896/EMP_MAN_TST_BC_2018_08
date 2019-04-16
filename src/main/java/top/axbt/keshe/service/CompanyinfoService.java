package top.axbt.keshe.service;

import top.axbt.entity.PageResult;
import top.axbt.keshe.domain.TbCompanyinfo;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface CompanyinfoService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbCompanyinfo> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(TbCompanyinfo companyinfo);
	
	
	/**
	 * 修改
	 */
	public void update(TbCompanyinfo companyinfo);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbCompanyinfo findOne(Integer id);
	
	
	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Integer[] ids);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage(TbCompanyinfo companyinfo, int pageNum, int pageSize);
	
}
