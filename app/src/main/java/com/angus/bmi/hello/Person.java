package com.angus.bmi.hello;

import java.util.StringTokenizer;

public class Person {
    float weight,height;

    public float bmi(){
        float bmi = weight/(height*height);
        return bmi;
    }

    public void hello(){
        System.out.println("Hello");
    }

    public void hello(String s){
        System.out.println(s + " ，Hello");
    }
}
