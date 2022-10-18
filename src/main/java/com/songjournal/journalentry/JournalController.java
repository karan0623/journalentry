package com.songjournal.journalentry;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/journal")
public class JournalController {
	
	//Mapping for "sign-in"
	@GetMapping("/sign-in")
	public String signIn() {		
		return "sign-in";
		
	}
	//Mapping for "home"
		@GetMapping("/home")
		public String home() {	
			return "home";
			
		}
	
	//Mapping for "about"
		@GetMapping("/about")
		public String about() {		
			return "about";
				
		}

}
