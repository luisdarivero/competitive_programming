package com.competitive.programming.TheBibleOfCodingInterviews.MathematicalFundamentals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

class PrimeFactorizationTest {
    @Test
    void test(){
        PrimeFactorization factorization =  new PrimeFactorization();
        //----------------
        //100 factorization
        //----------------
        int number = 100;
        HashMap<Integer,Integer> expectedResult =  new HashMap<>();
        expectedResult.put(2,2);
        expectedResult.put(5,2);
        //Test normal implementation
        Assertions.assertEquals(factorization.factorization(number),expectedResult);
        //Test optimized implementation
        Assertions.assertEquals(factorization.OptimizedFactorization(number),expectedResult);
        //----------------
        //1000 factorization
        //----------------
        number = 1000;
        expectedResult =  new HashMap<>();
        expectedResult.put(2,3);
        expectedResult.put(5,3);
        //Test normal implementation
        Assertions.assertEquals(factorization.factorization(number),expectedResult);
        //Test optimized implementation
        Assertions.assertEquals(factorization.OptimizedFactorization(number),expectedResult);
        //----------------
        //13 factorization
        //----------------
        number = 13;
        expectedResult =  new HashMap<>();
        expectedResult.put(13,1);
        //Test normal implementation
        Assertions.assertEquals(factorization.factorization(number),expectedResult);
        //Test optimized implementation
        Assertions.assertEquals(factorization.OptimizedFactorization(number),expectedResult);
    }

}
