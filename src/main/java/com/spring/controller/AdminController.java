package com.spring.controller;
import com.spring.pojo.Admin;
import com.spring.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @Author: 袁子良
 * @Date:Created in  2019/3/5  14:46
 * @Description:
 */


@Controller
@RequestMapping("/admin")
public class AdminController {

    @Resource
    AdminService adminService;
    @RequestMapping("/")
    @ResponseBody
    public String index(){
        return "hello world";
    }

    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    @ResponseBody
    public int insertUser(Admin admin){
        return adminService.insertAdmin(admin);

    }
    @RequestMapping(value = "getAdmin/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Admin getUser(@PathVariable  Integer id){
        return adminService.getAdmin(id);
    }
}
