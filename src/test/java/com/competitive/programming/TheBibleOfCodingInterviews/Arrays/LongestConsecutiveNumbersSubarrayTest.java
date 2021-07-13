package com.competitive.programming.TheBibleOfCodingInterviews.Arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class LongestConsecutiveNumbersSubarrayTest {

    @Test
    void test(){
        LongestConsecutiveNumbersSubarray longest = new LongestConsecutiveNumbersSubarray();
        int[] array = {3,7,1,4,2,5,3,8,10,9};
        int expectedResult = 5;
        int actualResult = longest.implementation(array);
        Assertions.assertEquals(expectedResult,actualResult);
    }
}
