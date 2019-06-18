package mum.edu;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@PropertySource("classpath:config.properties")
@ConfigurationProperties
public class ConfigProperties {
     
    private String hostReference;
    private String hostJobApp;
    private int portServiceReference;
    private int portServiceJobApp;
	public String getHostReference() {
		return hostReference;
	}
	public void setHostReference(String hostReference) {
		this.hostReference = hostReference;
	}
	public String getHostJobApp() {
		return hostJobApp;
	}
	public void setHostJobApp(String hostJobApp) {
		this.hostJobApp = hostJobApp;
	}
	public int getPortServiceReference() {
		return portServiceReference;
	}
	public void setPortServiceReference(int portServiceReference) {
		this.portServiceReference = portServiceReference;
	}
	public int getPortServiceJobApp() {
		return portServiceJobApp;
	}
	public void setPortServiceJobApp(int portServiceJobApp) {
		this.portServiceJobApp = portServiceJobApp;
	}
    
    
   
}