package com.zzw.demoslf4j.demo1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import junit.framework.Test;

/**
 * Hello world!
 *
 */
public class App 
{
	private final static Logger LOGGER = LoggerFactory.getLogger(App.class);
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World! !!!!" );
        for(int i = 0 ;i<15000;i++){
        	testzzw(i);
        }
    }
    
    public static void testzzw(int i) {
    	  LOGGER.debug(">>>>>>>>>>>>>>>>>>>>>>debug {}" , i);
          LOGGER.info(">>>>>>>>>>>>>>>>>>>>>> info 1 log {}" , i);
          LOGGER.warn(">>>>>>>>>>>>>>>>>>>>>> warn {}" , i);
          LOGGER.error(">>>>>>>>>>>>>>>>>>>>>>  error 1 log {}",i);
	}
}
