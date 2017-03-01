package com.tdd.service.impl;

import com.tdd.model.User;
import com.tdd.service.UserService;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 
* UserServiceImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 1, 2017</pre> 
* @version 1.0 
*/ 
public class UserServiceImplTest {
    @Test
    public void test(){
        ApplicationContext ac = new ClassPathXmlApplicationContext(
                new String[]{"spring.xml","spring-mybatis.xml"}
        );
        UserService userService = (UserService) ac.getBean("userServiceImpl");
        User user = userService.getUserById("1");
        System.out.println(user.getName());
    }
    @Test
    public void testinsert(){
        ApplicationContext ac = new ClassPathXmlApplicationContext(
                new String[]{"spring.xml","spring-mybatis.xml"}
        );
        UserService userService = (UserService) ac.getBean("userServiceImpl");
        User user = new User();
        user.setId(3);
        user.setName("赵虎");
        user.setPassword("123456");
        userService.insertSelective(user);
    }

    @Test
    public void sss(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
    }

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: getUserById(String userId) 
* 
*/ 
@Test
public void testGetUserById() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getUserMapper() 
* 
*/ 
@Test
public void testGetUserMapper() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: setUserMapper(UserMapper userMapper) 
* 
*/ 
@Test
public void testSetUserMapper() throws Exception { 
//TODO: Test goes here... 
} 


} 
