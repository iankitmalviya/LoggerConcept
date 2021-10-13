package com.facebook;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.spi.LoggingEvent;

@RestController
public class LoggerController {
	int id;
	Logger logger=LoggerFactory.getLogger(LoggerController.class);
	@RequestMapping("/")
	public void welcome() {
logger.error("Hey in looger error "+new Insaan());	
logger.info("hey put here ****** {}",new Insaan());

	}
	
}
