package com.LambdaExer.LambdaExer_03_Parameter;

public class AddableDemo {
    public static void main(String[] args) {

        useAddable((int x,int y)->{
            return x+y;
        });

    }


    public static void useAddable(Addable a){
        int add = a.add(10, 20);
        System.out.println(add);
    }
}
