package com.NewFeaturesExer.FunctionalInterface.Exer_03_MethodReturn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();

        array.add("cccc");
        array.add("aa");
        array.add("b");

        System.out.println(array);

        Collections.sort(array);
        Collections.sort(array, getComparator());

        System.out.println("排序后" + array);

    }

    public static Comparator<String> getComparator() {
//        //匿名内部类实现
//        Comparator<String> comp = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        };
        return (s1, s2) -> s1.length() - s2.length();
        
    }
}
