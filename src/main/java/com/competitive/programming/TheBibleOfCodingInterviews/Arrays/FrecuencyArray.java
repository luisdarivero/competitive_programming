/*****************************************************************************************
 * File: 
 *
 * Copyright (c)  Omnitracs, LLC. All rights reserved.
 * Confidential and Proprietary – Omnitracs, Inc.
 * This software may be subject to U.S. and international export, re-export, or transfer
 * ("export") laws.
 * Diversion contrary to U.S. and international laws is strictly prohibited.
 ****************************************************************************************/
package com.competitive.programming.TheBibleOfCodingInterviews.Arrays;

import java.util.Arrays;

//How many distinct elements exist = O(n)
//Frecuency of some value = O(1)
public class FrecuencyArray {
    int implementation(int[] array){
        int maxArrayValue = Arrays.stream(array).max().getAsInt();
        int[] frecArray = new int[maxArrayValue];
        int frecuencyCounter = 0;
        for(int val: array){
            if(frecArray[val-1] == 0){
                frecuencyCounter++;
            }
            frecArray[val-1]++;
        }
        return frecuencyCounter;
    }
}
