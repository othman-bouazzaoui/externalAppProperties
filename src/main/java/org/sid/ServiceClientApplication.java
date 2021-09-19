package org.sid;

import org.sid.properties.MyPropertiesConfigure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServiceClientApplication {
	
//	@Value("${server.port}")
//	private int port;

	@Autowired
	private MyPropertiesConfigure myProer;
	
	public static void main(String[] args) {
		SpringApplication.run(ServiceClientApplication.class, args);
	}

	@Bean
	CommandLineRunner start() {
		return args ->{
			System.out.println("le Port tomcat : " + myProer.getServer().getPort());
			System.out.println("le proxy Server : " + myProer.getProxyServer());
		};
	}
}
