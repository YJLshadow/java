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

    //默认根据客户名字模糊查询
    public List<Tb_UserEntity> queryListByUserName(String selectName,String userCard, int begin, int end) {
        return iUserDao.queryListByUserName(selectName,userCard,begin,end);
    }
//    根据理财师id模糊查询
    public List<Tb_UserEntity> queryListByStaffName(String selectStaffName,String userCard,int begin, int end){
        return iUserDao.queryListByStaffName(selectStaffName,userCard,begin,end);
    }

    //根据用户姓名查询最大行
    public int queryMaxByUserName(String selectName,String userCard) {
        return iUserDao.queryMaxByUserName(selectName,userCard);
    }

    //根据理财师id查询最大行
    public int queryMaxByStaffName(String selectStaffName,String userCard) {
        return iUserDao.queryMaxByStaffName(selectStaffName,userCard);
    }

    //修改前根据userid查询
    public Tb_UserEntity queryByUserId(Integer userId) {
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

