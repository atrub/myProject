package com.alfabank;

public class ClassB extends ClassA {
    public void callback(int i){
        System.out.println("Square of i = " + Integer.toString(i*i));
    }

    public void justOutName(){
        System.out.println("ClassB");
    }
}
