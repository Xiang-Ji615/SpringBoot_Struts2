package main.java.spring.boot.tst.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="Web")
public class WebController {

	@RequestMapping(value="Index", method=RequestMethod.GET)
	public String Index(ModelMap map){
		return "Index";
	}
}
