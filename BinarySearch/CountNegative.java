package DataStructurePractice.BinarySearch;

import java.util.*;

public class CountNegative {
    public int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] < 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        CountNegative cn = new CountNegative();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int m = s.nextInt();
        System.out.print("Enter number of columns:");
        int n = s.nextInt();
        int[][] grid = new int[m][n];
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = s.nextInt();
            }
        }
        System.out.println("Number of negative elements in the 2D array is:" + cn.countNegatives(grid));
        s.close();
    }
}