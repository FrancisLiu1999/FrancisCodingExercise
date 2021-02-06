package com.LambdaExer.LambdaExer_01_Simple;

public class LambdaDemo {
    public static void main(String[] args) {
        //主方法调用useEatable();
        Eatable e=new EatableImpl();
        useEatable(e);

        //匿名内部类
        useEatable(new Eatable() {
            @Override
            public void eat() {
                System.out.println("吃");
            }
        });

        //Lambda表达式
        useEatable(()->{
            System.out.println("吃");
        });
    }

    private static void useEatable(Eatable e) {
        e.eat();
    }
}
