package com.songjournal.journalentry;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.songjournal.journalentry.entity.JournalEntry;
import com.songjournal.journalentry.service.JournalEntryService;

@Controller
@RequestMapping("/journal")
public class JournalController {
	
public JournalEntryService journalEntryService;
	
	public JournalController(JournalEntryService theJournalEntryService) {
		journalEntryService = theJournalEntryService;
	}
	
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
		
		@PostMapping("/save")
		public String saveFaculty(@ModelAttribute("journalEntry") JournalEntry theJournalEntry) {
			//Register the Faculty
			journalEntryService.save(theJournalEntry);
			
			//Block duplicates submission for accidental refresh
			return"redirect:/journal/home";
		}

}
