package io.javapro.starter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Spring mvc annotation //This class will have methods that map to URL
public class HelloController {
	
	@RequestMapping("/hello") //When there is a request with this url, this method will be executed
	public String sayHi(){
		return "Hi!!";
	}
	
}
