package com.example.demo;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.example.demo.terytapi.TerytApiClient;


@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	
	@Autowired
	private TerytApiClient a;

	public static void main(String[] args) throws MalformedURLException, URISyntaxException {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		a.search("Koszalin");
		
	}
}
