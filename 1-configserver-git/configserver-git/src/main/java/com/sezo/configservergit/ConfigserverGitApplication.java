package com.sezo.configservergit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigserverGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigserverGitApplication.class, args);
	}

}
