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

	@Override
	public List<JournalEntry> findAll() {
		// TODO Auto-generated method stub
		return journalEntryRepository.findAllByOrderByIDDesc();
	}

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

	@Override
	public void save(JournalEntry theJournalEntry) {
		journalEntryRepository.save(theJournalEntry);

	}

	@Override
	public void deleteById(int theId) {
		journalEntryRepository.deleteById(theId);
	}

}
