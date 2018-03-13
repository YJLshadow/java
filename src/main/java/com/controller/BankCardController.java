package com.controller;

import com.entity.Tb_BankCardEntity;
import com.service.IBankCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class BankCardController {

    @Autowired
    IBankCardService iBankCardService;

    @ResponseBody
    @RequestMapping(value = "selectWhere")
    public Map<String,Object> selectWhere(HttpServletRequest request){



        return null;
    }

    @ResponseBody
    @RequestMapping(value = "getById")
    public Tb_BankCardEntity getById(HttpServletRequest request){


        return null;
    }

    @ResponseBody
    @RequestMapping(value = "addTb_BankCard")
    public String addTb_BankCard(HttpServletRequest request){

        return "";
    }

    @ResponseBody
    @RequestMapping(value = "deleteTb_BankCard")
    public String deleteTb_BankCard(HttpServletRequest request){


        return null;
    }

    @ResponseBody
    @RequestMapping(value = "updateTb_BankCard")
    public String updateTb_BankCard(HttpServletRequest request){


        return null;
    }


}
