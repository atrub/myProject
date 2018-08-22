package com.alfabank;

public class ClassA implements Callback {
    public void callback(int i){
        System.out.println("Input i = " + Integer.toString(i));
    }

    public void cube(int i){
        System.out.println("Cube of i = " + i*i*i);
    }
}
