package com.zzw.demoslf4j;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Demotest {

	Logger LOGGER = LoggerFactory.getLogger(Demotest.class);
	@Test
	public void testddddddddddd(){
		 LOGGER.debug(">>>>>>>>>>>>>>>>>>>>>> {}" , "debug 1 log");
         LOGGER.info(">>>>>>>>>>>>>>>>>>>>>> {}" , "info 1 log");
         LOGGER.warn(">>>>>>>>>>>>>>>>>>>>>> {}" , "warn 1 log");
         LOGGER.error(">>>>>>>>>>>>>>>>>>>>>> {}",  "error 1 log");
	}
}
