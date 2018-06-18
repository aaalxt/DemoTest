package com.course.testng.suite1;

import org.testng.annotations.*;

public class suite {
    @BeforeSuite
    public  void beforeSuit(){
        System.out.println("beforesuite 运行了");
    }
    @BeforeSuite
    public  void beforeSuit1(){
        System.out.println("beforesuite 运行了");
    }

    @AfterSuite
    public  void AfterSuite(){
        System.out.println("AfterSuite suite 运行了");
    }

    @AfterTest
    public  void AfterSuite1(){
        System.out.println("AfterSuite Test 运行了");
    }
    @BeforeTest
    public  void beforeSuit2(){
        System.out.println("beforesuite  test 运行了");
    }
}
