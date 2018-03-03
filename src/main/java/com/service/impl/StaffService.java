package com.service.impl;

import com.dao.IStaffDao;
import com.entity.Tb_StaffEntity;
import com.service.IStaffService;
import com.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class StaffService implements IStaffService {
    @Autowired
    IStaffDao iStaffDao;
    public List<Tb_StaffEntity> queryList(){
        return iStaffDao.queryList();
    }

    public List<Tb_StaffEntity> queryListBySql(String name, String userCard, String email, String staffId, int begin, int end) {
        return iStaffDao.queryListBySql(name,userCard,email,staffId,begin,end);
    }

    public int getCount(String sql) {
        return iStaffDao.getCount(sql);
    }

    public Tb_StaffEntity queryById(Integer staffId) {
        return iStaffDao.queryById(staffId);
    }

    public boolean insert(Object object) {
        boolean f=false;
        iStaffDao.insert(object);
        f=true;
        return f;
    }

    public boolean delete(Object object) {
        boolean f=false;
        iStaffDao.delete(object);
        f=true;
        return f;
    }

    public boolean update(Object object) {
        boolean f=false;
        iStaffDao.update(object);
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

