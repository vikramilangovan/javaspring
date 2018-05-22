package com.vgtech.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeWorldController {
	@RequestMapping("/welcome")
	public ModelAndView welcome() {
		ModelAndView mav = new ModelAndView("welcome");
		String message1 = "welcome";
		mav.addObject("welcome", message1);
		return mav;
	}
}
