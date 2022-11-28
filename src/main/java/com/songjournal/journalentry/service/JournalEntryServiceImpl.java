package com.songjournal.journalentry.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.songjournal.journalentry.dao.JournalEntryRepository;
import com.songjournal.journalentry.entity.JournalEntry;

@Service
public class JournalEntryServiceImpl implements JournalEntryService {

	private JournalEntryRepository journalEntryRepository;

	@Autowired
	public JournalEntryServiceImpl(JournalEntryRepository theJournalEntryRepository) {
		journalEntryRepository = theJournalEntryRepository;
	}
	
	//This method finds all journal entries and orders them by Id Descending
	@Override
	public List<JournalEntry> findAll() {
		return journalEntryRepository.findAllByOrderByIDDesc();
	}

	//This method is used to find journal entries using their Id.
	@Override
	public JournalEntry findById(int theId) {

		Optional<JournalEntry> journalEntryId = journalEntryRepository.findById(theId);

		JournalEntry theJournalEntry = null;
		if (journalEntryId.isPresent()) {
			theJournalEntry = journalEntryId.get();
		} else {
			// Journal Entry Not Found
			throw new RuntimeException("The JounrnalEntryId you've entered is invalid - " + theId);
		}
		return theJournalEntry;
	}
	
	//This method handles the saving of journal entries
	@Override
	public void save(JournalEntry theJournalEntry) {
		journalEntryRepository.save(theJournalEntry);

	}

	//This method handles the deleting of journal entries.
	@Override
	public void deleteById(int theId) {
		journalEntryRepository.deleteById(theId);
	}

}
