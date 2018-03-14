package com.controller;

import com.entity.Tb_StaffEntity;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.service.impl.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RequestMapping(value = "staff")
@Controller
public class StaffController {
    @Autowired
    StaffService staffService;

    @ResponseBody
    @RequestMapping(value = "queryList")
    public Map<String,Object> queryList(HttpServletRequest request) throws Exception{
        Map<String,Object> map=null;
        try {
            request.setCharacterEncoding("utf-8");//设置编码
            String staffName = request.getParameter("staffName");//搜索里面的值
            String staffCard = request.getParameter("staffCard");//搜索里面的值
            String education = request.getParameter("education");//搜索里面的值
            String page = request.getParameter("page");//得到那边传过来的值
            System.out.println(staffName+":修改前");
            if(staffName!=null && staffName!="" && staffCard!=null && staffCard!="" && Integer.parseInt(education)!=0){
//                searchValue = new String(searchValue.getBytes("iso-8859-1"), "utf-8");
                System.out.println(staffName+""+staffCard+""+education+":修改前");

            }
            int end = 5;
            int begin = 0;
            if(page!=null){
                begin =(Integer.parseInt(page)-1) * end;
            }
//            String sql = " from tb_user";
//            String sqls="select count(*) from tb_user ";
            List<Tb_StaffEntity> tb_staffEntities=staffService.queryListBySql("","",0,1,3);
                map = new HashMap<String, Object>();
                int maxPage=staffService.queryMax("","",0)/end;
            if (staffService.queryMax("","",0)%end!=0){
                maxPage=maxPage+1;
            }
            map.put("total",maxPage);
            map.put("rowsList",tb_staffEntities);
        }catch (Exception e){
            e.printStackTrace();
        }
        return map;
    }

    //  查询单个的方法
    @ResponseBody
    @RequestMapping(value="selectStaffId")
    public Tb_StaffEntity queryStudentById(HttpServletRequest request) throws Exception{
        request.setCharacterEncoding("utf-8");
        String staffId = request.getParameter("staffId");
        Tb_StaffEntity tb_staffEntity = staffService.queryById(Integer.parseInt(staffId));
        return tb_staffEntity;
    }

    //    增加的方法
    @ResponseBody
    @RequestMapping(value = "insert-Staff")
    public String insertActor(HttpServletRequest request) throws Exception{
        request.setCharacterEncoding("utf-8");
        //ObjectMapper().readValue(request.getParameter("student"),StuEntity.class);将穿过来的字符串转化为对象
        Tb_StaffEntity tb_staffEntity = new ObjectMapper().readValue(request.getParameter("staff"),Tb_StaffEntity.class);

        String result = "";
        boolean f = staffService.addStaff(tb_staffEntity);
        if(f){
            result = "success";
        }
        return result;
}

    //    修改的方法
    @ResponseBody
    @RequestMapping(value="update-Staff")
    public String updateActor(HttpServletRequest request) throws Exception{
        request.setCharacterEncoding("utf-8");

        Tb_StaffEntity tb_staffEntity = new ObjectMapper().readValue(request.getParameter("staff"),Tb_StaffEntity.class);
        String result = "";
        boolean f = staffService.updateStaff(tb_staffEntity);
        if(f){
            result = "success";
        }
        return result;
    }

    //    删除学生的方法
    @ResponseBody
    @RequestMapping(value="delete-Staff")
    public String deleteStudent(HttpServletRequest request) throws Exception{
        request.setCharacterEncoding("utf-8");

        String id = request.getParameter("id");
        Tb_StaffEntity tb_staffEntity = staffService.queryById(Integer.parseInt(id));
        String result = "";
        boolean f = staffService.deleteStaff(tb_staffEntity);
        if(f){
            result = "success";
        }
        return result;
    }
}
