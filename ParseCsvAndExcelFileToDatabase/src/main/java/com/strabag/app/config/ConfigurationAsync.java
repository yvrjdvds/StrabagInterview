package com.strabag.app.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import com.strabag.app.config.ConfigurationAsync;

@Configuration
public class ConfigurationAsync {

	
	Logger logger = LogManager.getLogger(ConfigurationAsync.class);

	@Bean
	public ThreadPoolTaskExecutor taskExecutor() {
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(2);
		executor.setMaxPoolSize(2);
		executor.setQueueCapacity(500);
		executor.setThreadNamePrefix("MyAsyncThread-");
		executor.setRejectedExecutionHandler(
				(r, executor1) -> logger.warn("Task rejected, thread pool is full and queue is also full"));
		executor.initialize();
		return executor;
	}

}
