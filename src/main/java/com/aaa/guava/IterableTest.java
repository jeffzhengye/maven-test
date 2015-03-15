package com.aaa.guava;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;

/**
 * 
 * @author Jeff Ye
 *
 */
@Slf4j
public class IterableTest {
    
    /**
     * a convertor
     * @param iterator
     * @return
     */
    public static <E> Iterable<E> iterable(final Iterator<E> iterator) {
        if (iterator == null) {
            throw new NullPointerException();
        }
        return new Iterable<E>() {
            public Iterator<E> iterator() {
                return iterator;
            }
        };
    }
    
    public static void testList2Iterable(){
        Integer foo[] = {1,2,3,4,5,6,7,8,9,0};

        List<Integer> list = Arrays.asList(foo);
        
        Iterable<Integer> iterable= Arrays.asList(foo);
        Iterable<Integer> filtered = Iterables.filter(iterable, Predicates.compose(Predicates.equalTo(100), new Function<Integer, Integer>() {
            public Integer apply(Integer input) {
                return input + 99;                
            }
            
        }));
        log.info(filtered.toString());
    }
    
    public static void testIterable2List(){
        Integer foo[] = {1,2,3,4,5,6,7,8,9,0};
        Iterable<Integer> iterable= Arrays.asList(foo);
        Integer fooback[] = Iterables.toArray(iterable, Integer.class);
        log.info(Joiner.on(" ").join(fooback));
    }
    
    public static void main(String[] args) {
        testIterable2List();
    }
}
