package DataStructurePractice.Arrays;

import java.util.*;

public class MissingNos {
    public int missingNos(int[] nums) {
        int n = nums.length;
        int sum = n * (n - 1) / 2;
        for (int num : nums) {
            sum -= num;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        System.out.println("Enter the elements util the 'q' is entered: ");
        while (true) {
            String ip = s.next();
            if (ip.equalsIgnoreCase("s")) {
                break;
            }
            int num = Integer.parseInt(ip);
            nums.add(num);
        }
        int[] n = new int[nums.size()];
        for (int i = 0; i < n.length; i++) {
            n[i] = nums.get(i);
        }

        MissingNos m = new MissingNos();
        System.out.print("Missing number: " + m.missingNos(n));
        s.close();
    }
}