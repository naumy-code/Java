//package leecode;//两个整数的 汉明距离 指的是这两个数字的二进制数对应位不同的数量。
////
//// 计算一个数组中，任意两个数之间汉明距离的总和。
////
//// 示例:
////
////
////输入: 4, 14, 2
////
////输出: 6
////
////解释: 在二进制表示中，4表示为0100，14表示为1110，2表示为0010。（这样表示是为了体现后四位之间关系）
////所以答案为：
////HammingDistance(4, 14) + HammingDistance(4, 2) + HammingDistance(14, 2) = 2 +
////2 + 2 = 6.
////
////
//// 注意:
////
////
//// 数组中元素的范围为从 0到 10^9。
//// 数组的长度不超过 10^4。
////
//// Related Topics 位运算
//// 👍 206 👎 0
//
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//    public static void main(String[] args) {
//        int[] arr = new int[]{4,14,2};
//        System.out.println(totalHammingDistance(arr));
//    }
//
//    public static int totalHammingDistance(int[] nums) {
//        int ans = 0, n = nums.length;
//        for (int i = 0; i < 30; ++i) {
//            int c = 0;
//            for (int val:nums){
//                c += (val >> i) & 1;
//            }
//            ans += c * (n - c);
//        }
//        return ans;
//    }
//
//}
////leetcode submit region end(Prohibit modification and deletion)
