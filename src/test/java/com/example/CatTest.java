package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline mockedFeline;
    private final Feline feline = new Feline();
    private final Cat cat = new Cat(feline);

    @Test
    public void getSoundWithoutParametersCatMeowed() {
        String expectedResult = "Мяу";
        String actualResult = cat.getSound();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getFoodAsHerbivore() throws Exception {
        Cat catMockedFeline = new Cat(mockedFeline);
        List<String> expectedResult = List.of("Трава", "Различные растения");
        Mockito.when(mockedFeline.eatMeat()).thenReturn(expectedResult);
        List<String> actualResult = catMockedFeline.getFood();
        Assert.assertEquals(expectedResult, actualResult);
    }

}
