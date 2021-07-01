package com.competitive.programming.TheBibleOfCodingInterviews.Arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class RangeUpdateTrickTest {
    @Test
    void test(){
        int[] array = {2,-7,10,3,-1,19,-20,23,17};
        int[][] updatesArray = {{3,7,5},{4,8,2},{2,6,-1}};
        RangeUpdateTrick rangeUpdate = new RangeUpdateTrick();
        int [] actualResult = rangeUpdate.rangeUpdate(array,updatesArray);
        int[] expectedResult = {2,-8,14,9,5,25,-13,25,17};
        for(int i =0; i< expectedResult.length; i++){
            Assertions.assertEquals(expectedResult[i],actualResult[i]);
        }
    }
}
