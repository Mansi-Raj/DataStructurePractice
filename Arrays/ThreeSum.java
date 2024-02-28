package DataStructurePractice.Arrays;

import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int target = 0;
        Set<List<Integer>> set = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < n - 2; i++) {
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == target) {
                    set.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                } else if (sum > target) {
                    k--;
                } else if (target > sum) {
                    j++;
                }
            }
        }
        result.addAll(set);
        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = s.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = s.nextInt();
        }

        ThreeSum solution = new ThreeSum(); // Corrected class name here
        List<List<Integer>> result = solution.threeSum(nums);

        System.out.println("Three sum combinations with target 0:");
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
        s.close();
    }
}