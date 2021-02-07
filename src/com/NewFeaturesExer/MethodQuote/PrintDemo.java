package com.NewFeaturesExer.MethodQuote;

public class PrintDemo {
    public static void main(String[] args) {
        usePrintable((s)->{
            return Integer.parseInt(s);
        });


        usePrintable(s-> Integer.parseInt(s));

        //方法引用::
        usePrintable(Integer::parseInt);

        //可推导的就是可省略的
    }

    private static void usePrintable(Printable p){
        p.printString("666");
    }
}
