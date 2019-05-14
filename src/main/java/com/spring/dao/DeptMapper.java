package com.spring.dao;
import com.spring.pojo.Dept;

/**
 * @Author: 袁子良
 * @Date:Created in  2019/3/5  14:47
 * @Description:
 */


public interface DeptMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Dept record);

    int insertSelective(Dept record);

    Dept selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);
}
