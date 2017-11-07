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

    public static double sum(MyDouble a, MyDouble b) {
        return a.number + b.number;
    }

    public static double difference(MyDouble a, MyDouble b) {
        return a.number - b.number;
    }

    public static double multiply(MyDouble a, MyDouble b) {
        return a.number * b.number;
    }

    public static double divide(MyDouble a, MyDouble b) {
        return a.number / b.number;
    }
}
