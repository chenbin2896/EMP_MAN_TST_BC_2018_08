package top.axbt.keshe.service;
import java.util.List;

import top.axbt.entity.PageResult;
import top.axbt.keshe.domain.TbGraduateinfo;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface GraduateinfoService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbGraduateinfo> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(TbGraduateinfo graduateinfo);
	
	
	/**
	 * 修改
	 */
	public void update(TbGraduateinfo graduateinfo);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbGraduateinfo findOne(Integer id);
	
	
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
	public PageResult findPage(TbGraduateinfo graduateinfo, int pageNum, int pageSize);
	
}
