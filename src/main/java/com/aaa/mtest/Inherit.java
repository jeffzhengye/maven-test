package com.aaa.mtest;

import static java.lang.System.out;

public class Inherit {
    public int a;

    public Inherit(int a) {
        this.a = a;
    }

    protected void private_printone() {
        out.println("private printone");
    }

    public void printone() {
        this.private_printone();
        out.println("test");
    }
}
