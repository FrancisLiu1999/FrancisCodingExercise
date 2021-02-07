package com.NewFeaturesExer.Lambda.Exer_05_AnonymousInnerClass;

public class LambdaDemo {
    public static void main(String[] args) {

        useInter(new Inter() {
            @Override
            public void show() {
                System.out.println("接口");
            }
        });
        useAnimal(new Animal() {
            @Override
            public void method() {
                System.out.println("抽象类");
            }
        });
        useStudent(new Student() {
            @Override
            public void study() {
                System.out.println("具体类");
            }
        });


        //Lambda只能是接口，接口中只能有1个抽象方法
        useInter(() -> System.out.println("接口"));
        //useAnimal(()-> System.out.println("抽象类"));
        //useStudent(() -> System.out.println("具体类"));

    }

    private static void useStudent(Student s) {
        s.study();
    }

    private static void useAnimal(Animal a) {
        a.method();
    }

    private static void useInter(Inter i) {
        i.show();
    }
}
