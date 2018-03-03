package com.service.impl;

import com.dao.IUserDao;
import com.entity.Tb_StaffEntity;
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
    public List<Tb_UserEntity> queryList(){
        return iUserDao.queryList();
    }

    //带条件查询所有
    public List<Tb_UserEntity> queryListBySql(String name, String userCard, String email, String staffId, int begin, int end) {
        return iUserDao.queryListBySql(name,userCard,email,staffId,begin,end);
    }

    //查询最大行
    public int getCount(String sql) {
        return iUserDao.getCount(sql);
    }

    //修改前根据id查询
    public Tb_UserEntity queryById(Integer userId) {
        return iUserDao.queryById(userId);
    }

    //增
    public boolean insert(Object object) {
        boolean f=false;
        iUserDao.insert(object);
            f=true;
        return f;
    }

//    删
    public boolean delete(Object object) {
        boolean f=false;
        iUserDao.delete(object);
            f=true;
        return f;
    }

//    改
    public boolean update(Object object) {
        boolean f=false;
        iUserDao.update(object);
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

