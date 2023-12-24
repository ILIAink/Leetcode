package Two_Pointers;

public class test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int p : arr) {
            if (p < firstMin) {
                secondMin = firstMin;
                firstMin = p;
            } else {
                secondMin = Math.min(p, secondMin);
            }
        }

        System.out.println(firstMin);
        System.out.println(secondMin);

    }
}
