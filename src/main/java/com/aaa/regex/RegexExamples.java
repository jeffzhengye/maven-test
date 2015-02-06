package com.aaa.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExamples {
    static final Pattern dpattern = Pattern.compile("(?<index>[0-9]+?):(?<value>[0-9\\.]+)"); //non-greedy match
    
    public static void testNameGroup(){
        Pattern fpattern = Pattern.compile("\\{(?<name>.+?):(?<value>[0-9\\.]+?)\\}"); //non-greedy match
        String text = "把我明天的日程安排告诉我，谢谢  CALENDAR        {<calendar_dict>:1.00} {<calendar>:1.00} {<dates>:1.00} {<inform_me>:1.00} {告 诉 我:1.00} {MYSCHEDULE:1.00} {TIME:1.00} {MY_TIME:1.00}";
        Matcher matcher = fpattern.matcher(text);
        while (matcher.find()) {
//          String msg = matcher.group();
          System.out.println(matcher.group("name"));
          System.out.println(matcher.group("value"));
        }
    }
    
    public static void testdNameGroup(){
        String text = "20:1.0 60:1.0 77:1.0 89:1.0 146:1.0 185:1.0 800:1.0 822:1.0 827:1.0 869:1.0";
        Matcher matcher = dpattern.matcher(text);
        while (matcher.find()) {
//          String msg = matcher.group();
          System.out.println(matcher.group("index"));
          System.out.println(matcher.group("value"));
        }
    }
    
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
    
    public static void testMeta(){
        String regex = ".*(\\d{6}).*";
        Pattern pattern = Pattern.compile(regex);

        String candidate = "告诉我妈妈的电话123456";

        Matcher matcher = pattern.matcher(candidate);
        while (matcher.find()) {
          String msg = matcher.group(1);
          System.out.println(msg);
        }
    }
    
    public static void main(String[] args) {
        testMeta();
    }
}
