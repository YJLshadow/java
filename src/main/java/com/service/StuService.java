package com.service;

import com.dao.IStuDao;
import com.entity.StuEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StuService implements IStuService{
    @Autowired
    IStuDao iStuDao;
    public boolean insert(Object object) {
        boolean f=false;
            iStuDao.insert(object);
            f=true;
        return f;
    }

    public boolean delete(Object object, Object a) {
        boolean f=false;
            iStuDao.delete(object,a);
            f=true;
        return f;

    }

    public boolean delete(Object object) {
        boolean f=false;
            iStuDao.delete(object);
            f=true;
        return f;
    }

    public boolean update(Object object) {
        boolean f=false;
            iStuDao.update(object);
            f=true;
        return f;
    }

    public List<StuEntity> queryList(String sql, int begin, int end) {
        return iStuDao.queryList(sql,begin,end);
    }

    public Map<String, Object> queryMap(String sql, int begin, int end) {
        Map<String,Object> map = new HashMap<String, Object>();
        int count = getCount(sql);
        int maxPage = (count/end) + ((count%end) != 0 ? 1:0);
        List<StuEntity> list = iStuDao.queryList(sql,begin,end);
        map.put("list",list);
        map.put("maxPage",maxPage);
        return map;
    }

    public StuEntity query(Serializable serializable) {
        return iStuDao.query(serializable);
    }

    public int getCount(String sql) {
        return iStuDao.getCount(sql);
    }


}

