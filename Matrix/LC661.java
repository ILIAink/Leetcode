package Matrix;

import java.util.Arrays;

public class LC661 {
    public static int[][] imageSmoother(int[][] img) {
        int ROW = img.length;
        int COL = img[0].length;

        int[][] result = new int[ROW][COL];

        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                result[i][j] = getAverage(img, i, j, ROW, COL);
            }
        }
        return result;
    }
    
    public static int getAverage(int[][] img, int x, int y, int ROW, int COL) {
        int count = 0;
        int sum = 0;

        /*
         * The Math.min might be hard to understand. It will take the minimum of either the max that
         * it can go (ROW-1, COL-1) OR the coordinate + 1. Since the coordinate is in the center.
         * Doing + 1 ensures that we're scanned a 3x3 grid
         */
        for (int i = Math.max(0, x - 1); i <= Math.min(ROW - 1, x + 1); i++) {
            for (int j = Math.max(0, y - 1); j <= Math.min(COL - 1, y + 1); j++) {
                sum += img[i][j];
                count++;
            }
        }

        return sum / count;
    }

    public static void main(String[] args) {
        int[][] img = {{100, 200, 100}, {200, 50, 200}, {100, 200, 100}};
        int[][] result = imageSmoother(img);

        for (int[] arr : result) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
