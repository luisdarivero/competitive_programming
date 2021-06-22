package com.competitive.programming.TheBibleOfCodingInterviews.MathematicalFundamentals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class PrimeFactorizationTest {
    @Test
    void test(){
        PrimeFactorization factorization =  new PrimeFactorization();
        //100 factorization
        int number = 100;
        HashMap<Integer,Integer> expectedResult =  new HashMap<>();
        expectedResult.put(2,2);
        expectedResult.put(5,2);
        //Test normal implementation
        Assertions.assertEquals(factorization.factorization(number),expectedResult);
        //Test optimized implementation
        Assertions.assertEquals(factorization.OptimizedFactorization(number),expectedResult);
    }

}
