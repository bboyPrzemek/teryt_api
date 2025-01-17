package com.example.demo.terytapi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.soap.security.wss4j2.Wss4jSecurityInterceptor;

@Configuration
public class TerytApiConfig {

	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.example.demo.wsdl");
		return marshaller;
	}

	@Bean
	public TerytApiClient countryClient(Jaxb2Marshaller marshaller) {
		TerytApiClient client = new TerytApiClient();
		client.setDefaultUri("https://uslugaterytws1test.stat.gov.pl/TerytWs1.svc");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		ClientInterceptor[] interceptors = new ClientInterceptor[] { securityInterceptor() };
		client.setInterceptors(interceptors);
		return client;
	}
	
	@Bean
	public Wss4jSecurityInterceptor securityInterceptor() {
		Wss4jSecurityInterceptor wss4jSecurityInterceptor = new Wss4jSecurityInterceptor();
		wss4jSecurityInterceptor.setSecurementActions("UsernameToken");
		wss4jSecurityInterceptor.setSecurementMustUnderstand(true);
		wss4jSecurityInterceptor.setSecurementPasswordType("PasswordText");
		wss4jSecurityInterceptor.setSecurementUsername("TestPubliczny");
		wss4jSecurityInterceptor.setSecurementPassword("1234abcd");
		return wss4jSecurityInterceptor;
	}
}
