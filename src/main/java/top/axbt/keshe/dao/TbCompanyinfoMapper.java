package top.axbt.keshe.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import top.axbt.keshe.domain.TbCompanyinfo;
import top.axbt.keshe.domain.TbCompanyinfoExample;

import java.util.List;

@Repository
public interface TbCompanyinfoMapper {
    long countByExample(TbCompanyinfoExample example);

    int deleteByExample(TbCompanyinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbCompanyinfo record);

    int insertSelective(TbCompanyinfo record);

    List<TbCompanyinfo> selectByExample(TbCompanyinfoExample example);

    TbCompanyinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbCompanyinfo record, @Param("example") TbCompanyinfoExample example);

    int updateByExample(@Param("record") TbCompanyinfo record, @Param("example") TbCompanyinfoExample example);

    int updateByPrimaryKeySelective(TbCompanyinfo record);

    int updateByPrimaryKey(TbCompanyinfo record);
}