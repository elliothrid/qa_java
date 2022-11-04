package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

@RunWith(Parameterized.class)
public class AnimalGetFoodParameterizedTest {

    private final String animalKind;
    private final List<String> expectedResult;

    public AnimalGetFoodParameterizedTest(String animalKind, List<String> expectedResult) {
        this.animalKind = animalKind;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object[][] setTestData() {
        return new Object[][] {
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")}
        };
    }

    @Test
    public void getAnimalFood() throws Exception {
        Animal animal = new Animal();
        List<String> actualResult = animal.getFood(animalKind);
        Assert.assertEquals(expectedResult, actualResult);
    }

}
