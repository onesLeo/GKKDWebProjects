package com.gkkdcenter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class FormJemaatController {

	 @RequestMapping(value="/form_data_ibadah", method = RequestMethod.GET)
	  public String showFormDataIbadah() {
	    return "gkkdcenter/form_data_ibadah";
	  }
	 
	 
}
