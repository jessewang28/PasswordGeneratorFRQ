package com.company;

public class PasswordGenerator {
    private int digit = 0;
    private int d;
    private String prefix;
    public static int count;

    public PasswordGenerator(int digitLength, String p) {
        d=digitLength;
        prefix = p;
    }

    public PasswordGenerator(int digitLength) {
        d=digitLength;
        prefix = "A";
    }

    public static int pwCount() {
        return count;
    }

    public String pwGen() {
        int counter = 1;
        for (int i = 0; i < this.d; i++) {
            digit += (int) (Math.random() * 10) * counter;
            counter *= 10;
        }
        count++;
        return prefix + "." + digit;
    }
}
