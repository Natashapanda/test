package com.hrms.utility;

import org.apache.log4j.Logger;

public class Log {
	//initialize log4j logs
	private static Logger Log = Logger.getLogger(Log.class.getName());
	//need to create these methods,so that the can be called
	public static void info(String message) {
		Log.info(message);
	}

}
