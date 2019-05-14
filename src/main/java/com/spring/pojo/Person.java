package com.spring.pojo;

/**
 * @Author: 袁子良
 * @Date:Created in  2019/3/5  14:47
 * @Description:
 */


public class Person {
    private Integer id;

    private String name;

    private String email;

    private Dept dept;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Person [id:" + id + ", 姓名:" + name + ",邮箱:" + email +",部门:" + dept.getName() + "]";
    }
}
