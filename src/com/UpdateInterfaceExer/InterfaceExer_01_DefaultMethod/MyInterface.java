package com.UpdateInterfaceExer.InterfaceExer_01_DefaultMethod;

public interface MyInterface {
    void show1();

    void show2();

    //额外加的show3()方法不是默认方法，不强制被重写，重写去掉default关键字
    //public可以省略，default不可省略
    public default void show3() {
        System.out.println("show3");
    }
}
