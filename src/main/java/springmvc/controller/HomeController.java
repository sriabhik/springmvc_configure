package springmvc.controller;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller

public class HomeController {
	
	@RequestMapping(value ="/", method = RequestMethod.GET)
	
	
	public String home(Model model) {//take Mode
		
		//model
		model.addAttribute("name","Abhishek Srivastava");
		model.addAttribute("Id",132);
		//adding collection
		List<String> friend = new ArrayList<String>();
		friend.add("Yuvraj");
		friend.add("pawan");
		model.addAttribute("list", friend);
		
		System.out.println("This is Home Url ::");
		return "index";
	}
	@RequestMapping("/about")
	public String about() {
		System.out.println("This is about Url ::");
		return "about";
	}
	
	
	//use of model and view
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is Help Url ::");
		ModelAndView mav = new ModelAndView();
		mav.addObject("name", "Ram ji");
		mav.addObject("Id", 132);
		LocalDateTime now =  LocalDateTime.now();
		mav.addObject("time",now);
		
		//friend
		List<String> friend = new ArrayList<String>();
		friend.add("Yuvraj");
		friend.add("pawan");
		friend.add("Peince");
		friend.add("Amit");
		mav.addObject("friend1",friend);
		
		mav.setViewName("help");//setting the view name
		return  mav;
		
	}
}
