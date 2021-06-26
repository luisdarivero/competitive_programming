
package com.competitive.programming.TheBibleOfCodingInterviews.MathematicalFundamentals;

//program that implements the sieve of eratosthenes algorithm
//complexity = O(n * log(n))
//-----------------------| Why log(limit)? Because in the second loop, we are doing the following: (1/2+1/3+1/5+...+1/n)

public class SieveOfEratosthenes {

    public boolean[] sieveOfEratosthenes(int number){
        if(number <2) return null;
        boolean[] result = new boolean[number];
        for(int i=0; i<number; i++){
            result[i] = true;
        }
        result[0] = false;
        for(int i=2; i<= number/2; i++){
            if(result[i-1]){
                for(int j = i*2; j<=number; j = j+i){
                    result[j-1] = false;
                }
            }
        }
        return result;
    }
}
