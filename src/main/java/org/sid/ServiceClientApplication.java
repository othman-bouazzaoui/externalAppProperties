package org.sid;

import org.sid.properties.MyPropertiesConfigure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServiceClientApplication /*extends SpringBootServletInitializer*/{
	
//	@Value("${server.port}")
//	private int port;

	@Autowired
	private MyPropertiesConfigure myProer;
	
	public static void main(String[] args){
		//args =new String[] {"--spring.config.location=file:${user.home}/cloud-conf/serviceName.properties"};
		SpringApplication.run(ServiceClientApplication.class, args);
	}

	@Bean
	CommandLineRunner start() {
		return args ->{
			System.out.println("le Port tomcat : " + myProer.getServer().getPort());
			System.out.println("le proxy Server : " + myProer.getProxyServer());
		};
	}
	
	/*
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(ServiceClientApplication.class);
	}
	*/
}
