package com.service.impl;

import com.dao.IProductDao;
import com.entity.Tb_ProductEntity;
import com.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductService implements IProductService{
    @Autowired
    IProductDao iProductDao;

    public boolean insert(Object object){
        boolean f=false;
        iProductDao.insert(object);
        f=true;
        return f;
    }

    public boolean delete(Object object) {
        boolean f=false;
        iProductDao.delete(object);
        f=true;
        return f;
    }

    public boolean update(Object object) {
        boolean f=false;
        iProductDao.update(object);
        f=true;
        return f;
    }

    public List<Tb_ProductEntity> queryList(String sql, int begin, int end) {
        return iProductDao.queryList(sql,begin,end);
    }

    public Map<String, Object> queryMap(String sql, int begin, int end) {
        Map<String,Object> map = new HashMap<String, Object>();
        int count = getCount(sql);
        int maxPage = (count/end) + ((count%end) != 0 ? 1:0);
        List<Tb_ProductEntity> list = iProductDao.queryList(sql,begin,end);
        map.put("list",list);
        map.put("maxPage",maxPage);
        return map;
    }

    public Tb_ProductEntity query(Serializable serializable) {
        return iProductDao.query(serializable);
    }

    public int getCount(String sql) {
        return iProductDao.getCount(sql);
    }
}
