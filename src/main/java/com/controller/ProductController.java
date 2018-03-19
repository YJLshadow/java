package com.controller;

import com.entity.Tb_ProductEntity;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.service.impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RequestMapping(value = "product")
@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    @ResponseBody
    @RequestMapping("queryList")
    public Map<String,Object> queryList(HttpServletRequest request) throws Exception{
        request.setCharacterEncoding("utf-8");//设置编码
        String searchA = request.getParameter("searchA");//下拉框
        String searchB = request.getParameter("searchB");//下拉框

        String searchValueA = request.getParameter("searchValueA");//搜索里面的值
        String searchValueB = request.getParameter("searchValueB");//搜索里面的值
        String page = request.getParameter("page");//得到那边传过来的值
        String sql = "";
        int end = 5;
        int begin = 0;
        if(page!=null){
            begin =(Integer.parseInt(page)-1) * end;
        }
        if((searchA!="" && searchValueA!=null && searchValueA!="")||( searchB!="" &&searchValueB!=null && searchValueB!="")){
            sql = " where "+searchA+" like '%"+searchValueA+"%' and "+searchB+ " like '%"+searchValueB+"'%";
        }
        Map<String,Object> map = productService.queryMap(sql,begin,end);
        return map;
    }

    @ResponseBody
    @RequestMapping(value="selectStudentId")
    public Tb_ProductEntity queryStudentById(HttpServletRequest request) throws Exception{
        request.setCharacterEncoding("utf-8");

        String id = request.getParameter("id");
        Tb_ProductEntity tb_productEntity = productService.query(Integer.parseInt(id));
        return tb_productEntity;
    }

    //    增加学生的方法
    @ResponseBody
    @RequestMapping("insert-Student")
    public String insertActor(HttpServletRequest request) throws Exception{
        request.setCharacterEncoding("utf-8");
        //ObjectMapper().readValue(request.getParameter("student"),StuEntity.class);将穿过来的字符串转化为对象
        Tb_ProductEntity tb_productEntity = new ObjectMapper().readValue(request.getParameter("student"),Tb_ProductEntity.class);

        String result = "";
        boolean f = productService.insert(tb_productEntity);
        if(f){
            result = "success";
        }
        return result;
    }

    //    修改学生的方法
    @ResponseBody
    @RequestMapping(value="update-Student")
    public String updateActor(HttpServletRequest request) throws Exception{
        request.setCharacterEncoding("utf-8");

        Tb_ProductEntity tb_productEntity = new ObjectMapper().readValue(request.getParameter("student"),Tb_ProductEntity.class);
        String result = "";
        boolean f = productService.update(tb_productEntity);
        if(f){
            result = "success";
        }
        return result;
    }

    //    删除学生的方法
    @ResponseBody
    @RequestMapping(value="delete-Student")
    public String deleteStudent(HttpServletRequest request) throws Exception{
        request.setCharacterEncoding("utf-8");

        String id = request.getParameter("id");
        Tb_ProductEntity tb_productEntity = productService.query(Integer.parseInt(id));
        String result = "";
        boolean f = productService.delete(tb_productEntity);
        if(f){
            result = "success";
        }
        return result;
    }

}
