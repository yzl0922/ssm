package com.spring.dao;
import com.spring.pojo.Admin;

/**
 * @Author: 袁子良
 * @Date:Created in  2019/3/5  14:47
 * @Description:
 */


public interface AdminMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}
