package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionConstructorParameterizedTest {

    private final String sex;
    private final boolean hasManeExpected;
    private final Feline feline = new Feline();

    public LionConstructorParameterizedTest(String sex, boolean hasManeExpected) {
        this.sex = sex;
        this.hasManeExpected = hasManeExpected;
    }

    @Parameterized.Parameters
    public static Object[][] setTestData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void getLionConstructor() throws Exception {
        Lion lion = new Lion(feline, sex);
        boolean hasManeActual = lion.hasMane;
        Assert.assertEquals(hasManeExpected, hasManeActual);
    }

}
