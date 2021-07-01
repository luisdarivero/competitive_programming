
package com.competitive.programming.TheBibleOfCodingInterviews.Arrays;

import java.util.Arrays;

public class RangeUpdateTrick {
    int[] rangeUpdate(int[] initialArray, int[][] updatesArray){
        int[] result = new int[initialArray.length];
        int [] partialSum = new int[initialArray.length];

        for(int i=0;i< initialArray.length;i++){
            result[i] = 0;
            partialSum[i] =0;
        }
        partialSum = update(partialSum,updatesArray);

        result[0] = partialSum[0] + initialArray[0];
        for(int i = 1; i< partialSum.length; i++){
            partialSum[i] += partialSum[i-1];
            result[i] = partialSum[i] + initialArray[i];
        }

        return result;
    }

    int[] update(int[] partialSumArray,int[][] updatesArray){
        for(int[] update: updatesArray){
            partialSumArray[update[0]-1] += update[2];
            partialSumArray[update[1]] -= update[2];
        }

        return partialSumArray;
    }
}
