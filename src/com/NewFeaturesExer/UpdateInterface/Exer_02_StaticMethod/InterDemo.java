package com.NewFeaturesExer.UpdateInterface.Exer_02_StaticMethod;

public class InterDemo {
    public static void main(String[] args) {
        Inter i = new InterImpl();
        i.show();
        i.method();
        //i.test();
        Inter.test();//静态方法只能通过接口调用


    }
}
