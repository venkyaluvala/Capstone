package com.captsone.cloths.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.captsone.cloths.entity.Admin;
import com.captsone.cloths.entity.User;
import com.captsone.cloths.service.AdminserviceInteface;
import com.captsone.cloths.service.UserserviceInteface;

@RestController
public class AdminController {
	
	@Autowired
	AdminserviceInteface as;
	
	@PostMapping("SingUp")
	public String creatAccount(@RequestBody  Admin a) {
		int i = as.creataccount(a);
		if(i >0) {
			return "account created succsefully";
		}
		else {
			return "failed to create account";
		}
	}
	
	@GetMapping("loginUser/{email}/{password}")
	public String login(@PathVariable("email") String em,@PathVariable("password") String pwd) {
		Admin a=new Admin();
		a.setEmail(em);
		a.setPassword(pwd);
		
		int i=as.loginService(a);
		if(i>0) {
			return "login successfully";
		}
		else {
			return "login fail";
		}
	}
/*	@Autowired
	UserserviceInteface us;
	
	@GetMapping("getUserDatails/{id}"){
		public User getUserdetails() { 
			User u = us.getdetails();
		}
	}
	
	*/
	

}
