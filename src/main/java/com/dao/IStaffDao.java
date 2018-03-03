package com.dao;

import com.entity.Tb_StaffEntity;

import java.util.List;

public interface IStaffDao {
    //查询所有
    public List<Tb_StaffEntity> queryList();
    //带条件查询所有
    public List<Tb_StaffEntity> queryListBySql(String name,String userCard,String email,String staffId, int begin, int end);
    //查询最大行
    public int getCount(String name);
    //修改前根据id查询
    public Tb_StaffEntity queryById(Integer staffId);
    //增
    public boolean insert(Object object);
    //删
    //public boolean delete(Object object, Object a);//当有2个参数时必须写@param或则在xml那边#{XXX}必须用param1 param2来代替
    public boolean delete(Object object);//只有一个的话就不用管
    //改
    public boolean update(Object object);
}
