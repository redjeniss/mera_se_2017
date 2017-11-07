package com.company;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        MyDouble var0 = new MyDouble(123123123d);
        MyDouble var1 = new MyDouble(-1234123422d);

        if (var0.isEven()) {
            System.out.println("var0 is even, the sum is " + MyDouble.sum(var0, var1));
        }
        if (var1.isEven()) {
            System.out.println("var1 is even, the difference is " + MyDouble.difference(var0, var1));
            // var1 is even, the difference is 1.357246545E9
        }
        if (var0.isPositive()) {
            System.out.println("var0 is positive, the composition is " + MyDouble.multiply(var0, var1));
            // var0 is positive, the composition is -1.51949129884086912E17
        }
        if (var1.isPositive()) {
            System.out.println("var1 is positive, the quotient is " + MyDouble.divide(var0, var1));
        }
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
    }
}
