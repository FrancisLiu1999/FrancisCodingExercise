package com.NewFeaturesExer.Lambda.Exer_04_OmitMode;

public class LambdaDemo {
    public static void main(String[] args) {
        useAddable((x, y) -> {
            return x + y;
        });


        useFlyable(s-> System.out.println(s));

        useAddable((x,y)->x+y);



    }


    private static void useFlyable(Flyable f) {
        f.fly("飞");
    }

    private static void useAddable(Addable a) {
        int sum = a.add(10, 20);
        System.out.println(sum);
    }
}
