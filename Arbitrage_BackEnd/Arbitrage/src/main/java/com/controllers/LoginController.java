package com.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dao.UsersDAO;
import com.pojo.Users;

@RestController
public class LoginController {
	
	@Autowired
	UsersDAO dao;

	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public List<Users> showShares() {

		return dao.findAllUsers();
	}
	
	@PostMapping("/Login")
	@CrossOrigin(origins = "http://localhost:4200")
	public Users checkLog(@RequestBody Users user) throws Exception {

		
		String tempusername=user.getUsername();
		String temppassword=user.getPassword();
	    Users userobj=null;
	    
		if(tempusername!=null && temppassword!=null)
		{
			userobj= (Users) dao.checkLogin(tempusername, temppassword);
		}
		if(userobj==null)
		{
			throw new Exception("Check username or password");
		}
		return userobj;
	}
	
	
 
}
