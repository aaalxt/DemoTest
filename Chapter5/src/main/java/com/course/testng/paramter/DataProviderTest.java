package com.course.testng.paramter;

import javafx.scene.chart.PieChart;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {

    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){
        System.out.println("name="+name+";age="+age);
    }
    @DataProvider(name = "data")
    public  Object[][] providerData(){
        Object [][] o =new Object[][]{
                {"zhangsan",10},
                {"lishi",20},
                {"wangwu",50}
        };
        return  o;
    }
    @Test(dataProvider ="methodData")
    public void test1(String name,int age){
        System.out.println("test111方法 name ="+name+";age="+age);
    }
    @Test(dataProvider ="methodData")
    public void test2(String name,int age){
        System.out.println("test222方法 name ="+name+";age="+age);
    }
    @DataProvider(name="methodData")
    public Object[][] methodDataTest(Method method){

        Object[][] result=null;
        if(method.getName().equals("test1")){
            result=new Object[][]{
                    {"zhangshan",20},
                    {"lisi",25}
            };

        }else if (method.getName().equals("test2")){
            result =new Object[][]{
                    {"wangwu",50},
                    {"haoliu",60}
            };
        }return result;
    }
}



