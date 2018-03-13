package com.dao;

import com.entity.Tb_ProductEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
@Repository
public interface IProductDao {
    //增
    public boolean insert(Object object);
    //删
    public boolean delete(Object object);//只有一个的话就不用管
    //改
    public boolean update(Object object);

    public List<Tb_ProductEntity> queryList(@Param("sql") String sql, @Param("begin") int begin, @Param("end") int end);
    public Map<String, Object> queryMap(@Param("sql") String sql, @Param("begin") int begin, @Param("end") int end);
    public Tb_ProductEntity query(@Param("id") Serializable serializable);//修改时候需要
    public int getCount(@Param("sql")String sql);
}
