package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class LionAlexTest {

    private final Feline feline = new Feline();
    private final LionAlex alex = new LionAlex(feline);

    public LionAlexTest() throws Exception {
    }

    @Test
    public void getFriendsGotFriendsList() {
        List<String> expectedResult = List.of("Марти", "Глория", "Мелман");
        List<String> actualResult = alex.getFriends();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getPlaceOfLivingGotPlaceOfLiving() {
        String expectedResult = "Нью-Йоркский зоопарк";
        String actualResult = alex.getPlaceOfLiving();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getKittensGotZeroKittens() {
        int expectedResult = 0;
        int actualResult = alex.getKittens();
        assertEquals(expectedResult, actualResult);
    }

}
