package com.competitive.programming.HackerRank;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class TheLargestStringTest {

    @Test
    void test(){
        TheLargestString largest = new TheLargestString();
        //First test
        String input = "baccc";
        int k = 2;
        String expectedResult = "ccbca";
        String actualResult = largest.getLargestString(input,k);
        Assertions.assertEquals(expectedResult,actualResult);

        //Second test
        input = "xxxxzaz";
        k = 3;
        expectedResult = "zzxxxax";
        actualResult = largest.getLargestString(input,k);
        Assertions.assertEquals(expectedResult,actualResult);

        //3rth test
        input = "aaaaaaaaaa";
        k = 3;
        expectedResult = "aaa";
        actualResult = largest.getLargestString(input,k);
        Assertions.assertEquals(expectedResult,actualResult);

        //4rth test
        input = "";
        k = 3;
        expectedResult = "";
        actualResult = largest.getLargestString(input,k);
        Assertions.assertEquals(expectedResult,actualResult);

        //5th test
        input = "bbb";
        k = 2;
        expectedResult = "bb";
        actualResult = largest.getLargestString(input,k);
        Assertions.assertEquals(expectedResult,actualResult);

        //6th
        input = "abbbb";
        k = 2;
        expectedResult = "bbabb";
        actualResult = largest.getLargestString(input,k);
        Assertions.assertEquals(expectedResult,actualResult);

        //7th
        input = "x";
        k = 0;
        expectedResult = "";
        actualResult = largest.getLargestString(input,k);
        Assertions.assertEquals(expectedResult,actualResult);

        //8th test
        input = "x";
        k = 1;
        expectedResult = "x";
        actualResult = largest.getLargestString(input,k);
        Assertions.assertEquals(expectedResult,actualResult);
    }

}