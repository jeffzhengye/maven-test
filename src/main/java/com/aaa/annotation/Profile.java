package com.aaa.annotation;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * AOP annotation which causes the performance of the annotated method to be
 * logged.
 * 
 * @author Tavian Barnes (tavianator@maluuba.com)
 * @author Justin Harris (justin@maluuba.com)
 * @version 1.6
 * @since 1.0
 */
@Target({ METHOD })
@Retention(RUNTIME)
public @interface Profile {
    /**
     * The verbose threshold for the method. Running times faster than this will
     * not be logged at all.
     * 
     * <p>
     * Default: 10ms.
     * </p>
     */
    long verboseMillis() default 1;

    /**
     * The slow threshold for the method. Running times slower than this will be
     * logged at an elevated level.
     * 
     * <p>
     * Default: 100ms.
     * </p>
     */
    long slowMillis() default 10;

    /**
     * The number of calls after which to give verbose method statistics.
     * Statistics will be printed to standard output to allow profiling
     * regardless of the log level. Statistics will be shown on application
     * shutdown using {@link Runtime#addShutdownHook(Thread)}.
     * 
     * <p>
     * Store this value in a constant in your module and share that constant
     * with other methods so that you can easily disable it for all methods by
     * setting it to <code>-1</code>.
     * </p>
     * 
     * <p>
     * Default: off.
     * </p>
     * 
     * @since 1.6
     */
    long statsLogFrequency() default -1;
}

