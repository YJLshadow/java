package com.dao;

import com.entity.Tb_UserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IUserDao {
    //查询所有
    public List<Tb_UserEntity> queryListForUser();
    //带条件查询所有(客户名，客户身份证号码，理财师名字)
    public List<Tb_UserEntity> queryListBySql(String name,String userCard,String staffName, int begin, int end);
    //查询最大行
    public int queryMax(String name,String userCard,String staffName);
    //修改前根据id查询
    public Tb_UserEntity queryById(Integer userId);
    //增
    public boolean addUser(Object object);
    //删
    //public boolean delete(Object object, Object a);//当有2个参数时必须写@param或则在xml那边#{XXX}必须用param1 param2来代替
    public boolean deleteUser(Object object);//只有一个的话就不用管
    //改
    public boolean updateUser(Object object);


}
