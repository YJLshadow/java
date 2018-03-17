package com.service;

import com.entity.Tb_UserEntity;

import java.util.List;

public interface IUserService {
    //直接查询所有
    public List<Tb_UserEntity> queryListForUser();
    //默认根据客户名字模糊查询
    public List<Tb_UserEntity> queryListByUserName(String selectName,String userCard, int begin, int end);
    //根据理财师id模糊查询
    public List<Tb_UserEntity> queryListByStaffName(String selectStaffName,String userCard, int begin, int end);
    //根据用户姓名查询最大行
    public int queryMaxByUserName(String selectName,String userCard);
    //根据理财师id查询最大行
    public int queryMaxByStaffName(String selectStaffName,String userCard);
    //修改前根据userid查询
    public Tb_UserEntity queryByUserId(Integer userId);
    //增
    public boolean addUser(Object object);
    //删
    //public boolean delete(Object object, Object a);//当有2个参数时必须写@param或则在xml那边#{XXX}必须用param1 param2来代替
    public boolean deleteUser(Object object);//只有一个的话就不用管
    //改
    public boolean updateUser(Object object);

}
