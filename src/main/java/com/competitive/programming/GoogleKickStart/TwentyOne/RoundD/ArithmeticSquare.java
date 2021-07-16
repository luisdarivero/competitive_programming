package com.competitive.programming.GoogleKickStart.TwentyOne.RoundD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

//Passed
public class ArithmeticSquare {

    public static void main(String[] args) throws IOException {


        Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        // Reading data using readLine
        String tests = scanner.nextLine();
        int[] firstRow = new int[3];
        int[] secondRow = new int[3];
        int[] thirdRow = new int[3];
        String temp = "";
        for(int i=0; i<Integer.parseInt(tests);i++){
            temp = scanner.nextLine();
            firstRow = Arrays.stream(temp.split(" ")).mapToInt(s -> Integer.parseInt(s)).toArray();
            temp = scanner.nextLine();
            String[] sr = temp.split(" ");
            secondRow[0] = Integer.parseInt(sr[0]);
            secondRow[2] = Integer.parseInt(sr[1]);
            temp = scanner.nextLine();
            thirdRow = Arrays.stream(temp.split(" ")).mapToInt(s -> Integer.parseInt(s)).toArray();
            int[][] matrix= {firstRow,secondRow,thirdRow};
            int resAS = 0;
            try{
                resAS = aritmeticSquare(matrix);
            }
            catch(Exception e){

            }
            System.out.println("Case #" + (i + 1) + ": " + resAS);
        }
    }

    static int aritmeticSquare(int[][] matrix){
        //Arrays.stream(matrix[0]).forEach(System.out::println);
        int accumulator = 0;
        accumulator += isArithmeticPorgression(matrix[0][0],matrix[0][1],matrix[0][2]);//first row
        accumulator += isArithmeticPorgression(matrix[2][0],matrix[2][1],matrix[2][2]);//third row
        accumulator += isArithmeticPorgression(matrix[0][0],matrix[1][0],matrix[2][0]);//first column
        accumulator += isArithmeticPorgression(matrix[0][2],matrix[1][2],matrix[2][2]);//third column

        Integer[] possibleSolution = new Integer[4];
        possibleSolution[0] = possibleMiddleNumber(matrix[1][0],matrix[1][2]);
        possibleSolution[1] = possibleMiddleNumber(matrix[0][1],matrix[2][1]);
        possibleSolution[2] = possibleMiddleNumber(matrix[0][0],matrix[2][2]);
        possibleSolution[3] = possibleMiddleNumber(matrix[0][2],matrix[2][0]);
        int maxPossibleSolution = 0;
        for(Integer n:possibleSolution){
            if(n != null){
                int res = 0;
                matrix[1][1] = n;
                res += isArithmeticPorgression(matrix[1][0],matrix[1][1],matrix[1][2]);//middle row
                res += isArithmeticPorgression(matrix[0][1],matrix[1][1],matrix[2][1]);//middle column
                res += isArithmeticPorgression(matrix[0][0],matrix[1][1],matrix[2][2]);//left right diagonal
                res += isArithmeticPorgression(matrix[0][2],matrix[1][1],matrix[2][0]);//right left diagonal
                maxPossibleSolution = Integer.max(res,maxPossibleSolution);
            }
        }
        return maxPossibleSolution + accumulator;
    }

    static Integer possibleMiddleNumber(int a, int b){
        int result = b - a;
        if(result % 2 == 0){
            result = result/2;
            return a + result;
        }

        return null;
    }

    static int isArithmeticPorgression(int a,int b,int c){
        int diff = b-a;
        if(b + diff ==c){
            return 1;
        }
        return 0;
    }
}

