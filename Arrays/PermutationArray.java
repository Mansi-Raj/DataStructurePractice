package DataStructurePractice.Arrays;

import java.util.*;

public class PermutationArray {
    public int[] buildArray(int[] num) {
        int[] ans = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            ans[i] = num[num[i]];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = s.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        PermutationArray o = new PermutationArray();
        int[] ans = o.buildArray(a);
        System.out.print("The rebuilt array is :");
        System.out.print(Arrays.toString(ans));
        s.close();
    }
}
