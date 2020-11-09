# Solutions

The solutions for the below problems can be found in the following files

* PrintHistogram.java
* PintSumPairs.java
* PrintSubstrings.java

## Problem Details

## Problem 1 : Print Histogram <br/>

Given an array of integers [2, 1, 2, 101, 4, 95, 3, 250, 4, 1, 2, 2, 7, 98, 123, 99, ...]
Write a function (with linear run-time complexity) to print the following tabular output with ‘xxx' that resembles a histogram (your output should closely match the sample output below, including "99+" to capture the count for all numbers > 99)

Num | count <br/>

1 | xx <br/>
2 | xxxx <br/>
3 | x <br/>
4 | xx <br/>
....... <br/>
98 | x <br/>
99 | x <br/>
99+ | xxx <br/>

## Problem 2 <br/>

Given array of integers [1, 6, 3, 2, 5, 5, 7, 8, 4, 8, 2, 5, 9, 9, 1, ...]
Write a function to print out all pairs that sum to 10 with average/best O(n) or linear run-time complexity.
Sample output: (1,9), (1,9), (6,4), (3,7), (2,8), (2,8), (5,5), (5,5), (5,5), (8,2), (8,2), (9,1), (9,1)
Can print the pairs in any order, as long as numbers inside the pair respect the same order in which they appear in the original array. And it is acceptable to print each pair in a separate line.

## Problem 3 <br/>
Write a function that takes an input string (no duplicate character) and prints out various strings as illustrated by the following sample outputs:
- input “ab” should print “”, “a”, “b”, “ab"
- input “abc” should print “”, “a”, “b”, “c”, “ab”, “ac”, “bc”, “abc"
- input “abcd” should print “”, “a”, “b”, “c”, “d”, “ab”, “ac”, “ad”, “bc”, “bd”, “cd”, “abc”, “abd”, “acd”, “bcd”, “abcd"
The function can return/print the substrings in any order (no duplicates). And it is acceptable to print each string in a separate line.
