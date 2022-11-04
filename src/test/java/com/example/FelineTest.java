package com.example;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class FelineTest {

    private final Feline feline = new Feline();

    @Test
    public void eatMeatGotFoodList() throws Exception {
        List<String> expecteResult = List.of("Животные", "Птицы", "Рыба");
        List<String> actualResult = feline.eatMeat();
        Assert.assertEquals(expecteResult, actualResult);
    }

    @Test
    public void getFamilyGotFamilyDescribe() {
        String expectedResult = "Кошачьи";
        String actualResult = feline.getFamily();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getKittensWithoutParametersGotOneKitten() {
        int expectedResult = 1;
        int actualResult = feline.getKittens();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getKittensKittensCountGotKittensCount() {
        int expectedResult = 5;
        int actualResult = feline.getKittens(5);
        Assert.assertEquals(expectedResult, actualResult);
    }

}
