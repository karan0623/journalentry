package com.songjournal.journalentry;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.songjournal.journalentry.entity.JournalEntry;
import com.songjournal.journalentry.service.JournalEntryService;

@Controller
@RequestMapping("/")
public class JournalController {

	public JournalEntryService journalEntryService;

	public JournalController(JournalEntryService theJournalEntryService) {
		journalEntryService = theJournalEntryService;
	}

	// Mapping for "sign-in"
	@GetMapping("/sign-in")
	public String signIn() {
		return "sign-in";

	}

	// Mapping for "home"
	@GetMapping("/home")
	public String home(Model theModel) {
		// Retrieve journal entries from the Database
		List<JournalEntry> journalEntries = journalEntryService.findAll();

		// Add journalEntries to the Spring Model
		theModel.addAttribute("journalEntries", journalEntries);
		return "home";
	}

	@GetMapping("/edit")
	public String edit(@RequestParam("ID") int theId, Model theModel) {
		// Retrieve journalEntry info from the service layer
		JournalEntry journalEntry = journalEntryService.findById(theId);

		// Prepopulate the form by setting journalEntry as a model attribute
		theModel.addAttribute("journalEntry", journalEntry);

		// redirect us to the edit/add form
		return "/edit";
	}

	@GetMapping("/add")
	public String add(Model theModel) {
		// Model attribute for data binding
		JournalEntry journalEntry = new JournalEntry();

		// Add journalEntry to the Spring Model
		theModel.addAttribute("journalEntry", journalEntry);
		return "/edit";
	}

	// Mapping for "about"
	@GetMapping("/about")
	public String about() {
		return "about";
	}

	@PostMapping("/save")
	public String saveJournalEntry(@ModelAttribute("journalEntry") JournalEntry theJournalEntry) {
		// Save the journalEntry
		journalEntryService.save(theJournalEntry);

		// Block duplicates submission for accidental refresh
		return "redirect:/home";
	}

	@GetMapping("/delete")
	public String deleteJournalEntry(@RequestParam("ID") int theId, Model theModel) {
		// Remove Journal
		journalEntryService.deleteById(theId);

		// Redirect back to home page
		return "redirect:/home";
	}

}
