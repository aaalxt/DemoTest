package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {
    @Test(groups = "server")
  public void test4(){
      System.out.println("这是服务端的测试组11111");
  }
    @Test(groups = "server")
    public void test5(){
        System.out.println("这是服务端的测试组22222");
    }
    @Test(groups = "client")
    public void test6(){
        System.out.println("这是客户端的测试333333");
    }
    @Test(groups = "client")
    public void test7(){
        System.out.println("这是客户端的测试4444");
    }
    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("这是服务端组groupz组运行之前运行");
    }
    @AfterGroups("server")
    public void afterGroupsOnServer(){
        System.out.println("这是服务端组groupz组运行之后运行");
    }

    @BeforeGroups("client")
    public void beforeGroupsOnClient(){
        System.out.println("这是客户端组groupz组运行之前运行");
    }
    @AfterGroups("client")
    public void afterGroupsOnClient(){
        System.out.println("这是客户端组groupz组运行之后运行");
    }
}
