package com.ReflectExer;

import java.lang.reflect.Field;

public class ReflectDemo_getMemberVariables {

    public static void main(String[] args) throws Exception {

        Class personClass = Person.class;

        Field[] field = personClass.getFields();
        for (Field fields : field) {
            System.out.println(fields);
        }

        Field a = personClass.getField("a");
        Person p=new Person();
        Object value = a.get(p);
        System.out.println(value);

        a.set(p,"10");
        System.out.println(p);

        System.out.println("===========");

        Field[] declaredFields = personClass.getDeclaredFields();//获取所有成员变量
        for (Field dF:declaredFields){
            System.out.println(dF);
        }

    }
}
