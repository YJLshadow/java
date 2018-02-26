package com.service.impl;

import com.dao.ICompanyDao;
import com.entity.Tb_CompanyEntity;
import com.service.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService implements ICompanyService {

    @Autowired
    ICompanyDao iCompanyDao;

    public void addTb_Company(Tb_CompanyEntity companyEntity) {

    }

    public List<Tb_CompanyEntity> getall() {
        return null;
    }

    public List<Tb_CompanyEntity> selectWhere(String start, String end, String companyName) {
        return null;
    }

    public Tb_CompanyEntity getbyid(String companyId) {
        return null;
    }

    public void updateTb_Company(Tb_CompanyEntity companyEntity) {

    }

    public void deleteTb_Company(String companyId) {

    }

    public int getMax(String companyName) {
        return 0;
    }
}
