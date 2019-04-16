package top.axbt.keshe.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import top.axbt.keshe.domain.TbBoothallocation;
import top.axbt.keshe.domain.TbBoothallocationExample;

import java.util.List;

@Repository
public interface TbBoothallocationMapper {
    long countByExample(TbBoothallocationExample example);

    int deleteByExample(TbBoothallocationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbBoothallocation record);

    int insertSelective(TbBoothallocation record);

    List<TbBoothallocation> selectByExample(TbBoothallocationExample example);

    TbBoothallocation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbBoothallocation record, @Param("example") TbBoothallocationExample example);

    int updateByExample(@Param("record") TbBoothallocation record, @Param("example") TbBoothallocationExample example);

    int updateByPrimaryKeySelective(TbBoothallocation record);

    int updateByPrimaryKey(TbBoothallocation record);
}