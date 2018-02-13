package edu.northeastern.cs5200.controllers.hello;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
	@Autowired

	 HelloRepository helloRepository;

	 

	 @RequestMapping("/api/hello/insert")

	 public HelloObject insertHelloObject() {

	  HelloObject obj = new HelloObject("Hello Prajacta Nagraj!!");

	  helloRepository.save(obj);

	  return obj;

	 }
	
	@RequestMapping("/hello")
	
	public String sayHello() {
		return "Hello Prajacta!";
	}


@RequestMapping("/hello/insert/{msg}")


public HelloObject insertMessage(@PathVariable("msg") String message) {

 HelloObject obj = new HelloObject(message);

 helloRepository.save(obj);

 return obj;

}
@RequestMapping("hello/select/all")

public List<HelloObject> selectAllHelloObjects() {

 List<HelloObject> hellos =

  (List<HelloObject>)helloRepository.findAll();

 return hellos;

}
}
