package DataStructurePractice.Arrays;

import java.util.*;

public class Candies {
    public List<Boolean> maxCandies(int[] candies, int extraC) {
        int max = 0;
        for (int candy : candies) {
            max = Math.max(max, candy);
        }
        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            result.add(candy + extraC >= max);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of arr:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.print("Enter Extra Candy:");
        int e = s.nextInt();
        Candies c = new Candies();
        List<Boolean> res = c.maxCandies(arr, e);
        System.out.println("The list of boolean values is: " + res);
        s.close();
    }
}