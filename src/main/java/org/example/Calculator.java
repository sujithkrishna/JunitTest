package org.example;

public class Calculator {

    public static int add(Integer x, Integer y){
        if(x == null || y == null) throw new NullPointerException("Method arguments cannot be null");
        return x + y;
    }
}
