package com.competitive.programming.TheBibleOfCodingInterviews.MathematicalFundamentals;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FastModularExponentiationTest {

    @Test
    void recursiveTest(){
        FastModularExponentiation expo = new FastModularExponentiation();
        Assertions.assertEquals(1024,expo.recursive(2,10,1000000007));
        Assertions.assertEquals(282475249,expo.recursive(7,10,1000000007));
        Assertions.assertEquals(220703118,expo.recursive(5,13,1000000007));
    }

    @Test
    void iterative(){
        FastModularExponentiation expo = new FastModularExponentiation();
        Assertions.assertEquals(1024,expo.iterative(2,10,1000000007));
        Assertions.assertEquals(282475249,expo.iterative(7,10,1000000007));
        Assertions.assertEquals(220703118,expo.iterative(5,13,1000000007));
    }



}
