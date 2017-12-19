package com.visiant.server.monitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class ServerMonitorApplication  {
//
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(ServerMonitorApplication.class);
//	}

	public static void main(String[] args) {
		SpringApplication.run(ServerMonitorApplication.class, args);
	}
}
