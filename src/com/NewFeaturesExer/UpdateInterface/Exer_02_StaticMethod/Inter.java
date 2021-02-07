package com.NewFeaturesExer.UpdateInterface.Exer_02_StaticMethod;

public interface Inter {
    void show();

    default void method(){
        System.out.println("Inter中的默认方法执行了");
    }

    public static void test(){//public可以省略，static不能省略
        System.out.println("Inter中的静态方法执行了");
    }
}
