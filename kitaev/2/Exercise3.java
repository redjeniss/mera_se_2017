package com.company;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        int[] array = {1, 5, 10, 2, 3, 3, 3, 3, 3, -2};
        Integer max = null;
        Integer index = null;
        for (int i = 0; i < 10; i++) {
            if (array[i] > 100) {
                break;
            }
            if (max == null) {
                max = array[i];
                index = i;
            } else if (max < array[i]) {
                max = array[i];
                index = i;
            }
        }
        System.out.println(index);
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
    }
}
