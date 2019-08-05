package com.example.demo;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by mac on 2018/6/1.
 */
public class logback {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void test() {

        logger.debug("print debug log.");
        logger.info("print info log.");
        logger.error("print error log.");
        Double d = 34.3;

        String s = new String("1") + new String("2");
        System.out.println(s.intern() == s);
    }
}
