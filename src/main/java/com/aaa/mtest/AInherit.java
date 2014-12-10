package com.aaa.mtest;
import static java.lang.System.out;

public class AInherit extends Inherit{

    public AInherit(int a) {
        super(a);
        // TODO Auto-generated constructor stub
    }
    
    protected void private_printone() {
        out.println("private printone in subclass");
    }
    
    @Override
    public void printone() {
        // TODO Auto-generated method stub
        out.println("before");
        super.printone();
        out.println("after");
    }
    
    public static void main(String[] args) {
        AInherit ain = new AInherit(0);
        ain.printone();
    }

}
