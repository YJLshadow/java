package com.service.impl;

import com.dao.ICompanyDao;
import com.entity.Tb_BankEntity;
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
        iCompanyDao.addTb_Company(companyEntity);
    }

    public List<Tb_CompanyEntity> getall() {
        return null;
    }


    public List<Tb_CompanyEntity> selectWhere(String index, String companyName) {
        int end=8;
        int start=1;
        if(index!=null){
            start =(Integer.parseInt(index)-1) * end;
        }
        List<Tb_CompanyEntity> companyEntities=iCompanyDao.selectWhere(start,end,companyName);
        return companyEntities;
    }

    public Tb_CompanyEntity getbyid(String companyId) {
        Tb_CompanyEntity companyEntity=iCompanyDao.getbyid(Integer.parseInt(companyId));
        return companyEntity;
    }

    public void updateTb_Company(Tb_CompanyEntity companyEntity) {
        iCompanyDao.updateTb_Company(companyEntity);
    }

    public void deleteTb_Company(String companyId) {
        iCompanyDao.deleteTb_Company(Integer.parseInt(companyId));
    }

    public int getMax(String companyName) {
        int end=8;
        int maxPage=iCompanyDao.getMax(companyName)/end;
        if(iCompanyDao.getMax(companyName)%end!=0){
            maxPage=maxPage+1;
        }
        return maxPage;
    }
}
