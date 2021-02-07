package com.NewFeaturesExer.UpdateInterface.Exer_03_PrivateMethod;

public interface Inter {
    default void show1() {
        System.out.println("show1");
        show();
        method();
    }

    default void show2() {
        System.out.println("show2");
        show();
        method();
    }
//私有方法：Java9中接口中将不同方法中的共性方法抽取，并用私有进行隐藏
    private void show(){
        System.out.println("wow");
    }

    private static void method(){
        System.out.println("wow");
    }

    static void method1() {
        System.out.println("method1");
        method();
    }

    static void method2() {
        System.out.println("method2");
        method();
    }

}
