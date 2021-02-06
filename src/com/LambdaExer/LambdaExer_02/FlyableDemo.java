package com.LambdaExer.LambdaExer_02;

public class FlyableDemo {
    public static void main(String[] args) {
        useFlyable(new Flyable(){

            @Override
            public void fly(String s) {
                System.out.println(s);
                System.out.println("匿名内部类");
            }
        });

        useFlyable((s -> {
            System.out.println(s);
            System.out.println("Lambda");
        }));
    }





    private static void  useFlyable(Flyable f){
        f.fly("飞");
    }
}
