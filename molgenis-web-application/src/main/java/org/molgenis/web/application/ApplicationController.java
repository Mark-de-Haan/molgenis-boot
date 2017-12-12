package org.molgenis.web.application;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.molgenis.web.application.ApplicationController.APPLICATION_CONTROLLER_URI;

@Controller
@RequestMapping(APPLICATION_CONTROLLER_URI)
public class ApplicationController
{
	public static final String APPLICATION_CONTROLLER_URI = "/";

	@GetMapping("/**")
	public String initApplication(Model model)
	{
		model.addAttribute("application_title", "MOLGENIS - Boot");
		return "view-application";
	}
}
