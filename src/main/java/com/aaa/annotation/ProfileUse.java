package com.aaa.annotation;

import com.aaa.annotation.Profile;

public class ProfileUse {
    
    public ProfileUse() {
        // TODO Auto-generated constructor stub
    }
    
    @Profile
    public void testProfile(int c){
        long current = System.currentTimeMillis();
        double[] a = new double[c];
        for(int i =0; i < c; i++){
            a[i] *= a[i];
        }
        System.out.println("time: " + (System.currentTimeMillis() - current));
    }

    public static void main(String[] args) {
        ProfileUse puse = new ProfileUse();
        puse.testProfile(100000000);
        System.out.println("done");
    }
}
