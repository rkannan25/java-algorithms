package com.test.java;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App2 {
    private static Logger LOG = LogManager.getLogger(App2.class);
    public static void main( String[] args ) throws Exception {
        LOG.info("App2 is starting...");

        int i = 0;
        while (true) {
            LOG.info("integer value from app {} is {}", App2.class.getName(), i++);
            Thread.sleep(120);
        }
    }
}
