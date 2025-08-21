package com.example.testngmain;

import org.testng.annotations.Test;

public class GroupTest2 {
    @Test(priority = 1, groups = {"smoke"})
public void testA() {
    System.out.println("SecondTestCase → testA (smoke, priority 1)");
}

    @Test(priority = 2, groups = {"regression"})
    public void testB() {
        System.out.println("SecondTestCase → testB (regression, priority 2)");
    }

    @Test(priority = 3)
    public void testC() {
        System.out.println("SecondTestCase → testC (no group, priority 3)");
    }
}
