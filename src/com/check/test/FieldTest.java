package com.check.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/**
 * Created by chen on 2016/6/16.
 */
public class FieldTest {
    /**
     * ctrl + j
     * @param args
     */
    public static void main(String[] args) {
        Class studentClass = new Student().getClass();
        //获取构造方法
        Constructor[] constructors = studentClass.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName()+":"+constructor.isVarArgs());
        }
        //获取变量
        Field[] fields = studentClass.getDeclaredFields();
        for (Field field : fields) {
            String paraName = field.getName();
            Class<?> paraType = field.getType();
            System.out.println("参数名为："+paraName);
            System.out.println("类型名为：" + paraType);
        }
        //获取方法
        Method[] methods = studentClass.getMethods();
        for (Method method : methods) {
            System.out.println(method.getParameterTypes() +":"+ method.getReturnType());
        }
    }
}
