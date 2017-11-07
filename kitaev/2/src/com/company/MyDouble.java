package com.company;

public class MyNumber extends Double {
    private final double  number;

    public void setNumber(double parameter) {
        this.number = parameter;
    }
    public boolean isEven() {
        return this.number % 2 == 0;
    }

    public boolean isPositive() {
        return this.number > 0;
    }
}
