/**
 * 
 */
package com.aaa.guava;

import java.util.Set;

import lombok.extern.slf4j.Slf4j;

import com.google.common.collect.ImmutableSet;
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
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        testSetOperation();
    }

}
