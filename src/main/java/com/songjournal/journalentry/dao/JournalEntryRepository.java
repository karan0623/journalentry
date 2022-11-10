package com.songjournal.journalentry.dao;

import org.springframework.data.repository.CrudRepository;

import com.songjournal.journalentry.entity.JournalEntry;

public interface JournalEntryRepository extends CrudRepository<JournalEntry, Integer> {

}
