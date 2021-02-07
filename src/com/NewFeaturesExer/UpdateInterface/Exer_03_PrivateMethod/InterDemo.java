package com.NewFeaturesExer.UpdateInterface.Exer_03_PrivateMethod;

public class InterDemo {
    public static void main(String[] args) {
        Inter i = new InterImpl();
        i.show1();
        i.show2();

        Inter.method1();
        Inter.method2();
    }
}
