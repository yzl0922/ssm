package com.spring.pojo;

import java.util.List;

/**
 * @Author: 袁子良
 * @Date:Created in  2019/3/5  14:47
 * @Description:
 */


public class Dept {
    private Integer id;

    private String name;

    private List<Person> personList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    @Override
    public String toString() {
        return "Person [id:" + id + ", 部门名称:" + name + ",员工:" + personList + "]";
    }
}
