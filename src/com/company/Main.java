package com.company;

public class Main {

    public static void main(String[] args) {
//        byte;
//        short;
//        int;
//        long;
//        float;
//        double;
//        char;

        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";

        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2019";

        System.out.println("myString is equal to " + myString);

        String  numberString = "2503.55";
        numberString = numberString + "493.14";
        System.out.println("numberString is equal to " + numberString);




    }
}
