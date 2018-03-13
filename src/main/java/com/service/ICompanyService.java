package com.service;

import com.entity.Tb_CompanyEntity;

import java.util.List;

public interface ICompanyService {

    public void addTb_Company(Tb_CompanyEntity companyEntity);


    public List<Tb_CompanyEntity> getall();

    public List<Tb_CompanyEntity> selectWhere(String index, String companyName);


    public Tb_CompanyEntity getbyid(String companyId);



    public void updateTb_Company(Tb_CompanyEntity companyEntity);



    public void deleteTb_Company(String companyId);


    public int getMax(String companyName);

}
