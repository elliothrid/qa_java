package com.example;

import org.junit.Assert;
import org.junit.Test;

public class AnimalTest {

    private final Animal animal = new Animal();

    @Test
    public void getFoodIncorrectAnimalKindThrowsException() {
        Assert.assertThrows(Exception.class, () -> animal.getFood("Негативный сценарий"));
    }

    @Test
    public void getFamilyGotFamilyDescribe() {
        String expectedResult = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actualResult = animal.getFamily();
        Assert.assertEquals(expectedResult, actualResult);
    }

}
