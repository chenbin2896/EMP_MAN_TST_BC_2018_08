package top.axbt.keshe.service.impl;
import java.util.List;

import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import com.github.pagehelper.PageHelper;


import org.springframework.stereotype.Service;
import top.axbt.entity.PageResult;
import top.axbt.keshe.dao.TbBoothallocationMapper;
import top.axbt.keshe.domain.TbBoothallocation;
import top.axbt.keshe.domain.TbBoothallocationExample;
import top.axbt.keshe.service.BoothallocationService;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class BoothallocationServiceImpl implements BoothallocationService {

	@Autowired
	private TbBoothallocationMapper boothallocationMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbBoothallocation> findAll() {
		return boothallocationMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbBoothallocation> page=   (Page<TbBoothallocation>) boothallocationMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbBoothallocation boothallocation) {
		boothallocationMapper.insert(boothallocation);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbBoothallocation boothallocation){
		boothallocationMapper.updateByPrimaryKey(boothallocation);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbBoothallocation findOne(Integer id){
		return boothallocationMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			boothallocationMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbBoothallocation boothallocation, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbBoothallocationExample example=new TbBoothallocationExample();
		TbBoothallocationExample.Criteria criteria = example.createCriteria();
		
		if(boothallocation!=null){			
				
		}
		
		Page<TbBoothallocation> page= (Page<TbBoothallocation>)boothallocationMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
