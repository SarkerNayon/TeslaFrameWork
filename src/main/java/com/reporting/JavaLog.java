package com.reporting;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.testng.Reporter;

public class JavaLog {
	static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	public static void log(String msg) {
		logger.log(Level.INFO, msg);
		Reporter.log(msg+"<br>");
	}

}
