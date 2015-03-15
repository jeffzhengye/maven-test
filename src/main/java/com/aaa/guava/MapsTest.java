package com.aaa.guava;

import lombok.extern.slf4j.Slf4j;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;

@Slf4j
public class MapsTest {
    public static void testMaps(){
        Multimap<String, String> map = HashMultimap.create();
        map.put("1", "1");map.put("1", "1");
        map.put("1", "2");map.put("2", "1");
        log.info(map.toString() + ":" + map.size());
        
        ImmutableMultimap.Builder<String, String> builder = ImmutableMultimap.<String, String> builder();
        builder.put("1", "1");builder.put("1", "1");
        builder.put("1", "2");builder.put("2", "1");
        map = builder.build();
        log.info(map.toString() + ":" + map.size());
    }
    
    public static void main(String[] args) {
        testMaps();
    }
}
