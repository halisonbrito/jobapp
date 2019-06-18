package mum.edu;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@PropertySource("classpath:config.properties")
@ConfigurationProperties
public class ConfigProperties {
     
    private String hostName;
    private int portServiceReferencia;
    private int portServiceJobApp;
	public String getHostName() {
		return hostName;
	}
	public void setHostName(String hostName) {
		this.hostName = hostName;
	}
	public int getPortServiceReferencia() {
		return portServiceReferencia;
	}
	public void setPortServiceReferencia(int portServiceReferencia) {
		this.portServiceReferencia = portServiceReferencia;
	}
	public int getPortServiceJobApp() {
		return portServiceJobApp;
	}
	public void setPortServiceJobApp(int portServiceJobApp) {
		this.portServiceJobApp = portServiceJobApp;
	}
    
}