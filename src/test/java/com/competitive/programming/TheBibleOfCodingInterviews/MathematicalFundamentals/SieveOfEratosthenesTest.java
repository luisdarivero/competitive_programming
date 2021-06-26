package com.competitive.programming.TheBibleOfCodingInterviews.MathematicalFundamentals;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SieveOfEratosthenesTest {
    @Test
    void test(){
        SieveOfEratosthenes sieveOfEratosthenes = new SieveOfEratosthenes();
        //prime numbers from 1 to 30
        boolean[] primeNumbersArray = {false,true,true, false,true, false,true, false, false, false,true, false,true, false, false, false,true,false,true, false, false, false, true, false, false, false, false, false,true,false};
        boolean[] functionResult = sieveOfEratosthenes.sieveOfEratosthenes(primeNumbersArray.length);
        Assertions.assertEquals(functionResult.length,primeNumbersArray.length);
        int count = 0;
        for(boolean isPrimeNumber: primeNumbersArray){
            Assertions.assertEquals(functionResult[count],isPrimeNumber);
            count++;
        }
    }
}
