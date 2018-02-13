package edu.northeastern.cs5200.controllers.hello;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloObjectController{ 
	


@RequestMapping("/object")
public HelloObject sayHelloObject() {
	return new HelloObject("You have created object prajacta");
}
}
