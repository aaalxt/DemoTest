package com.course.testng.suite1;


import org.testng.annotations.Test;

public class PayTest {
    @Test
    private void PayTest1(){
        System.out.println("支付成功");
    }

    @Test(enabled = true)//忽略测试
    private void PayTest2(){
        System.out.println("支付bu成功");
    }
}