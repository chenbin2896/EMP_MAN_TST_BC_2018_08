package top.axbt.keshe.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import top.axbt.keshe.domain.TbBoothinfo;
import top.axbt.keshe.domain.TbBoothinfoExample;

import java.util.List;

@Repository
public interface TbBoothinfoMapper {
    long countByExample(TbBoothinfoExample example);

    int deleteByExample(TbBoothinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbBoothinfo record);

    int insertSelective(TbBoothinfo record);

    List<TbBoothinfo> selectByExample(TbBoothinfoExample example);

    TbBoothinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbBoothinfo record, @Param("example") TbBoothinfoExample example);

    int updateByExample(@Param("record") TbBoothinfo record, @Param("example") TbBoothinfoExample example);

    int updateByPrimaryKeySelective(TbBoothinfo record);

    int updateByPrimaryKey(TbBoothinfo record);
}