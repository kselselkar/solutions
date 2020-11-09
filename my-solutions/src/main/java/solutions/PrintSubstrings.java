package solutions;

/*
  Time complexity : O(2pown * n) => 2 pow n subsets will be formed and and each node will print n elements.
  Space complexity : O(h) .height of the tree. since depth first search is performed the maximum size of the stack should be n
 */
public class PrintSubstrings {

    static void printSubstring(String input,String currentOutput){
        if(input.isEmpty()){
            //we reached the final decision in the tree
            System.out.println(currentOutput);
        }else{
            //excluding the first character
            printSubstring(input.substring(1),currentOutput);
            //including the first character
            printSubstring(input.substring(1),currentOutput + input.charAt(0));
        }
    }

    public static void main(String[] args) {
        String input="ab";
        printSubstring(input,"");
        System.out.println();
        input="abc";
        printSubstring(input,"");
        System.out.println();
        input="abcd";
        printSubstring(input,"");
    }
}
