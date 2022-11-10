package com.songjournal.journalentry.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.songjournal.journalentry.dao.JournalEntryRepository;
import com.songjournal.journalentry.entity.JournalEntry;



@Service
public class JournalEntryServiceImpl implements JournalEntryService {

	
	private JournalEntryRepository journalEntryRepository;
	
	@Autowired
	public JournalEntryServiceImpl(JournalEntryRepository theJournalEntryRepository){
		journalEntryRepository = theJournalEntryRepository;
	}
	
	@Override
	public List<JournalEntry> findAll() {
		// TODO Auto-generated method stub
		return journalEntryRepository.findAll();
	}

	@Override
	public JournalEntry findById(int theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(JournalEntry theJournalEntry) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub

	}

}
