package com.competitive.programming.TheBibleOfCodingInterviews.Arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class MaximumSubArrayTest {

    @Test
    void test(){
        MaximumSubArray maximumSubArray = new MaximumSubArray();
        int[] array = {5,-6,3,4,-2,3,-3};
        int expectedResult = 8;
        int actualResultBruteForce = maximumSubArray.bruteForceImpl(array);
        Assertions.assertEquals(expectedResult,actualResultBruteForce);
        int actualResultGreedy = maximumSubArray.greedyImpl(array);
        Assertions.assertEquals(expectedResult,actualResultGreedy);
        int actualResultPartialSums = maximumSubArray.greedyImpl(array);
        Assertions.assertEquals(expectedResult,actualResultPartialSums);

        //Second test
        array = new int[]{-5, -6, -3, -4, -2, -3, -3};
        expectedResult = -2;
        actualResultBruteForce = maximumSubArray.bruteForceImpl(array);
        Assertions.assertEquals(expectedResult,actualResultBruteForce);
        actualResultGreedy = maximumSubArray.greedyImpl(array);
        Assertions.assertEquals(expectedResult,actualResultGreedy);
        actualResultPartialSums = maximumSubArray.greedyImpl(array);
        Assertions.assertEquals(expectedResult,actualResultPartialSums);

        //3rd test
        array = new int[]{-5, 6, -3, -4, -2, -3, -3};
        expectedResult = 6;
        actualResultBruteForce = maximumSubArray.bruteForceImpl(array);
        Assertions.assertEquals(expectedResult,actualResultBruteForce);
        actualResultGreedy = maximumSubArray.greedyImpl(array);
        Assertions.assertEquals(expectedResult,actualResultGreedy);
        actualResultPartialSums = maximumSubArray.greedyImpl(array);
        Assertions.assertEquals(expectedResult,actualResultPartialSums);
    }

}
