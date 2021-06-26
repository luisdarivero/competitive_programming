
package com.competitive.programming.TheBibleOfCodingInterviews.MathematicalFundamentals;

//Program that return true if the number is prime
//Complexity = O(sqrt(N))

public class IsPrimeNumber {
    public boolean isPrimeNumber(int number){
        if(number<2) return false;
        for(int i = 2; i<=Math.sqrt(number);i++){
            if(number%i==0) return false;
        }
        return true;
    }


}
