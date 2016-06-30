package com.test.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.client.RestTemplate;

import com.test.google.jaxb.GeoCodeResponse;
import com.test.restclient.IPDetails;
import com.test.restclient.StudentDTO;

public class SpringRestClientApp {
	
	public static void main(String s[]){
		//Spring Container
		ApplicationContext springContainer = new ClassPathXmlApplicationContext("restContext.xml");
				
		RestTemplate restTemplate = springContainer.getBean(RestTemplate.class);
		
		//External Client
		//IPDetails ipDetails = restTemplate.getForObject("http://freegeoip.net/json/", IPDetails.class);

		//System.out.println(" Respons ::: " + ipDetails);
		
		//GeoCodeResponse response = restTemplate.getForObject("https://maps.googleapis.com/maps/api/geocode/json?address=1600+Amphitheatre+Parkway,+Mountain+View,+CA", GeoCodeResponse.class);
		
		//System.out.println(response);
		
		StudentDTO stuDTO = restTemplate.getForObject("http://localhost:8080/springdemo/mvc/student/{sno}/", StudentDTO.class,808);
		
		System.out.println(stuDTO);
		
		/*//Student student = restTemplate.getForObject("http://localhost:8080/WebAppProject/mvc/student/{sno}", Student.class,102);
				
		//System.out.println(student);
		
		IPDetails ipDetails = restTemplate.getForObject("http://freegeoip.net/json/", IPDetails.class);
		
		System.out.println(ipDetails);*/
		
	}
	
}
