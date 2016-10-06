package com.revature.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.revature.data.BusinessDelegate;

@Controller
public class BaseController {
private BusinessDelegate businessDelegate;
	
	/**
	 * Getters and Setters
	 * @return
	 */
	public BusinessDelegate getBusinessDelegate() {
		return businessDelegate;
	}

	public void setBusinessDelegate(BusinessDelegate businessDelegate) {
		this.businessDelegate = businessDelegate;
	}
	
	/**
	 * Mappings
	 * @return
	 */

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home(){
		
		return "index";
	}
	
	// index page
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String indexPage(HttpServletRequest req){
		
		return "index";
	}
	
	//main page
	@RequestMapping(value="/main", method=RequestMethod.GET)
	public String mainPage(HttpServletRequest req){
	
		return "redirect:/pages/main.html";
	}
	
	//newSettings
	@RequestMapping(value="/newSettings", method=RequestMethod.GET)
	public String newSettingsPage(HttpServletRequest req){
		
		return "redirect:/pages/newSettings.html";
	}
	
}
