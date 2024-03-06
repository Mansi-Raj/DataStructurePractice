package DataStructurePractice.Arrays;

import java.util.*;

public class MaxWealth {
    public int maxWealth(int[][] accounts) {
        if (accounts == null || accounts.length == 0)
            return 0;
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if (max < sum) {
                max = sum;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = s.nextInt();
        int m = s.nextInt();
        int[][] acc = new int[n][m];
        System.out.println("Enter elements in array:");
        for (int i = 0; i < acc.length; i++) {
            for (int j = 0; j < acc[i].length; j++) {
                acc[i][j] = s.nextInt();
            }
        }
        MaxWealth mw = new MaxWealth();
        System.out.println("Maximum  Wealth is : " + mw.maxWealth(acc));
        s.close();
    }
}
