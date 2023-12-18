package Bitwise;



/*
 * https://leetcode.com/problems/single-number/
 */
public class LC136 {
    // If two numbers are equal they will cancel out w/ XOR and become 0
    // If 0 is XOR'd with any number it will become that number
    public static int singleNumber(int[] list) {
        int num = 0;
        for (int i = 0; i < list.length; i++) {
            num = num ^ list[i];
        }
        return num;
    }

    public static void main(String[] args) {
        // 3 is unique
        int[] list = {1, 1, 4, 4, 5, 3, 5, 6, 8, 6, 7, 7, 8};
        int result = singleNumber(list);
        System.out.println(result);

    }
}


