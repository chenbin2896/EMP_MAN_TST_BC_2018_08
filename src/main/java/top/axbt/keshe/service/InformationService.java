package top.axbt.keshe.service;

import top.axbt.entity.PageResult;
import top.axbt.keshe.domain.TbInformation;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface InformationService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbInformation> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(TbInformation information);
	
	
	/**
	 * 修改
	 */
	public void update(TbInformation information);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbInformation findOne(Integer id);
	
	
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
	public PageResult findPage(TbInformation information, int pageNum, int pageSize);
	
}
