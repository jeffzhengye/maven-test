package com.aaa.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExamples {
    
    public static void testLookBehind(){
        String regex = "(?<=http://)\\S+";
        Pattern pattern = Pattern.compile(regex);

        String candidate = "The Java2s website can be found at ";
        candidate += "http://www.java2s.com. There, ";
        candidate += "you can find information about some of ";
        candidate += "best example codes";

        Matcher matcher = pattern.matcher(candidate);
        while (matcher.find()) {
          String msg = ":" + matcher.group() + ":";
          System.out.println(msg);
        }
    }
    
    public static void testLookAhead(){
        String regex = ".*(告诉|问)(([^我你]{0,2}(经理)]+)|(.{0,2}妈妈))(?![另外]).*";
        Pattern pattern = Pattern.compile(regex);

        String candidate = "告诉我妈妈的电话";

        Matcher matcher = pattern.matcher(candidate);
        while (matcher.find()) {
          String msg = matcher.group();
          System.out.println(msg);
        }
    }
    public static void main(String[] args) {
        testLookAhead();
    }
}
