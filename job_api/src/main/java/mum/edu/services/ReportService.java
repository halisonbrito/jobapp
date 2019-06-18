package mum.edu.services;

import mum.edu.ConfigProperties;
import mum.edu.dto.Company;
import mum.edu.dto.Report;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ReportService {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private ConfigProperties config;

	private String getUrlServiceCompany() {
		return config.getHostJobApp()+":"+config.getPortServiceJobApp()+"/report";
	}
	
    public List<Report> getAll() {
		ResponseEntity<List<Report>> response =
				restTemplate.exchange(getUrlServiceCompany(), HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Report>>() {});
		
		return response.getBody();
    }
}
