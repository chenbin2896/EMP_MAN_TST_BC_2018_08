package top.axbt.keshe.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import top.axbt.keshe.domain.TbGraduateinfo;
import top.axbt.keshe.domain.TbGraduateinfoExample;

import java.util.List;

@Repository
public interface TbGraduateinfoMapper {
    long countByExample(TbGraduateinfoExample example);

    int deleteByExample(TbGraduateinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbGraduateinfo record);

    int insertSelective(TbGraduateinfo record);

    List<TbGraduateinfo> selectByExample(TbGraduateinfoExample example);

    TbGraduateinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbGraduateinfo record, @Param("example") TbGraduateinfoExample example);

    int updateByExample(@Param("record") TbGraduateinfo record, @Param("example") TbGraduateinfoExample example);

    int updateByPrimaryKeySelective(TbGraduateinfo record);

    int updateByPrimaryKey(TbGraduateinfo record);
}