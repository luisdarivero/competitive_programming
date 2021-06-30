
package com.competitive.programming.TheBibleOfCodingInterviews.Arrays;

public class PartialSums {

    int[] partialSum(int[] array, int[] startIndexArray, int[] finishIndexArray){
        int[] sumArray = new int[array.length];
        sumArray[0] = array[0];
        for(int i = 1; i < array.length; i++){
            sumArray[i] = sumArray[i-1] + array[i];
        }
        int[] result = new int[startIndexArray.length];
        for(int i = 0; i< startIndexArray.length; i++){
            int startIndex = startIndexArray[i];
            int finishIndex = finishIndexArray[i];
            result[i] =  sumArray[finishIndex] - (startIndex == 0 ? 0 : sumArray[startIndex - 1]);
        }
        return result;
    }
}
