package com.service.impl;

import com.dao.IStaffDao;
import com.entity.Tb_StaffEntity;
import com.service.IStaffService;
import com.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService implements IStaffService {
    @Autowired
    IStaffDao iStaffDao;
    public List<Tb_StaffEntity> queryListForStaff(){
        return iStaffDao.queryListForStaff();
    }

    public List<Tb_StaffEntity> queryListBySql(String staffName,String staffCard, int education, int begin, int end) {
        return iStaffDao.queryListBySql(staffName,staffCard,education,begin,end);
    }

    public int queryMax(String staffName,String staffCard, int education) {
        return iStaffDao.queryMax(staffName,staffCard,education);
    }

    public Tb_StaffEntity queryById(Integer staffId) {
        return iStaffDao.queryById(staffId);
    }

    public boolean addStaff(Object object) {
        boolean f=false;
        iStaffDao.addStaff(object);
        f=true;
        return f;
    }

    public boolean deleteStaff(Object object) {
        boolean f=false;
        iStaffDao.deleteStaff(object);
        f=true;
        return f;
    }

    public boolean updateStaff(Object object) {
        boolean f=false;
        iStaffDao.updateStaff(object);
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

