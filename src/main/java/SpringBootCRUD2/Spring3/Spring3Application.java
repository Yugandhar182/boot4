package SpringBootCRUD2.Spring3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Spring3Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring3Application.class, args);
	}
	
	 @RequestMapping("/") 
	 public String helloworld() 
	    { 
	        return "Hello World . Welocme"; 
	    } 
	 @RequestMapping("/hello") 
	 public String hello() 
	    { 
	        return "This is second page"; 
	    } 

}
