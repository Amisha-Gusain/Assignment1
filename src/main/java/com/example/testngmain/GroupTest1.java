package com.example.testngmain;

import org.testng.annotations.Test;

public class GroupTest1 {
    @Test(priority = 1, groups = {"smoke"})
    public void testOne() {
        System.out.println("FirstTestCase → testOne (smoke, priority 1)");
    }

    @Test(priority = 2, groups = {"regression"})
    public void testTwo() {
        System.out.println("FirstTestCase → testTwo (regression, priority 2)");
    }

    @Test(priority = 3)
    public void testThree() {
        System.out.println("FirstTestCase → testThree (no group, priority 3)");
    }
}
