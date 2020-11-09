package solutions;

import java.util.*;

/*
Given array of integers [1, 6, 3, 2, 5, 5, 7, 8, 4, 8, 2, 5, 9, 9, 1, ...]
Write a function to print out all pairs that sum to 10 with average/best O(n) or linear run-time complexity.
Sample output: (1,9), (1,9), (6,4), (3,7), (2,8), (2,8), (5,5), (5,5), (5,5), (8,2), (8,2), (9,1), (9,1) Can print the pairs in any order, as long as numbers inside the pair respect the same order in which they appear in the original array. And it is acceptable to print each pair in a separate line.

 */

//Time complexity : O(n) (actually O(n+c) where c is the count of pairs of given sum..but its negligible)
//Space complexity : O(n) -> size of the output map
public class PrintSumPair {

    private void findPairs(int[] nums, int k) {
        //map to maintain the frequency of
        Map<Integer, Integer> mp = new HashMap<>();
        //Result output with order (linkedhash map complexity insertion and lookup is O(1)
        Map<Integer,List<String>> rs = new LinkedHashMap<>();

        for (int i = 0; i < nums.length; i++) {
            mp.put(nums[i], mp.getOrDefault(nums[i], 1));
            rs.putIfAbsent(nums[i],new ArrayList<>());
        }
        for (int i = 0; i < nums.length; i++) {
            int target = k - nums[i];
            if (mp.get(target) != null) {
                int count = mp.get(target);
                for (int j = 0; j < count; j++) {
                    String pair = "(" + nums[i] + ", " + target + ")";
                    //System.out.print(pair + "\n");
                    rs.get(nums[i]).add(pair);
                }
            }
        }
        for (List<String> value : rs.values()) {
            System.out.print(value+ " ");
        }
    }

    public static void main(String[] args) {
        PrintSumPair p = new PrintSumPair();
        int[] input = {1, 6, 3, 2, 5, 5, 7, 8, 4, 8, 2, 5, 9, 9, 1};
        p.findPairs(input, 10);
    }
}
