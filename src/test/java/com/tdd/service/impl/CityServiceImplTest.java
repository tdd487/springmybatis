package com.tdd.service.impl;

import com.tdd.model.City;
import com.tdd.service.CityService;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 
* CityServiceImpl Tester.
* 
* @author <Authors name> 
* @since <pre>���� 1, 2017</pre> 
* @version 1.0 
*/ 
public class CityServiceImplTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: selectByName(String name) 
* 
*/ 
@Test
public void testSelectByName() throws Exception { 
//TODO: Test goes here...
    ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-mybatis.xml"});
    CityService cityService = (CityService)ac.getBean("cityServiceImpl");
    City city = cityService.selectByName("Kabul");
} 

/** 
* 
* Method: getCityMapper() 
* 
*/ 
@Test
public void testGetCityMapper() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: setCityMapper(CityMapper cityMapper) 
* 
*/ 
@Test
public void testSetCityMapper() throws Exception { 
//TODO: Test goes here... 
} 


} 
