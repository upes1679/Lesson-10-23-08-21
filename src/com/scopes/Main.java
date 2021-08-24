package com.scopes;

//class level scope
public class Main {
    private int a;

    //method level scope
    public void method() {
        int b = 4;
        int c;
        //block level scope
        if (true) {
            c = 7;
        }
        c=3;
    }
}
