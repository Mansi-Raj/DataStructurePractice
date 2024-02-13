package DataStructurePractice;

import java.util.*;

public class FirstPalindromicString {
    public String firstPalindromic(String[] s) {
        for (String w : s) {
            StringBuilder sb = new StringBuilder(w).reverse();
            if (w.equals(sb.toString())) {
                return w;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int n = sc.nextInt();
        String[] s = new String[n];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        FirstPalindromicString f = new FirstPalindromicString();
        System.out.println(f.firstPalindromic(s));
    }
}