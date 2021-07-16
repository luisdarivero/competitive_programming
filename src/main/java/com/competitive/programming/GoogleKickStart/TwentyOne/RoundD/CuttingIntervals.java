package com.competitive.programming.GoogleKickStart.TwentyOne.RoundD;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;

//Not passed: Time limit exeeded
public class CuttingIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int testCases = Integer.parseInt(scanner.nextLine());

        for(int c =1; c<= testCases;c++){
            ArrayList<Long> lInterval = new ArrayList<>();
            ArrayList<Long> rInterval = new ArrayList<>();
            String[] NC = scanner.nextLine().split(" ");
            int N = Integer.parseInt(NC[0]);
            long C = Integer.parseInt(NC[1]);
            for(int interval = 0; interval<N; interval++){
                String[] nextInterval = scanner.nextLine().split(" ");
                lInterval.add(Long.parseLong(nextInterval[0]));
                rInterval.add(Long.parseLong(nextInterval[1]));
            }
            System.out.println("Case #" + c + ": " + cutIntervals(lInterval,rInterval,C));
        }
    }

    public static long cutIntervals(ArrayList<Long> lInterval, ArrayList<Long> rInterval, long cuts){
        HashMap<Long,Integer> map;
        while(cuts > 0){
            map = new HashMap<>();
            for(int i =0; i<lInterval.size(); i++){
                Long middlePoint = GetMiddlePoint(lInterval.get(i),rInterval.get(i));
                if(middlePoint!= null){
                    if(!map.containsKey(middlePoint)){
                        map.put(middlePoint,0);
                    }
                    map.put(middlePoint,map.get(middlePoint)+1);

                }
            }
            //Get the next cut range
            if(map.isEmpty()) break;
            Long nextCutRange = mostPopularValueKey(map);
            cutRange(lInterval,rInterval,nextCutRange);
            cuts--;
        }
        return lInterval.size();
    }

    public static void cutRange(ArrayList<Long> lInterval, ArrayList<Long> rInterval, long intervalCut){
        long n = lInterval.size();
        for(int i = 0; i< n;i++){
            long l = lInterval.get(i);
            long r = rInterval.get(i);
            if(l<intervalCut && r> intervalCut){
                rInterval.set(i,intervalCut);
                lInterval.add(intervalCut);
                rInterval.add(r);
            }
            else{
                lInterval.remove(i);
                rInterval.remove(i);
                i--;
            }
        }

    }

    public static Long mostPopularValueKey(HashMap<Long,Integer> map){
        Iterator hmIterator = map.entrySet().iterator();
        Long maxKey = Long.MIN_VALUE;
        Integer maxValue = Integer.MIN_VALUE;
        while (hmIterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry)hmIterator.next();
            if(((Integer)mapElement.getValue()) > maxValue){
                maxValue = (Integer)mapElement.getValue();
                maxKey = (Long)mapElement.getKey();
            }

        }
        return maxKey;
    }

    public static Long GetMiddlePoint(long a, long b){
        if(b-1 == a) return null;
        //return the average between those two numbers
        return (a + b) / 2;
    }
}

