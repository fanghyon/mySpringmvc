/*
 *
 * Copyright 2016 Eric Fang Corporation, all rights reserved.
 *
 */
package com.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @author: Eric Fang
 * 
 *          Jul 20, 2016
 * 
 */
@Controller
public class HelloControlor {

	public HelloControlor(){}

	@RequestMapping(value = "/login/{user}", method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView myMethod(HttpServletRequest request,
			HttpServletResponse response, @PathVariable("user") String user, ModelMap modelMap) throws Exception {
		modelMap.put("loginUser", user);
		return new ModelAndView("/hello", modelMap);
	}

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String registPost() {
		return "/welcome";
	}

}
