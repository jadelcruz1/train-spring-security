package br.com.jardel.trainspringsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class TrainSpringSecurityApplication {
	//teste do jenkins...

	public static void main(String[] args) {
		SpringApplication.run(TrainSpringSecurityApplication.class, args);
	}

}

@RestController
class HttpController{
	@GetMapping("/public")
	String publicRoute(){
		return "<h1>  Public route, feel free to look around! </h1>";
	}

	@GetMapping("/private")
	String privateRoute(){
		return "<h1>  Private route, only authorized personal! </h1>";
	}

}


	

