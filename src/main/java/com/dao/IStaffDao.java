package com.dao;

import com.entity.Tb_StaffEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IStaffDao {
    //查询所有
    public List<Tb_StaffEntity> queryListForStaff();
    //带条件查询所有(员工姓名，员工身份证，员工学历)
    public List<Tb_StaffEntity> queryListBySql(String staffName,String staffCard, int education, int begin, int end);
    //查询最大行
    public int queryMax(String staffName,String staffCard, int education);
    //修改前根据id查询
    public Tb_StaffEntity queryById(Integer staffId);
    //查询
    public List<Tb_StaffEntity> queryByName(String staffName);
    //增
    public boolean addStaff(Object object);
    //删
    //public boolean delete(Object object, Object a);//当有2个参数时必须写@param或则在xml那边#{XXX}必须用param1 param2来代替
    public boolean deleteStaff(Object object);//只有一个的话就不用管
    //改
    public boolean updateStaff(Object object);
}
