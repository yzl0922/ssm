package com.spring.service;

import com.spring.dao.PersonMapper;
import com.spring.pojo.Person;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: 袁子良
 * @Date:Created in  2019/3/5  14:48
 * @Description:
 */


@Service("PersonService")
public class PersonService {
    @Resource
    protected PersonMapper personMapper;


    public Person getById(int id){
        Person p = this.personMapper.getById(id);
        if(p!=null){
            return p;
        }
        return null;
    }
}
