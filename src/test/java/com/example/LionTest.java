package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline mockedFeline;
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
    public void getFoodAsHerbivore() throws Exception {
        Lion lionMockedFeline = new Lion(mockedFeline, "Самец");
        List<String> expectedResult = List.of("Трава", "Различные растения");
        Mockito.when(mockedFeline.getFood("Хищник")).thenReturn(expectedResult);
        List<String> actualResult = lionMockedFeline.getFood();
        Assert.assertEquals(expectedResult, actualResult);
    }

}
