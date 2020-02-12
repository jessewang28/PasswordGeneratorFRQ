package com.company;

public class PasswordGenerator {
    private int digit=0;
    private String prefix;
    public static int count;

    public PasswordGenerator(int digitLength, String p){
        int counter=1;
        for (int i = 0; i<digitLength; i++){
            digit+= (int) (Math.random()*10)*counter;
            counter*=10;
        }
        prefix = p;
    }

    public PasswordGenerator(int digitLength){
        int counter=1;
        for (int i = 0; i<digitLength; i++){
            digit+= (int) (Math.random()*10)*counter;
            counter*=10;
        }
        prefix = "A";
    }

    public static int pwCount(){
        return count;
    }

    public String pwGen(){
        count++;
        return prefix + "." + digit;
    }

}
