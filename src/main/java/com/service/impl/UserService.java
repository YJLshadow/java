package com.service.impl;

import com.dao.IUserDao;
import com.entity.Tb_UserEntity;
import com.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {
    @Autowired
    IUserDao iUserDao;
    //查询所有
    public List<Tb_UserEntity> queryListForUser(){
        return iUserDao.queryListForUser();
    }

    //带条件查询所有
    public List<Tb_UserEntity> queryListBySql(String name,String userCard,String staffName, int begin, int end) {
        return iUserDao.queryListBySql(name,userCard,staffName,begin,end);
    }

    //查询最大行
    public int queryMax(String name,String userCard,String staffName) {
        return iUserDao.queryMax(name,userCard,staffName);
    }

    //修改前根据id查询
    public Tb_UserEntity queryById(Integer userId) {
        return iUserDao.queryById(userId);
    }

    //增
    public boolean addUser(Object object) {
        boolean f=false;
        iUserDao.addUser(object);
            f=true;
        return f;
    }

//    删
    public boolean deleteUser(Object object) {
        boolean f=false;
        iUserDao.deleteUser(object);
            f=true;
        return f;
    }

//    改
    public boolean updateUser(Object object) {
        boolean f=false;
        iUserDao.updateUser(object);
            f=true;
        return f;
    }


//    public Map<String, Object> queryMap(String sql, int begin, int end) {
//        Map<String,Object> map = new HashMap<String, Object>();
//        int count = getCount(sql);
//        int maxPage = (count/end) + ((count%end) != 0 ? 1:0);
//        List<Tb_UserEntity> list = iUserDao.queryList(sql,begin,end);
//        map.put("list",list);
//        map.put("maxPage",maxPage);
//        return map;
//    }





}

