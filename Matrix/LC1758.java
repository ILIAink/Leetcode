package Matrix;

public class LC1758 {
    public static int minOperations(String s) {
        int count = 0;


        /*
         * There is two possibilities: 0101... OR 1010... (they are exact opposite). We are checking
         * where it matches a certain pattern (in this case 1010...). Whenever it is different we
         * count UP Then we check if our count is the highest, or if the opposite is the highest
         * (s.length - count)
         */
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                if (s.charAt(i) == '0') {
                    count++;
                }
            } else {
                if (s.charAt(i) == '1') {
                    count++;
                }
            }
        }

        // Check if it takes longer to match it to the pattern we're checking for
        // OR the opposite pattern
        return Math.min(count, s.length() - count);

    }

    public static void main(String[] args) {
        System.out.println(minOperations("0100"));
    }
}
