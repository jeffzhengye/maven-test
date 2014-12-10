package com.aaa.log;

//import java.util.logging.Logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloLog {
    static Logger LOGGER = LoggerFactory.getLogger(HelloLog.class);
    public static void main(String[] args) {
        String property = System.getProperty("java.util.logging.config.file", "not set");
        System.out.println(property);
        
        java.util.logging.Logger log = java.util.logging.Logger.getLogger("MyClass");
        for (int i = 0; i < 10; i++)
            if (i % 2 == 0)
                LOGGER.info("Hello {}", i);
            else
                LOGGER.debug("I am on index {}", i);
        LOGGER.error("why no output?");
        log.info("can i");
    }
}
