package com.spring.dao;

import com.spring.pojo.Person;

import java.util.List;

/**
 * @Author: 袁子良
 * @Date:Created in  2019/3/5  14:47
 * @Description:
 */


public interface PersonMapper {

    public List<Person> getListByDeptId(Integer deptId);

    public Person getById(Integer id);
}
