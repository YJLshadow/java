package com.dao;

import com.entity.Tb_UserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IUserDao {
    //查询所有
    public List<Tb_UserEntity> queryListForUser();
    //带条件查询所有(客户名，客户身份证号码，理财师名字,默认根据姓名查)
    public List<Tb_UserEntity> queryListByUserName(String selectName,String userCard,int begin, int end);
    //带条件查询所有(客户名，客户身份证号码，理财师名字,默认根据理财师姓名查)
    public List<Tb_UserEntity> queryListByStaffName(String selectStaffName,String userCard,int begin, int end);
    //根据用户姓名查询最大行
    public int queryMaxByUserName(String selectName,String userCard);
    //根据理财师ID查询最大行
    public int queryMaxByStaffName(String selectStaffName,String userCard);
    //修改前根据userid查询
    public Tb_UserEntity queryById(Integer userId);
    //增
    public boolean addUser(Object object);
    //删
    //public boolean delete(Object object, Object a);//当有2个参数时必须写@param或则在xml那边#{XXX}必须用param1 param2来代替
    public boolean deleteUser(int userId);//只有一个的话就不用管
    //改
    public boolean updateUser(Object object);


}
