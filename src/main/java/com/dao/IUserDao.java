package com.dao;

import com.entity.Tb_UserEntity;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface IUserDao {
    //增
    public boolean insert(Object object);
    //删
    public boolean delete(Object object, Object a);//当有2个参数时必须写@param或则在xml那边#{XXX}必须用param1 param2来代替
    public boolean delete(Object object);//只有一个的话就不用管
    //改
    public boolean update(Object object);
    //查
    public List<Tb_UserEntity> queryList(@Param("sql") String sql, @Param("begin") int begin, @Param("end") int end);
    public Map<String, Object> queryMap(@Param("sql") String sql, @Param("begin") int begin, @Param("end") int end);
    public Tb_UserEntity query(@Param("id") Serializable serializable);
    public int getCount(@Param("sql") String sql);
    //关闭sqlsession

}
