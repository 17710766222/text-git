package com.longdhua.springboot;

import org.junit.jupiter.api.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBoot03LogApplicationTests {

    Logger logger = LoggerFactory.getLogger(getClass());
    @Test
    void contextLoads() {
        logger.trace("trace的日志信息");
        logger.debug("dubug的日志信息");
        logger.info("info的日志信息");
        logger.warn("warn的日志信息");
        logger.error("error的日志信息");
    }

}
