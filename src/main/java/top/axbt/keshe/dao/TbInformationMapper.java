package top.axbt.keshe.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import top.axbt.keshe.domain.TbInformation;
import top.axbt.keshe.domain.TbInformationExample;

import java.util.List;

@Repository
public interface TbInformationMapper {
    long countByExample(TbInformationExample example);

    int deleteByExample(TbInformationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbInformation record);

    int insertSelective(TbInformation record);

    List<TbInformation> selectByExample(TbInformationExample example);

    TbInformation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbInformation record, @Param("example") TbInformationExample example);

    int updateByExample(@Param("record") TbInformation record, @Param("example") TbInformationExample example);

    int updateByPrimaryKeySelective(TbInformation record);

    int updateByPrimaryKey(TbInformation record);
}