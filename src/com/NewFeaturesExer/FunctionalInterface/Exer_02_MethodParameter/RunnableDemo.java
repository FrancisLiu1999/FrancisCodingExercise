package com.NewFeaturesExer.FunctionalInterface.Exer_02_MethodParameter;

public class RunnableDemo {
    public static void main(String[] args) {
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"线程启动了");
            }
        });

        startThread(()-> System.out.println(Thread.currentThread().getName()+"线程启动了"));
    }
    public static void startThread(Runnable r){
        new Thread(r).start();
    }
}
