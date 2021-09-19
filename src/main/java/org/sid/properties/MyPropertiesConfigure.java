package org.sid.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
//@PropertySource({"classpath:app.properties","classpath:proxy.properties"})
//@PropertySource(value = {"file:app.properties","file:proxy.properties"})

//3 eme manière 
@PropertySources({
	    //Internal files application properties
		@PropertySource({"classpath:application.properties","classpath:app.properties","classpath:proxy.properties"}),
		
		//External files application properties in this example jar and config file in some folder if you want change this 
		//ex : file:c:/users/obouazzaoui/app.properties or file://${user.home}/obouazzaoui/folderx/xxx.properties
		@PropertySource(value = {"file:app.properties","file:proxy.properties"}, ignoreResourceNotFound = true)	
})
public class MyPropertiesConfigure {
	Server server;
	String ProxyServer;

	public String getProxyServer() {
		return ProxyServer;
	}


	public void setProxyServer(String proxyServer) {
		ProxyServer = proxyServer;
	}


	public Server getServer() {
		return server;
	}


	public void setServer(Server server) {
		this.server = server;
	}


	public static class Server{
		int port;

		public int getPort() {
			return port;
		}

		public void setPort(int port) {
			this.port = port;
		}
		
	}


}
