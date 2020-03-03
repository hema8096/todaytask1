package com.xworkz.loggers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.DispatcherServlet;

@Controller
@RequestMapping("/")
public class LoggersdemoControllers {
	//DispatcherServlet
	private static Logger logger =Logger.getLogger(LoggersdemoControllers.class);
	
	@PostMapping("/message.do")
	public String getMessage() {
		
		logger.info("inside message()... of " + this.getClass().getSimpleName());
		
		logger.trace("trace message --> inside getmessage()...");
		logger.debug("debug message --> inside getmessage()...");
		
		logger.warn("warn message --> inside getmessage()...");
		logger.error("error message --> inside getmessage()...");
		logger.fatal("fatal message --> inside getmessage()...");
		
		try {
			Integer.parseInt("3241hc43");
			
		}catch(NumberFormatException e) {
			
			logger.error("-->Exception occered");
			
		}
		
		System.out.println("inside getmessage().....");
		
		return "message.jsp";
		
	}
	

}
