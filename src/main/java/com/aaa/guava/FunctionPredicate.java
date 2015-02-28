/**
 * 
 */
package com.aaa.guava;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import lombok.extern.slf4j.Slf4j;

import org.apache.commons.lang3.StringUtils;

import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

import static com.google.common.base.Functions.*;

import com.google.common.base.Joiner;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Ordering;
import com.google.common.collect.Sets;

/**
 * @author Jeff Ye
 *
 */

@Slf4j
public class FunctionPredicate {
    
    public static void testIterableCycle(){
        List<String> list = Lists.newArrayList("Justin", "Jessie", "jeff");
        int i =0;
        for(String a: Iterables.cycle(list)){
            if(i > 100) break;
            log.info(a);
            i++;
        }
    }


    public static void testListTrans() {
        List<String> list = Lists.newArrayList("Justin", "Jessie", "jeff");
        List<String> transList = Lists.transform(list, new Function<String, String>() {
            public String apply(String string) {
                return StringUtils.lowerCase(string);
            }
        });
        log.info(Joiner.on(" ").join(transList));
    }

    public static void testCompose() {
        Function<String, String> fa = new Function<String, String>() {
            public String apply(String string) {
                return StringUtils.lowerCase(string);
            }
        };
        Function<String, Integer> fb = new Function<String, Integer>() {
            public Integer apply(String string) {
                return StringUtils.length(string);
            }
        };
        Function<String, Integer> fc = Functions.compose(fb, fa);

        List<String> list = Lists.newArrayList("Justin", "Jessie", "jeff");
        List<Integer> transList = Lists.transform(list, fc);
        log.info(Joiner.on(" ").join(transList));
    }
    
    public static void testPredicateFilter() {
        Set<String> set = Sets.newHashSet("Jessie");
        Predicate<String> isInSet = Predicates.in(set); 

        List<String> list = Lists.newArrayList("Justin", "Jessie", "jeff");
        Iterable<String> transList = Iterables.filter(list, isInSet);
        log.info(Joiner.on(" ").join(transList));
        
        Predicate<String> allLowcase = new Predicate<String>() {
            public boolean apply(String input) {
                return StringUtils.isAllLowerCase(input);
            }
        };
        
        transList = Iterables.filter(list, allLowcase);
        log.info(Joiner.on(" ").join(transList));
    }

    /**
     * predicate 2 function
     */
    public static void testFilter() {
        Set<String> set = Sets.newHashSet("Jessie");
        Function<String, Boolean> fa = forPredicate(Predicates.in(set)); 

        List<String> list = Lists.newArrayList("Justin", "Jessie", "jeff");
        List<Boolean> transList = Lists.transform(list, fa);
        
        log.info(Joiner.on(" ").join(transList));
    }

    /**
     * throw errors when map is empty.
     */
    public static void testGetMax(){
        HashMap<String, Integer> map = Maps.newHashMap();
        log.info("max=" + Collections.max(map.values()));
        map.put("1", 5);
        Integer max = Ordering.<Integer>natural().max(map.values());
        log.info("max=" + max);
    }
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        testIterableCycle();
    }

}
