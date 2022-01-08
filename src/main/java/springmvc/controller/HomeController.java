package springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
public class HomeController {

	//@RequestMapping("/")
	@RequestMapping(value ="/",method = RequestMethod.GET)
	public String home() {
		System.out.println("This is Home Url");
		return "index";
	}
//	@RequestMapping("/home1")
//	public String about() {
//		System.out.println("This is Home Url");
//		return "about";
//	}
}
