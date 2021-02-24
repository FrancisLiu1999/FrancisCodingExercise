package com.JunitExer.Test;

import com.JunitExer.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CalculatorTest {

    @Before//初始化方法
    public void init() {
        System.out.println("before");
    }

    @After//结束方法
    public void close() {
        System.out.println("close");
    }


    @Test
    public void testAdd() {
        Calculator c = new Calculator();
        int add = c.add(1, 2);
        Assert.assertEquals(3, add);
    }

    @Test
    public void testSub() {
        Calculator c = new Calculator();
        int sub = c.sub(2, 1);
        Assert.assertEquals(1, sub);
    }
}
