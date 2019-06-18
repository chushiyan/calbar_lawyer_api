package site.chushiyan.lawyer.mapper;

import org.apache.ibatis.annotations.Param;
import site.chushiyan.lawyer.pojo.Lawyer;
import site.chushiyan.lawyer.pojo.LawyerExample;

import java.util.List;

public interface LawyerMapper {
    int countByExample(LawyerExample example);

    int deleteByExample(LawyerExample example);

    int deleteByPrimaryKey(String number);

    int insert(Lawyer record);

    int insertSelective(Lawyer record);

    List<Lawyer> selectByExample(LawyerExample example);

    Lawyer selectByPrimaryKey(String number);

    int updateByExampleSelective(@Param("record") Lawyer record, @Param("example") LawyerExample example);

    int updateByExample(@Param("record") Lawyer record, @Param("example") LawyerExample example);

    int updateByPrimaryKeySelective(Lawyer record);

    int updateByPrimaryKey(Lawyer record);
}