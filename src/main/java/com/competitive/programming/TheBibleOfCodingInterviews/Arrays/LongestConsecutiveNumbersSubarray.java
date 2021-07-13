
package com.competitive.programming.TheBibleOfCodingInterviews.Arrays;

public class LongestConsecutiveNumbersSubarray {

    //O(n^2)
    int implementation(int[] array){
        int arrayLength = array.length;
        boolean[] frecArray;
        int answer = 0;
        for(int left = 0; left<arrayLength; left++){
            frecArray = new boolean[arrayLength];
            int max = array[left];
            int min = array[left];
            for(int right = left; right<arrayLength; right++){
                //If item exist twice break the loop
                if(frecArray[array[right]-1]) break;
                frecArray[array[right]-1] = true;
                max = Integer.max(max, array[right]);
                min = Integer.min(min,array[right]);
                if(right - left == max - min){
                    answer = Integer.max(answer, right - left + 1);
                }
            }
        }

        return answer;
    }
}
