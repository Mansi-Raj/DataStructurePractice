package DataStructurePractice.Arrays;

import java.util.*;

public class ArraySearch {
    public int search(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (target == nums[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        ArraySearch as = new ArraySearch();
        int t = s.nextInt();
        System.out.println(as.search(arr, t));
        s.close();
    }
}