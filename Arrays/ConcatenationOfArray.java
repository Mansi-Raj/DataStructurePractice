package DataStructurePractice.Arrays;

import java.util.*;

public class ConcatenationOfArray {
    public int[] getConcatenation(int[] num) {
        int n = num.length;
        int[] a = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            if (i < n) {
                a[i] = num[i];
            } else {
                a[i] = num[i - n];
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = s.nextInt();
        int[] num = new int[n];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            num[i] = s.nextInt();
        }
        ConcatenationOfArray c = new ConcatenationOfArray();
        int[] ans = c.getConcatenation(num);
        System.out.print("[");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.print("]");
        s.close();
    }
}