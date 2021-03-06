package com.competitive.programming.TheBibleOfCodingInterviews.MathematicalFundamentals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IsPrimeNumberTest {
    @Test
    void mainTest(){
        IsPrimeNumber primeNumberClass = new IsPrimeNumber();
        int[] primeNumbers = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        int[] notPrimeNumbers = {0, 1, 4, 6, 8, 9, 10, 12, 14, 15, 16, 18, 20, 21, 22, 24, 25, 26, 27, 28, 30, 32, 33, 34, 35, 36, 38, 39, 40, 42, 44, 45, 46, 48, 49, 50, 51, 52, 54, 55, 56, 57, 58, 60, 62, 63};

        for(int primeNumber: primeNumbers){
            Assertions.assertEquals(true, primeNumberClass.isPrimeNumber(primeNumber));
        }
        for(int notPrimeNumber: notPrimeNumbers){
            Assertions.assertEquals(false, primeNumberClass.isPrimeNumber(notPrimeNumber));
        }
    }

}
