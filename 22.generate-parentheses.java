/*
 * @lc app=leetcode id=22 lang=java
 *
 * [22] Generate Parentheses
 *
 * https://leetcode.com/problems/generate-parentheses/description/
 *
 * algorithms
 * Medium (53.45%)
 * Total Accepted:    308.9K
 * Total Submissions: 577.4K
 * Testcase Example:  '3'
 *
 * 
 * Given n pairs of parentheses, write a function to generate all combinations
 * of well-formed parentheses.
 * 
 * 
 * 
 * For example, given n = 3, a solution set is:
 * 
 * 
 * [
 * ⁠ "((()))",
 * ⁠ "(()())",
 * ⁠ "(())()",
 * ⁠ "()(())",
 * ⁠ "()()()"
 * ]
 * 
 */
class Solution {
    // static List<String> combinations = new ArrayList<>();
    // public static List<String> generateParenthesis(int n) {
    //     generateParenthesis(n, n, "");

    //     return combinations;
    // }
    // private static void generateParenthesis(int open, int closed, String s){
    //     if(open == 0 && closed == 0){
    //         combinations.add(s);
    //     } else {
    //         if(open > 0)
    //             generateParenthesis(open - 1,closed,s + "(");
    //         if(closed > 0 && closed > open)
    //             generateParenthesis(open, closed - 1,s + ")");
    //     }
    // }

    List<String> combinations = new ArrayList<>();
    
    public List<String> generateParenthesis(int n) {
        generateParenthesis(n, n, "");
        return combinations;
    }
    
    private void generateParenthesis(int open, int closed, String s){
        if (open==0 && closed==0){
            combinations.add(s);
        } else {
            if (open > 0)
                generateParenthesis(open-1, closed, s+"(");

            if (closed > 0 && closed > open)
                generateParenthesis(open, closed-1, s+")");
        }
    }
}

