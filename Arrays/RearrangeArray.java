package DataStructurePractice.Arrays;

import java.util.*;

public class RearrangeArray {
    public int[] rearrangeArray(int[] n) {
        int p = 0, m = 1;
        int[] result = new int[n.length];

        for (int i = 0; i < result.length; i++) {
            if (n[i] > 0) {
                result[p] = n[i];
                p += 2;
            } else {
                result[m] = n[i];
                m += 2;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        RearrangeArray a = new RearrangeArray();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length of array:");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.print(a.rearrangeArray(arr));
        s.close();
    }
}