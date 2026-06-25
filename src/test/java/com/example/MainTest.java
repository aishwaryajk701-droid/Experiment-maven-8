package com.example;

import org.junit.Test;
import org.junit.Assert;

public class MainTest {
    @Test
    public void mainTest()
    {
        Main m = new Main();
        int sum = m.add(5,5);
        Assert.assertEquals(10,sum);
        System.out.println("Successfull!");
    }
}
