package com.competitive.programming.TheBibleOfCodingInterviews.Arrays;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


class PartialSumsTest {

    @Test
    void test(){
        PartialSums partialSums = new PartialSums();
        int[] array = {7,-2,3,9,-11,5,1,-3};

        //Triplet values definition
        //Start index array
        int[] startIndexArray = {0,3,1};
        //Finish index array
        int[] finishIndexArray = {7,4,5};
        //Partial sum result
        int[] results = {9,-2,4};
        int[] functionResults = partialSums.partialSum(array,startIndexArray,finishIndexArray);
        for(int i=0; i< results.length;i++  ){
            Assertions.assertEquals(results[i],functionResults[i]);
        }
    }
}
