package leecode;//Write a function to find the longest common prefix string amongst an array of
//strings. 
//
// If there is no common prefix, return an empty string "". 
//
// 
// Example 1: 
//
// 
//Input: strs = ["flower","flow","flight"]
//Output: "fl"
// 
//
// Example 2: 
//
// 
//Input: strs = ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.
// 
//
//
// Constraints: 
//
// 
// 1 <= strs.length <= 200 
// 0 <= strs[i].length <= 200 
// strs[i] consists of only lower-case English letters. 
// 
// Related Topics String 
// 👍 4350 👎 2274


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public static void main(String[] args) {
        String[] strArr = new String[]{"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strArr));
    }
    public static String longestCommonPrefix(String[] strs) {
        StringBuffer x=new StringBuffer();
        for (int i = 0; i < strs[0].length(); i++) {
            if (strs[0].charAt(i)==strs[1].charAt(i) && strs[0].charAt(i)==strs[2].charAt(i)){
                x.append(strs[0].charAt(i));
            }else{
                break;
            }

        }
        return x.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)
