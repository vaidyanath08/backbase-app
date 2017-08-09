/**
 * 
 */
package com.backbase.controller.Impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import com.backbase.controller.ResultController;

/**
 * @author Vaidyanath Rajpoot
 * class : ResultControllerImpl  
 * method : result - returns the model for the result view .
 *
 */
@Controller
public class ResultControllerImpl implements ResultController{
	@Override
	
	
	public ModelAndView result() {
		ModelAndView model = new ModelAndView("result");
		return model;
	}

}
