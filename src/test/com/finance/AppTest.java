package com.finance;

import com.entity.Tb_UserEntity;
import com.service.IUserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class AppTest {
    IUserService service;
    @Before
    public void before(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml" );
         service= context.getBean(IUserService.class);
    }
    @Test
    public  void Test(){
      List<Tb_UserEntity>  list= service.queryListForUser();
        for (Tb_UserEntity tb_userEntity : list) {
            System.out.println(tb_userEntity);
        }
    }

}
