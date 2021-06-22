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

public class IsPrimeNumber {
    public boolean isPrimeNumber(int number){
        if(number<2) return false;
        for(int i = 2; i<=Math.sqrt(number);i++){
            if(number%i==0) return false;
        }
        return true;
    }

}
