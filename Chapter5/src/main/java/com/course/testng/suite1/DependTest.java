package com.course.testng.suite1;

import org.testng.annotations.Test;
/*
*
* yilaiceshi 依赖测试
* */
public class DependTest {
    @Test
    public void Test1(){
        System.out.println("test1  run");
      throw new RuntimeException();
    }
    @Test(dependsOnMethods = {"Test1"})
    public void Test2(){
        System.out.println("");
    }
}
