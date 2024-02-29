package DataStructurePractice.Arrays;

import java.util.*;

public class EventCountDigits {
    public int findNumbers(int[] num) {
        int count = 0;
        for (int n : num) {
            int digitCount = 0;
            while (n != 0) {
                digitCount++;
                n /= 10;
            }

            if (digitCount % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = s.nextInt();
        int[] num = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            num[i] = s.nextInt();
        }
        EventCountDigits e = new EventCountDigits();
        System.err.println("No. of elements with even count digits: " + e.findNumbers(num));
        s.close();
    }
}