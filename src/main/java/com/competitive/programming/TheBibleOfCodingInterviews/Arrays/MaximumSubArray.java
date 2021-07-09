
package com.competitive.programming.TheBibleOfCodingInterviews.Arrays;

public class MaximumSubArray {

    //O(n^2)
    int bruteForceImpl(int[] array){
        int result = Integer.MIN_VALUE;
        for(int i = 0; i< array.length; i++){
            int subArrayAcumulator = 0;
            for(int j=i; j< array.length;j++){
                subArrayAcumulator += array[j];
                result = Integer.max(subArrayAcumulator,result);
            }

        }

        return result;
    }
    //O(n)
    int greedyImpl(int[] array){
        int result = Integer.MIN_VALUE;
        int minValue = 0;
        int accumulator = 0;
        for(int value: array){
            accumulator += value;
            result = Integer.max(accumulator,result);
            accumulator = accumulator < minValue ? 0: accumulator;
        }
        return result;
    }

    //O(n)
    int partialSumsImpl(int[] array){
        int[] partialSumArray = new int[array.length];
        int accumulator = 0;
        for(int i = 0; i< array.length; i++){
            accumulator += array[i];
            partialSumArray[i] = accumulator;
        }

        int result = array[0];
        int partialSumMinVal = 0;
        for(int i = 0; i< array.length; i++){
            if(partialSumArray[i] - partialSumMinVal > result){
                result = partialSumArray[i] - partialSumMinVal;
            }
            if(partialSumArray[i] < partialSumMinVal){
                partialSumMinVal = partialSumArray[i];
            }
        }
        return result;
    }
}
