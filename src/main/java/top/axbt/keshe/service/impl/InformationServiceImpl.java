package top.axbt.keshe.service.impl;
import java.util.List;

import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;


import org.springframework.stereotype.Service;
import top.axbt.entity.PageResult;
import top.axbt.keshe.dao.TbInformationMapper;
import top.axbt.keshe.domain.TbInformation;
import top.axbt.keshe.domain.TbInformationExample;
import top.axbt.keshe.service.InformationService;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class InformationServiceImpl implements InformationService {

	@Autowired
	private TbInformationMapper informationMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbInformation> findAll() {
		return informationMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbInformation> page=   (Page<TbInformation>) informationMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbInformation information) {
		informationMapper.insert(information);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbInformation information){
		informationMapper.updateByPrimaryKey(information);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbInformation findOne(Integer id){
		return informationMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			informationMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbInformation information, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbInformationExample example=new TbInformationExample();
		TbInformationExample.Criteria criteria = example.createCriteria();
		
		if(information!=null){			
						if(information.getTitle()!=null && information.getTitle().length()>0){
				criteria.andTitleLike("%"+information.getTitle()+"%");
			}
			if(information.getType()!=null && information.getType().length()>0){
				criteria.andTypeLike("%"+information.getType()+"%");
			}
			if(information.getPublishMan()!=null && information.getPublishMan().length()>0){
				criteria.andPublishManLike("%"+information.getPublishMan()+"%");
			}
			if(information.getComment()!=null && information.getComment().length()>0){
				criteria.andCommentLike("%"+information.getComment()+"%");
			}
	
		}
		
		Page<TbInformation> page= (Page<TbInformation>)informationMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
