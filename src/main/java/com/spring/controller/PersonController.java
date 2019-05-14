package com.spring.controller;
import com.spring.pojo.Person;
import com.spring.service.PersonService;
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
@RequestMapping(value = "/person",produces = "text/json;charset=UTF-8")
public class PersonController {

    @Resource
    PersonService personService;
    @RequestMapping("/")
    @ResponseBody
    public String index(){
        return "hello world";
    }

    @RequestMapping(value = "getPerson/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Person getPerson(@PathVariable  Integer id){
        Person byId = personService.getById(id);
        System.out.println(byId);
        return byId;
    }
}
