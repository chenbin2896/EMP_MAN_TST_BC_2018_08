package top.axbt.keshe.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;


import org.springframework.stereotype.Service;
import top.axbt.entity.PageResult;
import top.axbt.keshe.dao.TbGraduateinfoMapper;
import top.axbt.keshe.domain.TbGraduateinfo;
import top.axbt.keshe.domain.TbGraduateinfoExample;
import top.axbt.keshe.service.GraduateinfoService;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class GraduateinfoServiceImpl implements GraduateinfoService {

	@Autowired
	private TbGraduateinfoMapper graduateinfoMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbGraduateinfo> findAll() {
		return graduateinfoMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbGraduateinfo> page=   (Page<TbGraduateinfo>) graduateinfoMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbGraduateinfo graduateinfo) {
		graduateinfoMapper.insert(graduateinfo);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbGraduateinfo graduateinfo){
		graduateinfoMapper.updateByPrimaryKey(graduateinfo);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbGraduateinfo findOne(Integer id){
		return graduateinfoMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			graduateinfoMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbGraduateinfo graduateinfo, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbGraduateinfoExample example=new TbGraduateinfoExample();
		TbGraduateinfoExample.Criteria criteria = example.createCriteria();
		
		if(graduateinfo!=null){			
						if(graduateinfo.getName()!=null && graduateinfo.getName().length()>0){
				criteria.andNameLike("%"+graduateinfo.getName()+"%");
			}
			if(graduateinfo.getAge()!=null && graduateinfo.getAge().length()>0){
				criteria.andAgeLike("%"+graduateinfo.getAge()+"%");
			}
			if(graduateinfo.getSex()!=null && graduateinfo.getSex().length()>0){
				criteria.andSexLike("%"+graduateinfo.getSex()+"%");
			}
			if(graduateinfo.getNation()!=null && graduateinfo.getNation().length()>0){
				criteria.andNationLike("%"+graduateinfo.getNation()+"%");
			}
			if(graduateinfo.getPoliticStatus()!=null && graduateinfo.getPoliticStatus().length()>0){
				criteria.andPoliticStatusLike("%"+graduateinfo.getPoliticStatus()+"%");
			}
			if(graduateinfo.getMajor()!=null && graduateinfo.getMajor().length()>0){
				criteria.andMajorLike("%"+graduateinfo.getMajor()+"%");
			}
			if(graduateinfo.getDepart()!=null && graduateinfo.getDepart().length()>0){
				criteria.andDepartLike("%"+graduateinfo.getDepart()+"%");
			}
			if(graduateinfo.getEducationBack()!=null && graduateinfo.getEducationBack().length()>0){
				criteria.andEducationBackLike("%"+graduateinfo.getEducationBack()+"%");
			}
			if(graduateinfo.getEducationLength()!=null && graduateinfo.getEducationLength().length()>0){
				criteria.andEducationLengthLike("%"+graduateinfo.getEducationLength()+"%");
			}
			if(graduateinfo.getTraiiningMode()!=null && graduateinfo.getTraiiningMode().length()>0){
				criteria.andTraiiningModeLike("%"+graduateinfo.getTraiiningMode()+"%");
			}
			if(graduateinfo.getOrigin()!=null && graduateinfo.getOrigin().length()>0){
				criteria.andOriginLike("%"+graduateinfo.getOrigin()+"%");
			}
			if(graduateinfo.getJobIntension()!=null && graduateinfo.getJobIntension().length()>0){
				criteria.andJobIntensionLike("%"+graduateinfo.getJobIntension()+"%");
			}
			if(graduateinfo.getLanguages()!=null && graduateinfo.getLanguages().length()>0){
				criteria.andLanguagesLike("%"+graduateinfo.getLanguages()+"%");
			}
			if(graduateinfo.getLanguaageLevel()!=null && graduateinfo.getLanguaageLevel().length()>0){
				criteria.andLanguaageLevelLike("%"+graduateinfo.getLanguaageLevel()+"%");
			}
			if(graduateinfo.getComputerLevel()!=null && graduateinfo.getComputerLevel().length()>0){
				criteria.andComputerLevelLike("%"+graduateinfo.getComputerLevel()+"%");
			}
			if(graduateinfo.getPost()!=null && graduateinfo.getPost().length()>0){
				criteria.andPostLike("%"+graduateinfo.getPost()+"%");
			}
			if(graduateinfo.getPhone()!=null && graduateinfo.getPhone().length()>0){
				criteria.andPhoneLike("%"+graduateinfo.getPhone()+"%");
			}
			if(graduateinfo.getEmail()!=null && graduateinfo.getEmail().length()>0){
				criteria.andEmailLike("%"+graduateinfo.getEmail()+"%");
			}
			if(graduateinfo.getAddress()!=null && graduateinfo.getAddress().length()>0){
				criteria.andAddressLike("%"+graduateinfo.getAddress()+"%");
			}
			if(graduateinfo.getExperience()!=null && graduateinfo.getExperience().length()>0){
				criteria.andExperienceLike("%"+graduateinfo.getExperience()+"%");
			}
			if(graduateinfo.getMessage()!=null && graduateinfo.getMessage().length()>0){
				criteria.andMessageLike("%"+graduateinfo.getMessage()+"%");
			}
	
		}
		
		Page<TbGraduateinfo> page= (Page<TbGraduateinfo>)graduateinfoMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
