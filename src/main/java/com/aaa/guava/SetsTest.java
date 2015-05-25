/**
 * 
 */
package com.aaa.guava;

import java.util.Set;

import lombok.extern.slf4j.Slf4j;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Multiset;
import com.google.common.collect.Sets;


/**
 * @author Jeff Ye
 *
 */
@Slf4j
public class SetsTest {

    public static void testSetOperation(){
        Set<String> animals = ImmutableSet.of("gerbil", "hamster");
        Set<String> fruits = ImmutableSet.of("apple", "orange", "banana");
        Set<String> diff = Sets.difference(animals, fruits);
        log.info(diff.toString());
    }
    
    public static void multiSet() {
        Multiset<String> bigramCounts = HashMultiset.create();
        bigramCounts.add("ye");bigramCounts.add("ye");
        bigramCounts.add("ge"); bigramCounts.add("zde");
        for(String s : bigramCounts) {
            System.out.println(s);
        }
    }
    
    /**
     * @param args
     */
    public static void main(String[] args) {
//        testSetOperation();
//        multiSet();
        System.out.printf("shit%.2f%%\n", 1.2f);
        System.out.println(String.format("shit%.2f%%", 1.2f));
        double percent = 34.8;
        System.out.println(String.format("\t%.2f%%", percent));
    }

}
