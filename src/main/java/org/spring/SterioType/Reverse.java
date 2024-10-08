package org.spring.SterioType;

public class Reverse {
    public static int reverse(int x) {
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            x /= 10;


            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            reversed = reversed * 10 + digit;
        }

        return reversed;
    }
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int a = 123;
        int b = -123;
        int c = 1200;

        System.out.println(reverse(a));
        System.out.println(reverse(b));
        System.out.println(reverse(c));
    }

}
