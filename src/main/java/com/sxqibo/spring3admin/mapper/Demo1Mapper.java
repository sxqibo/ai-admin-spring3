package com.sxqibo.spring3admin.mapper;

import com.sxqibo.spring3admin.domain.Demo1;
import com.sxqibo.spring3admin.domain.Demo1Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Demo1Mapper {
    long countByExample(Demo1Example example);

    int deleteByExample(Demo1Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(Demo1 row);

    int insertSelective(Demo1 row);

    List<Demo1> selectByExample(Demo1Example example);

    Demo1 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") Demo1 row, @Param("example") Demo1Example example);

    int updateByExample(@Param("row") Demo1 row, @Param("example") Demo1Example example);

    int updateByPrimaryKeySelective(Demo1 row);

    int updateByPrimaryKey(Demo1 row);
}