package com.springmvc.controller1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class LoginController {

	@RequestMapping("/login.htm")
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {

		String uname = req.getParameter("userName");
		String pwd = req.getParameter("pwd");

		System.out.println("Username is : " + uname + ", and the Password is: " + pwd);
		
		ModelAndView view = new ModelAndView("home");
		
		 return view;
	}
}