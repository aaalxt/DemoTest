package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass1 {

    public void stu1(){
        System.out.println("groupsobclass1中 stu11111   运行了");
    }
    public void stu11(){
        System.out.println("groupsobclass1中 stu11111   运行了");
    }
    public void stu2(){
        System.out.println("groupsobclass1中 stu22222   运行了");
    }
}
