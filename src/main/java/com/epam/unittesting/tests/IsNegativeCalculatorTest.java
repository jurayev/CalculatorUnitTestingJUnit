package com.epam.unittesting.tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class IsNegativeCalculatorTest extends BaseTest {
    private long a;
    boolean expected;

    public IsNegativeCalculatorTest(long a, boolean expected) {
        this.a = a;
        this.expected = expected;
    }

    @Test()
    public void isNegativeTest(){
        boolean result = calc.isNegative(a);
        System.out.println("is " + a + " the negative number " + "= "+ result);
        Assert.assertEquals("The number isn't negative!", expected, result);
    }

    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][]{
                {3440, false},
                {111, false},
                {11, false},
                {1, false},
                {0, false},
                {-1, true},
                {-3440, true},
                {-111, true},
                {-11, true},
        });
    }
}