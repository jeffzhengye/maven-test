package com.aaa.mtest;

import static com.google.common.base.Preconditions.*;

import org.apache.commons.lang3.StringUtils;
import static java.lang.System.out;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        checkState(true, "good");
        System.out.println( "Hello World!" );
        out.println(StringUtils.join(new String[]{"k", "j", "p"}, ","));
    }
}
