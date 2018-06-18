package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    @Test//最基本的注解，
    public void TestCase(){
        System.out.println("这是测试用例1");

    }
    @Test
    public void testCCase2(){
        System.out.println("这是测试用例方法2");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod实在测试方法之前面运行的");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod是在测试方法之后运行的");
    }
   @BeforeClass
    public void BeforeClass(){
       System.out.println("BeforeClass这是在类之前运行的方法");
   }
    @AfterClass
    public void AfterClass(){
        System.out.println("AfterClass这是在类之前运行的方法");
    }
    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("BeforeSuite测试套件");
    }
}
