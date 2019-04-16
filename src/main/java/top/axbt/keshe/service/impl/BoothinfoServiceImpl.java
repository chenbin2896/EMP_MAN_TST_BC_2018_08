package top.axbt.keshe.service.impl;
import java.util.List;

import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;


import org.springframework.stereotype.Service;
import top.axbt.entity.PageResult;
import top.axbt.keshe.dao.TbBoothinfoMapper;
import top.axbt.keshe.domain.TbBoothinfo;
import top.axbt.keshe.domain.TbBoothinfoExample;
import top.axbt.keshe.service.BoothinfoService;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class BoothinfoServiceImpl implements BoothinfoService {

	@Autowired
	private TbBoothinfoMapper boothinfoMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbBoothinfo> findAll() {
		return boothinfoMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbBoothinfo> page=   (Page<TbBoothinfo>) boothinfoMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbBoothinfo boothinfo) {
		boothinfoMapper.insert(boothinfo);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbBoothinfo boothinfo){
		boothinfoMapper.updateByPrimaryKey(boothinfo);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbBoothinfo findOne(Integer id){
		return boothinfoMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			boothinfoMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbBoothinfo boothinfo, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbBoothinfoExample example=new TbBoothinfoExample();
		TbBoothinfoExample.Criteria criteria = example.createCriteria();
		
		if(boothinfo!=null){			
						if(boothinfo.getTitle()!=null && boothinfo.getTitle().length()>0){
				criteria.andTitleLike("%"+boothinfo.getTitle()+"%");
			}
			if(boothinfo.getAddress()!=null && boothinfo.getAddress().length()>0){
				criteria.andAddressLike("%"+boothinfo.getAddress()+"%");
			}
	
		}
		
		Page<TbBoothinfo> page= (Page<TbBoothinfo>)boothinfoMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
