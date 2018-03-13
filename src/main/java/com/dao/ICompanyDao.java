package com.dao;

import com.entity.Tb_CompanyEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICompanyDao {

    public void addTb_Company(Tb_CompanyEntity companyEntity);


    public List<Tb_CompanyEntity> getall();

    public List<Tb_CompanyEntity> selectWhere(Integer start,Integer end,String companyName);


    public Tb_CompanyEntity getbyid(Integer companyId);



    public void updateTb_Company(Tb_CompanyEntity companyEntity);



    public void deleteTb_Company(Integer companyId);


    public int getMax(String companyName);

}
