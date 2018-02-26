package com.controller;

import com.entity.Tb_CompanyEntity;
import com.service.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class CompanyController {

    @Autowired
    ICompanyService iCompanyService;

    @ResponseBody
    @RequestMapping(value = "selectWhere")
    public Map<String,Object> selectWhere(HttpServletRequest request){



        return null;
    }

    @ResponseBody
    @RequestMapping(value = "getById")
    public Tb_CompanyEntity getById(HttpServletRequest request){


        return null;
    }

    @ResponseBody
    @RequestMapping(value = "addTb_Company")
    public String addTb_Company(HttpServletRequest request){

        return null;
    }

    @ResponseBody
    @RequestMapping(value = "deleteTb_Company")
    public String deleteTb_Company(HttpServletRequest request){


        return null;
    }

    @ResponseBody
    @RequestMapping(value = "updateTb_Company")
    public String updateTb_Company(HttpServletRequest request){


        return null;
    }



}
