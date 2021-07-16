package com.competitive.programming.HackerRank;

//The largest string

//Given a string, construct a new string by rearranging the original string and deleting characters as needed.
//Return the alphabetically largest string that can be constructed respecting a limit as how many consecutive characters can be the same.

//Example:
//S='baccc'
//k=2

//The largest string, alphabetically, is 'cccba' but is not allowed because it uses the character 'c' more than 2 times consecutively.
//Therefore, the answer is 'ccbca'.

//Constraints
//1 <= n <= 10^5 (Where n is the lenght of the string)
//1 <= k <= 10 ^ 3 (Where k is the limit as how many consecutive characters can be the same)
//Returns: (String) The alphabetically largest string that can be constructed that has no more than k identical consecutive characters

public class TheLargestString {

    public String getLargestString(String s, int k) {
        if(s == null || s.length() <1){
            return "";
        }
        //Frecuency array
        int[] charFrecArray = new int[26];
        char[] stoArray = s.toCharArray();

        StringBuffer result = new StringBuffer(s.length());

        int characterCounter = 0;

        for(char c : stoArray){
            charFrecArray[c-'a'] = charFrecArray[c-'a'] + 1;
            characterCounter ++;
        }


        for(int currentPointer = charFrecArray.length-1; currentPointer>=0;currentPointer--){
            int leftPointer = currentPointer-1;
            //There are characters to write
            while(charFrecArray[currentPointer] > 0){
                int charactersToWrite = Integer.min(k,charFrecArray[currentPointer]);
                writeOnBuffer(result,(char)(currentPointer + 'a'), charactersToWrite);
                charFrecArray[currentPointer] -= charactersToWrite;
                characterCounter -= charactersToWrite;
                //There are still characters to write
                if(charFrecArray[currentPointer] > 0){
                    //There is no possible to add more characters
                    if(characterCounter - charFrecArray[currentPointer] <= 0){
                        currentPointer = 0;
                        break;
                    }
                    //Find the next character to write
                    while(charFrecArray[leftPointer] <= 0){
                        leftPointer--;
                    }
                    //Write the character on the left pointer once
                    writeOnBuffer(result,(char)(leftPointer + 'a'), 1);
                    charFrecArray[leftPointer]--;
                    characterCounter--;
                }
            }
            if(leftPointer>=0 && currentPointer>0){
                currentPointer = leftPointer + 1;
            }
        }

        return result.toString();
    }

    private void writeOnBuffer(StringBuffer buffer, char c, int times){
        for(int i = 0; i<times; i++){
            buffer.append(c);
        }
    }
}
