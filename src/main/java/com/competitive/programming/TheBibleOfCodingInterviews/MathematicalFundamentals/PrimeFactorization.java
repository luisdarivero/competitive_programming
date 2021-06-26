
package com.competitive.programming.TheBibleOfCodingInterviews.MathematicalFundamentals;

import java.util.HashMap;

//Program that return the factorization of a given number
//Complexity = O(sqrt(N))
public class PrimeFactorization {
    //Normal implementation
    public HashMap<Integer,Integer> factorization(int number){
        HashMap<Integer,Integer> result =  new HashMap<>();
        int currentDivisor = 2;
        while(number>1){
            int currentDivisorUsage = 0;
            while(number%currentDivisor ==0){
                number /= currentDivisor;
                currentDivisorUsage++;
            }
            if(currentDivisorUsage >0){
                result.put(currentDivisor,currentDivisorUsage);
            }
            currentDivisor++;
        }
        return result;
    }
    //Optimized implementation
    public HashMap<Integer,Integer> OptimizedFactorization(int number){
        HashMap<Integer,Integer> result =  new HashMap<>();
        int currentDivisor = 2;
        //Just goes until sqrt(m)<=currentDivisor
        while(number>1 && currentDivisor*currentDivisor<=number){
            int currentDivisorUsage = 0;
            while(number%currentDivisor ==0){
                number /= currentDivisor;
                currentDivisorUsage++;
            }
            if(currentDivisorUsage >0){
                result.put(currentDivisor,currentDivisorUsage);
            }
            currentDivisor++;
        }
        if(number>1){
            result.put(number,1);
        }
        return result;
    }
}


