/*****************************************************************************************
 * File: 
 *
 * Copyright (c)  Omnitracs, LLC. All rights reserved.
 * Confidential and Proprietary – Omnitracs, Inc.
 * This software may be subject to U.S. and international export, re-export, or transfer
 * ("export") laws.
 * Diversion contrary to U.S. and international laws is strictly prohibited.
 ****************************************************************************************/
package com.competitive.programming.TheBibleOfCodingInterviews.MathematicalFundamentals;

import java.util.HashMap;


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


