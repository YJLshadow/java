package com.controller;

import com.entity.Tb_UserEntity;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("queryList")
    public Map<String,Object> queryList(HttpServletRequest request) throws Exception{
        Map<String,Object> map=null;
        try {
            request.setCharacterEncoding("utf-8");//设置编码
            String searchName = request.getParameter("name");//搜索里面的值
            String searchUserCard = request.getParameter("userCard");//搜索里面的值
            String  searchEmail= request.getParameter("email");//搜索里面的值
            String searchStaffId = request.getParameter("staffId");//搜索里面的值
            String page = request.getParameter("page");//得到那边传过来的值
            if(searchName!=null && searchName!="" && searchUserCard!=null && searchUserCard!="" && searchEmail!=null && searchEmail!="" && searchStaffId!=null && searchStaffId!=""){
//                searchValue = new String(searchValue.getBytes("iso-8859-1"), "utf-8");
                System.out.println(searchName+""+searchUserCard+""+searchEmail+""+searchStaffId+":修改前");

            }
            int end = 5;
            int begin = 0;
            if(page!=null){
                begin =(Integer.parseInt(page)-1) * end;
            }
//            String sql = " from tb_user";
            String sqls="select count(*) from tb_user ";
            List<Tb_UserEntity> tb_userEntities=userService.queryListBySql("","","","",begin,end);
                map = new HashMap<String, Object>();
                int maxPage=userService.getCount(sqls)/end;
            if (userService.getCount(sqls)%end!=0){
                maxPage=maxPage+1;
            }
            map.put("total",maxPage);
            map.put("rowsList",tb_userEntities);
        }catch (Exception e){
            e.printStackTrace();
        }
        return map;
    }

    //  查询单个的方法
    @ResponseBody
    @RequestMapping(value="selectUserId")
    public Tb_UserEntity queryStudentById(HttpServletRequest request) throws Exception{
        request.setCharacterEncoding("utf-8");
        String id = request.getParameter("id");
        Tb_UserEntity stuEntit = userService.queryById(Integer.parseInt(id));
        return stuEntit;
    }

    //    增加的方法
    @ResponseBody
    @RequestMapping("insert-Student")
    public String insertActor(HttpServletRequest request) throws Exception{
        request.setCharacterEncoding("utf-8");
        //ObjectMapper().readValue(request.getParameter("student"),StuEntity.class);将穿过来的字符串转化为对象
        Tb_UserEntity tb_user = new ObjectMapper().readValue(request.getParameter("student"),Tb_UserEntity.class);
        String result = "";
        boolean f = userService.insert(tb_user);
        if(f){
            result = "success";
        }
        return result;
}

    //    修改的方法
    @ResponseBody
    @RequestMapping(value="update-Student")
    public String updateActor(HttpServletRequest request) throws Exception{
        request.setCharacterEncoding("utf-8");
        Tb_UserEntity stuEntity = new ObjectMapper().readValue(request.getParameter("student"),Tb_UserEntity.class);
        String result = "";
        boolean f = userService.update(stuEntity);
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
        Tb_UserEntity stuEntity = userService.queryById(Integer.parseInt(id));
        String result = "";
        boolean f = userService.delete(stuEntity);
        if(f){
            result = "success";
        }
        return result;
    }
}
