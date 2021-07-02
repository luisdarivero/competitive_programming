package com.competitive.programming.TheBibleOfCodingInterviews.Arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class FrecuencyArrayTest {
    @Test
    void test(){
        FrecuencyArray frecuencyArray = new FrecuencyArray();
        int[] initialTest = {7,1,2,2,7,6,5,4,8,2};
        int expectedResult = 7;
        int actualResult = frecuencyArray.implementation(initialTest);
        Assertions.assertEquals(expectedResult,actualResult);
        int[] secondaryTest = {7,3,1,3,2,7};
        expectedResult = 4;
        actualResult = frecuencyArray.implementation(secondaryTest);
        Assertions.assertEquals(expectedResult,actualResult);
    }
}
