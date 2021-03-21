package com.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class HelloWorld implements CommandLineRunner {

	@Autowired
	HelloService helloService;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(helloService.hello());
	}

	@Component
	public class HelloService {
		public String hello() {
			return "Hello world";
		}
	}

}
