package com.hand.hp23854;

import com.hand.hp23854.domain.User;
import com.hand.hp23854.mapper.UserMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class TestUserCUD {
    @Test
    public void testInsertUser(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = ac.getBean(UserMapper.class);
        User user = new User();
        user.setUserName("恒涛");
        user.setUserNumber("20099");
        user.setAddress("haikou");
        user.setCreatedBy(1L);
        user.setObjectVersionNumber(0);
        user.setLastUpdateDate(new Date());
        user.setLastUpdatedBy(1);
        user.setCreatetionDate(new Date());
        int i = userMapper.insertUser(user);
        System.out.println("userId="+user.getUserId());

    }
    @Test
    public void testUpdateUser(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = ac.getBean(UserMapper.class);
        User user = userMapper.findUserById(4L);
        System.out.println(user);
        user.setUserName("update胡鹏123");
        int i = userMapper.updateUser(user);
        System.out.println(i);
    }
    @Test
    public void tsetFindUserByid(){
        ApplicationContext    ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = ac.getBean(UserMapper.class);
        User user = userMapper.findUserById(4L);
        System.out.println(user);
    }

    @Test
    public void testDeleteUserById(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = ac.getBean(UserMapper.class);
        int i = userMapper.deleteUser(7L);
        System.out.println(i);
    }
}
