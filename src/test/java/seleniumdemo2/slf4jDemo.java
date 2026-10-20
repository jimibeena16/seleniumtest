package seleniumdemo2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class slf4jDemo {

    private static final Logger logger = LoggerFactory.getLogger(slf4jDemo.class);

    public static void main(String[] args) {

        logger.info("Browser launched");

        logger.info("Opening login page");

        logger.warn("This is a warning message");

        logger.error("This is an error message");
    }
    }