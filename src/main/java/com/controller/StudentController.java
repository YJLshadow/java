package com.controller;

import com.entity.StuEntity;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class StudentController {
    @Autowired
    StuService stuService;

    @ResponseBody
    @RequestMapping("queryList")
    public Map<String,Object> queryList(HttpServletRequest request) throws Exception{
        request.setCharacterEncoding("utf-8");//设置编码

        String searchValue = request.getParameter("search");//搜索里面的值
        String page = request.getParameter("page");//得到那边传过来的值
        String sql = "";
        int end = 5;
        int begin = 0;
        if(page!=null){
            begin =(Integer.parseInt(page)-1) * end;
        }
        if(searchValue!=null && searchValue!=""){
            sql = " where name like '%"+searchValue+"%'";
        }
        Map<String,Object> map = stuService.queryMap(sql,begin,end);
        return map;
    }

    //  查询单个学生的方法
    @ResponseBody
    @RequestMapping(value="selectStudentId")
    public StuEntity queryStudentById(HttpServletRequest request) throws Exception{
        request.setCharacterEncoding("utf-8");

        String id = request.getParameter("id");
        StuEntity stuEntit = stuService.query(Integer.parseInt(id));
        return stuEntit;
    }

    //    增加学生的方法
    @ResponseBody
    @RequestMapping("insert-Student")
    public String insertActor(HttpServletRequest request) throws Exception{
        request.setCharacterEncoding("utf-8");
        //ObjectMapper().readValue(request.getParameter("student"),StuEntity.class);将穿过来的字符串转化为对象
        StuEntity stuEntity = new ObjectMapper().readValue(request.getParameter("student"),StuEntity.class);

        String result = "";
        boolean f = stuService.insert(stuEntity);
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

        StuEntity stuEntity = new ObjectMapper().readValue(request.getParameter("student"),StuEntity.class);
        String result = "";
        boolean f = stuService.update(stuEntity);
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
        StuEntity stuEntity = stuService.query(Integer.parseInt(id));
        String result = "";
        boolean f = stuService.delete(stuEntity);
        if(f){
            result = "success";
        }
        return result;
    }
}
