package com.dao;

import com.entity.Tb_UserEntity;
import com.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserDao implements IUserService{
    @Autowired
    IUserDao iUserDao;
    public boolean insert(Object object) {
        boolean f=false;
            iUserDao.insert(object);
            f=true;
        return f;
    }

    public boolean delete(Object object, Object a) {
        boolean f=false;
            iUserDao.delete(object,a);
            f=true;
        return f;

    }

    public boolean delete(Object object) {
        boolean f=false;
            iUserDao.delete(object);
            f=true;
        return f;
    }

    public boolean update(Object object) {
        boolean f=false;
            iUserDao.update(object);
            f=true;
        return f;
    }

    public List<Tb_UserEntity> queryList(String sql, int begin, int end) {
        return iUserDao.queryList(sql,begin,end);
    }

    public Map<String, Object> queryMap(String sql, int begin, int end) {
        Map<String,Object> map = new HashMap<String, Object>();
        int count = getCount(sql);
        int maxPage = (count/end) + ((count%end) != 0 ? 1:0);
        List<Tb_UserEntity> list = iUserDao.queryList(sql,begin,end);
        map.put("list",list);
        map.put("maxPage",maxPage);
        return map;
    }

    public Tb_UserEntity query(Serializable serializable) {
        return iUserDao.query(serializable);
    }

    public int getCount(String sql) {
        return iUserDao.getCount(sql);
    }


}

