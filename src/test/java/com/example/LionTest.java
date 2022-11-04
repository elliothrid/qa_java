package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class LionTest {

    private final Feline feline = new Feline();
    private final Lion lion = new Lion(feline, "Самец");

    public LionTest() throws Exception {
    }

    @Test
    public void lionConstructorIncorrectSexThrowsException() {
        Assert.assertThrows(Exception.class, () -> new Lion(feline, "Негативный сценарий"));
    }

    @Test
    public void getKittensWithoutParametersGotOneKitten() {
        int expectedResult = 1;
        int actualResult = lion.getKittens();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void doesHaveManeTrue() {
        boolean expectedResult = true;
        boolean actualResult = lion.doesHaveMane();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getFoodGotFoodList() throws Exception {
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        List<String> actualResult = lion.getFood();
        Assert.assertEquals(expectedResult, actualResult);
    }

}
