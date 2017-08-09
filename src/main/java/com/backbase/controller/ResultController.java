/**
 * 
 */
package com.backbase.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Vaidyanath Rajpoot
 *
 */
public interface ResultController {
	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView result();
		
	}


