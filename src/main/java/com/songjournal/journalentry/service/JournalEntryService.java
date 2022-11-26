package com.songjournal.journalentry.service;

import java.util.List;

import com.songjournal.journalentry.entity.JournalEntry;

public interface JournalEntryService {
	
	public List<JournalEntry> findAll();
	
	public JournalEntry findById(int theId);
	
	public void save(JournalEntry theJournalEntry);
	
	public void deleteById(int theId);
}
