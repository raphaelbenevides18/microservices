package br.com.rlb.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.rlb.entity.Helloworld;


@RestController
public class HelloWorldController {
	
private final String template = "Hello, %s!";
	
	private AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/hello")
	public Helloworld hello(@RequestParam(value="name", defaultValue="world") String name) {
		return new Helloworld(counter.incrementAndGet(), String.format(template, name));
			
	}

}
