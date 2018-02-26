package com.controller;

import com.entity.Tb_BankEntity;
import com.service.IBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class BankController {

    @Autowired
    IBankService iBankService;


    @ResponseBody
    @RequestMapping(value = "selectWhere")
    public Map<String,Object> selectWhere(HttpServletRequest request){



        return null;
    }

    @ResponseBody
    @RequestMapping(value = "getById")
    public Tb_BankEntity getById(HttpServletRequest request){


        return null;
    }

    @ResponseBody
    @RequestMapping(value = "addTb_Bank")
    public String addTb_Bank(HttpServletRequest request){

        return null;
    }

    @ResponseBody
    @RequestMapping(value = "deleteTb_Bank")
    public String deleteTb_Bank(HttpServletRequest request){


        return null;
    }

    @ResponseBody
    @RequestMapping(value = "updateTb_Bank")
    public String updateTb_Bank(HttpServletRequest request){


        return null;
    }

}
