package solutions;


import java.util.HashMap;
import java.util.Map;

/*
Given an array of integers [2, 1, 2, 101, 4, 95, 3, 250, 4, 1, 2, 2, 7, 98, 123, 99, ...] Write a function (with linear run-time complexity) to print the following tabular output with ‘xxx' that resembles a histogram (your output should closely match the sample output below, including "99+" to capture the count for all numbers > 99)
Num | count
1 | xx
2 | xxxx
3 | x
4 | xx
.......
98 | x
99 | x
99+ | xxx
 */

//Time complexity => O(n) where n is the length of the array
//space complexity => O(n) where n is the size of the dictionary

public class PrintHistogram {

    int startRange=Integer.MAX_VALUE;
    final int maxRange=100;
    Map<Integer,Integer> histDict=new HashMap<>();

     void computeHistogram(int[] input){
        for(int i:input){
            startRange=Math.min(startRange,i);
            if(i < maxRange){
                histDict.put(i,histDict.getOrDefault(i,0)+1);
            }else{
                histDict.put(maxRange,histDict.getOrDefault(maxRange,0)+1);
            }
        }
        printHistogram();
    }

    void printHistogram(){
        System.out.println("Num |   Count");
         while(startRange <= maxRange){
             if(histDict.get(startRange) != null){
                 int repeatedCount = histDict.get(startRange);
                 StringBuilder sb=new StringBuilder();
                 for(int c=0; c< repeatedCount ; c++){
                    sb.append("x");
                }
                if(startRange < maxRange){
                    System.out.println(""+startRange+"  |   "+sb.toString());
                }else{
                    System.out.println("99+ |   "+sb.toString());
                }
             }
             startRange++;
         }
    }

    public static void main(String[] args) {
        PrintHistogram p=new PrintHistogram();
        int[] input={2, 1, 2, 101,5, 4, 95, 3,5,12 ,250, 4, 1, 2,12, 2, 5, 12,12, 98, 123, 99,900};
        p.computeHistogram(input);
    }

}
