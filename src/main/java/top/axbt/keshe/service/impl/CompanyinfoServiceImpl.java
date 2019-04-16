package top.axbt.keshe.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;


import org.springframework.stereotype.Service;
import top.axbt.entity.PageResult;
import top.axbt.keshe.dao.TbCompanyinfoMapper;
import top.axbt.keshe.domain.TbCompanyinfo;
import top.axbt.keshe.domain.TbCompanyinfoExample;
import top.axbt.keshe.service.CompanyinfoService;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class CompanyinfoServiceImpl implements CompanyinfoService {

	@Autowired
	private TbCompanyinfoMapper companyinfoMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbCompanyinfo> findAll() {
		return companyinfoMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbCompanyinfo> page=   (Page<TbCompanyinfo>) companyinfoMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbCompanyinfo companyinfo) {
		companyinfoMapper.insert(companyinfo);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbCompanyinfo companyinfo){
		companyinfoMapper.updateByPrimaryKey(companyinfo);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbCompanyinfo findOne(Integer id){
		return companyinfoMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			companyinfoMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbCompanyinfo companyinfo, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbCompanyinfoExample example=new TbCompanyinfoExample();
		TbCompanyinfoExample.Criteria criteria = example.createCriteria();
		
		if(companyinfo!=null){			
						if(companyinfo.getName()!=null && companyinfo.getName().length()>0){
				criteria.andNameLike("%"+companyinfo.getName()+"%");
			}
			if(companyinfo.getAddress()!=null && companyinfo.getAddress().length()>0){
				criteria.andAddressLike("%"+companyinfo.getAddress()+"%");
			}
			if(companyinfo.getNature()!=null && companyinfo.getNature().length()>0){
				criteria.andNatureLike("%"+companyinfo.getNature()+"%");
			}
			if(companyinfo.getType()!=null && companyinfo.getType().length()>0){
				criteria.andTypeLike("%"+companyinfo.getType()+"%");
			}
			if(companyinfo.getPublisher()!=null && companyinfo.getPublisher().length()>0){
				criteria.andPublisherLike("%"+companyinfo.getPublisher()+"%");
			}
			if(companyinfo.getDepart()!=null && companyinfo.getDepart().length()>0){
				criteria.andDepartLike("%"+companyinfo.getDepart()+"%");
			}
			if(companyinfo.getPhone()!=null && companyinfo.getPhone().length()>0){
				criteria.andPhoneLike("%"+companyinfo.getPhone()+"%");
			}
			if(companyinfo.getInfo()!=null && companyinfo.getInfo().length()>0){
				criteria.andInfoLike("%"+companyinfo.getInfo()+"%");
			}
			if(companyinfo.getMajor()!=null && companyinfo.getMajor().length()>0){
				criteria.andMajorLike("%"+companyinfo.getMajor()+"%");
			}
			if(companyinfo.getEducation()!=null && companyinfo.getEducation().length()>0){
				criteria.andEducationLike("%"+companyinfo.getEducation()+"%");
			}
			if(companyinfo.getPeopleNums()!=null && companyinfo.getPeopleNums().length()>0){
				criteria.andPeopleNumsLike("%"+companyinfo.getPeopleNums()+"%");
			}
			if(companyinfo.getJobWay()!=null && companyinfo.getJobWay().length()>0){
				criteria.andJobWayLike("%"+companyinfo.getJobWay()+"%");
			}
			if(companyinfo.getJobInfo()!=null && companyinfo.getJobInfo().length()>0){
				criteria.andJobInfoLike("%"+companyinfo.getJobInfo()+"%");
			}
			if(companyinfo.getPublishIs()!=null && companyinfo.getPublishIs().length()>0){
				criteria.andPublishIsLike("%"+companyinfo.getPublishIs()+"%");
			}
			if(companyinfo.getValidity()!=null && companyinfo.getValidity().length()>0){
				criteria.andValidityLike("%"+companyinfo.getValidity()+"%");
			}
	
		}
		
		Page<TbCompanyinfo> page= (Page<TbCompanyinfo>)companyinfoMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
