package DataStructurePractice.Arrays;

import java.util.*;

public class RunningSumOfArray {
    public int[] runningSum(int[] num) {
        if (num == null || num.length <= 1)
            return num;
        int[] ans = new int[num.length];
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
            ans[i] = sum;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = s.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        RunningSumOfArray r = new RunningSumOfArray();
        int[] ans = r.runningSum(a);
        System.out.println(Arrays.toString(ans));
        s.close();
    }
}