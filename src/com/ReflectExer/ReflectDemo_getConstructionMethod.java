package com.ReflectExer;

import java.lang.reflect.Constructor;

public class ReflectDemo_getConstructionMethod {
    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;

        Constructor<Person> constructor = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor);//public com.ReflectExer.Person(java.lang.String,int)

        //创建对象
        Object person = personClass.newInstance();
        System.out.println(person);

        Object o = personClass.newInstance();
        System.out.println(o);

    }
}
