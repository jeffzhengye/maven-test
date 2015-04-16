/**
 * 
 */
package com.aaa.collections;

import java.util.List;

import com.google.common.collect.Lists;

/**
 * @author Jeff Ye
 *
 */
public class CollectionExamples {

    public static void testIterateAdd() {
        List<String> mylist = Lists.newArrayList("this", "is", "not", "right");
        for (String s : mylist) {
            if(s.equals("is")){
                mylist.remove(s);
            }
        }
        for (String s : mylist) {
            System.out.println(s);
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        testIterateAdd();
    }

}
