/**
 * 
 */
package com.aaa.oop;

import java.util.regex.Pattern;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Jeff Ye
 *
 */
@Slf4j
public class Inheritance {
    @Getter
    private Pattern differentOne = Pattern.compile(".*?(((最上面|首|前面|排头)[^0-9零一二三四五六七八九十].{0,2}[家个项选条])|头一个|前一个).*");
    @Getter
    private static final Pattern sameOne = Pattern
            .compile(".*?(((最上面|首|前面|排头)[^0-9零一二三四五六七八九十].{0,2}[家个项选条])|头一个|前一个).*");

    public Inheritance() {
    }

    static class InheritA extends Inheritance {
        public InheritA() {
            // TODO Auto-generated constructor stub
            super();
        }
    }

    static class InheritB extends Inheritance {

    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        InheritA a = new InheritA();
        InheritB b = new InheritB();
        log.info("different: " + (a.getDifferentOne() == b.getDifferentOne()));
        log.info("same: " + (a.getSameOne() == b.getSameOne()));

    }

}
