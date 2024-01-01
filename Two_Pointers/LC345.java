package Two_Pointers;

import java.util.Arrays;

public class LC345 {
    public static String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        int left = 0;
        int right = s.length() - 1;

        var sArr = s.toCharArray();
        while (left < right) {
            while (left < right && vowels.indexOf(sArr[left]) == -1) {
                left++;
            }

            while (left < right && vowels.indexOf(sArr[right]) == -1) {
                right--;
            }

            char temp = sArr[left];
            sArr[left] = sArr[right];
            sArr[right] = temp;
            right--;
            left++;

        }

        return new String(sArr);
    }

    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverseVowels(s));
    }
}
