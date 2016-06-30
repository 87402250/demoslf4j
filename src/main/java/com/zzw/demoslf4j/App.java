package com.zzw.demoslf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
	private final static Logger LOGGER = LoggerFactory.getLogger(App.class);
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        LOGGER.trace(">>>>>>>>>>>>>>>>>>>>>> {}" , "track log");
        LOGGER.debug(">>>>>>>>>>>>>>>>>>>>>> {}" , "debug log");
        LOGGER.info(">>>>>>>>>>>>>>>>>>>>>> {}" , "info log");
        LOGGER.warn(">>>>>>>>>>>>>>>>>>>>>> {}" , "warn log");
        LOGGER.error(">>>>>>>>>>>>>>>>>>>>>> {}",  "error log");
    }
}
