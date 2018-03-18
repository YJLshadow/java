package com.controller;

import com.entity.Tb_StaffEntity;
import com.entity.Tb_UserEntity;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.service.impl.StaffService;
import com.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RequestMapping(value = "user")
@Controller
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    StaffService staffService;

    @ResponseBody
    @RequestMapping(value = "queryUserList")
    public Map<String,Object> queryList(HttpServletRequest request) throws Exception{
        Map<String,Object> map=null;
        try {
            request.setCharacterEncoding("utf-8");//设置编码
            String selectNameType=request.getParameter("selectNameType");
            String selectName = request.getParameter("selectName");//搜索里面的值
            String userCard = request.getParameter("userCard");//搜索里面的值
            String page = request.getParameter("page");//得到那边传过来的值
            System.out.println(selectNameType+selectName+userCard+page);
            int end = 5;
            int begin = 1;
            if(selectName!=null && selectName!="" && userCard!=null && userCard!=""&&selectNameType!=null&&selectNameType!=""){
//              searchValue = new String(searchValue.getBytes("iso-8859-1"), "utf-8");
//                选中的下拉框的值为staffId
                if(selectNameType=="staffId"){
//                    得到所有根据staff名字模糊查询出来的对象
//                    List<Tb_StaffEntity> staffEntities=staffService.queryByName(selectName);
//                    for (Tb_StaffEntity tb_staffEntity:staffEntities){
//                        得到所有根据staff名字模糊查询出来的id
//                        Integer staffId=tb_staffEntity.getStaffId();
//                        根据staffId查询和userId模糊查询
                        List<Tb_UserEntity> tb_userEntities=userService.queryListByStaffName(selectName,userCard,begin,end);
                        map = new HashMap<String, Object>();
                        int maxPage=userService.queryMaxByStaffName(selectName,userCard)/end;
                        if (userService.queryMaxByStaffName(selectName,userCard)%end!=0){
                            maxPage=maxPage+1;
                            System.out.println(maxPage+"选中的是staffName"+tb_userEntities);
                        }
                        map.put("total",maxPage);
                        map.put("rowsList",tb_userEntities);
                    }
//                    如果选中的是用户名字
                List<Tb_UserEntity> tb_userEntities=userService.queryListByUserName(selectName,userCard,begin,end);
                map = new HashMap<String, Object>();
                int maxPage=userService.queryMaxByUserName(selectName,userCard)/end;
                if (userService.queryMaxByUserName(selectName,userCard)%end!=0){
                    maxPage=maxPage+1;
                    System.out.println(maxPage+"选中的是user的name"+tb_userEntities);
                }
                map.put("total",maxPage);
                map.put("rowsList",tb_userEntities);
                }
//                选中的下拉框值为name
                List<Tb_UserEntity> tb_userEntities=userService.queryListByUserName(selectName,userCard,begin,end);
                map = new HashMap<String, Object>();
                int maxPage=userService.queryMaxByUserName(selectName,userCard)/end;
                if (userService.queryMaxByUserName(selectName,userCard)%end!=0){
                    maxPage=maxPage+1;
                    System.out.println(maxPage+"选中的是user的name"+tb_userEntities);
                }
                map.put("total",maxPage);
                map.put("rowsList",tb_userEntities);
        }catch (Exception e){
            e.printStackTrace();
        }
        return map;
    }

//                System.out.println(selectName+""+userCard+""+selectNameType+":修改前");
//            }
//            int end = 5;
//            int begin = 1;
//            List<Tb_UserEntity> tb_userEntities=userService.queryListByUserName("","",begin,end);
//                map = new HashMap<String, Object>();
//                int maxPage=userService.queryMaxByUserName("","")/end;
//            if (userService.queryMaxByUserName("","")%end!=0){
//                maxPage=maxPage+1;
//                System.out.println(maxPage+"sss"+tb_userEntities);
//            }
//            map.put("total",maxPage);
//            map.put("rowsList",tb_userEntities);


    //  查询单个的方法
    @ResponseBody
    @RequestMapping(value="selectUserId")
    public Tb_UserEntity queryStudentById(HttpServletRequest request) throws Exception{
        request.setCharacterEncoding("utf-8");
        String id = request.getParameter("id");
        Tb_UserEntity stuEntit = userService.queryByUserId(Integer.parseInt(id));
        return stuEntit;
    }

    //    增加的方法
    @ResponseBody
    @RequestMapping(value = "insert-user")
    public String insertActor(HttpServletRequest request) throws Exception{
        request.setCharacterEncoding("utf-8");
        //ObjectMapper().readValue(request.getParameter("student"),StuEntity.class);将穿过来的字符串转化为对象
        Tb_UserEntity tb_user = new ObjectMapper().readValue(request.getParameter("user"),Tb_UserEntity.class);
        String result = "";
        boolean f = userService.addUser(tb_user);
        if(f){
            result = "success";
        }
        return result;
}

    //    修改的方法
    @ResponseBody
    @RequestMapping(value="update-user")
    public String updateActor(HttpServletRequest request) throws Exception{
        request.setCharacterEncoding("utf-8");
        Tb_UserEntity stuEntity = new ObjectMapper().readValue(request.getParameter("student"),Tb_UserEntity.class);
        String result = "";
        boolean f = userService.updateUser(stuEntity);
        if(f){
            result = "success";
        }
        return result;
    }

    //    删除学生的方法
    @ResponseBody
    @RequestMapping(value="delete-user")
    public String deleteStudent(HttpServletRequest request) throws Exception{
        request.setCharacterEncoding("utf-8");
        String id = request.getParameter("id");
        Tb_UserEntity stuEntity = userService.queryByUserId(Integer.parseInt(id));
        String result = "";
        boolean f = userService.deleteUser(stuEntity);
        if(f){
            result = "success";
        }
        return result;
    }
}
