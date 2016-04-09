package com.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import static com.login.constants.RequestMappings.LOAD_REG_CONTROLLER;
import static com.login.constants.Views.LOAD_REG_CONTROLLER_SUCCESS;

@Controller
public class LoadRegistrationController {
	
	@RequestMapping(LOAD_REG_CONTROLLER)
	public String loadRegistrationController() {
		return LOAD_REG_CONTROLLER_SUCCESS;
	}

}
