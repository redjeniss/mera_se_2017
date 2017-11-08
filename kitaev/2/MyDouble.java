package com.company;

public final class MyDouble {
    private final double number;

    public MyDouble(double number) {
        this.number = number;
    }

    public boolean isEven() {
        return this.number % 2 == 0;
    }

    public boolean isPositive() {
        return this.number > 0;
    }

    public static double sum(MyDouble[] args) {
        double sum = 0;
        for (MyDouble item : args) {
            sum += item.number;
        }
        return sum;
    }

    public static double difference(MyDouble a, MyDouble b) {
        return a.number - b.number;
    }

    public static double multiply(MyDouble[] args) {
        double composition = 1;
        for (MyDouble item : args) {
            composition *= item.number;
        }
        return composition;
    }

    public static double divide(MyDouble a, MyDouble b) {
        return a.number / b.number;
    }
}
