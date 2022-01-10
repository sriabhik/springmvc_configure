package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	@ModelAttribute
	public void commmonDataForModel(Model model) {
		model.addAttribute("Header","Registration Page");
		model.addAttribute("Desc","Coding");
		
	}
	
	@RequestMapping("/contact")
	public String showForm(Model model) {
		
//		showing header at contact page
//		model.addAttribute("Header","Registration Page");
//		model.addAttribute("Desc","Coding");
		System.out.println("contact");
	
		return "contact";
	}

	@RequestMapping(path="/processform",method = RequestMethod.POST)
	public String handleForm(@ModelAttribute("user") User user,Model model) {
		//this work same as all below new code
//			model.addAttribute("Header","Registration Page");
//			model.addAttribute("Desc","Coding");
				System.out.println(user);
				//process -> like adding to dbms
				//refeering userRegistartion refer video 14
				this.userService.createUser(user);
				return "success";
	}
}

//all before video 13 Requestparam
/*
 * @Controller public class ContactController {
 * 
 * @RequestMapping("/contact") public String showForm() {
 * System.out.println("contact"); return "contact"; }
 * 
 * @RequestMapping(path="/processform",method = RequestMethod.POST) public
 * String handleForm(
 * 
 * @RequestParam("email") String userEmail,
 * 
 * @RequestParam("userName") String userName,
 * 
 * @RequestParam("password") String userPassword,Model model) { // old method of
 * getting data // String email = request.getParameter("email"); //
 * System.out.println("User email is :"+email);
 * 
 * System.out.println("User Email 	  :: "+userEmail);
 * System.out.println("User Name 	  :: "+userName);
 * System.out.println("User Password :: "+userPassword);
 * 
 * User user = new User(); user.setEmail(userEmail); user.setUserName(userName);
 * user.setPassword(userPassword);
 * 
 * System.out.println(user); //process -> like adding to dbms
 * 
 * //previous one using model evertime // model.addAttribute("name", userName);
 * // model.addAttribute("email", userEmail); // model.addAttribute("password",
 * userPassword);
 * 
 * model.addAttribute("user", user);
 * 
 * return "success"; } }
 */
