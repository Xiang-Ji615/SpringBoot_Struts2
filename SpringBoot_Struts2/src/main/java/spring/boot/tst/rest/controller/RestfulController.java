package main.java.spring.boot.tst.rest.controller;

import java.util.Arrays;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="Rest")
public class RestfulController {

	@RequestMapping(value="Test", method=RequestMethod.GET)
	public Object test(){
		return Arrays.asList("tst1","tst2","tst3");
	}
}
