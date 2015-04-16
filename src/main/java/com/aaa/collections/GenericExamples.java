/**
 * 
 */
package com.aaa.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author Jeff Ye
 *
 */
public class GenericExamples {

    public static <E> ArrayList<E> newArrayList() {
        return new ArrayList<E>();
      }
    
   public static <E> Collection<E> search(List<E> list){
       Collection<E> newC = new ArrayList<E>();
       for(E e: list){
           newC.add(e);
       }
       return newC;
   }
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        List<Integer> ilist = new ArrayList<Integer>();
        ilist.add(1);
        Collection<Integer> ic = search(ilist);
        for(int i: ic){
            System.out.println("i: " + i);
        }
        System.out.println("size: " + ic.size());
    }

}
