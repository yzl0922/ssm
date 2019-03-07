package com.spring.service;

import com.spring.pojo.Admin;
import com.spring.dao.AdminMapper;
import com.spring.pojo.Admin;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * @Author: 袁子良
 * @Date:Created in  2019/3/5  14:48
 * @Description:
 */


@Service("AdminService")
public class AdminService {
    @Resource
    protected AdminMapper adminMapper;


    public Admin getAdmin(int id){
        Admin a=this.adminMapper.selectByPrimaryKey(id);
        if(a!=null){
            return a;
        }
        return null;
    }

    public int insertAdmin(Admin admin){
        return this.adminMapper.insert(admin);
    }
}
