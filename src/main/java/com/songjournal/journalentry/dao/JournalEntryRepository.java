package com.songjournal.journalentry.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.songjournal.journalentry.entity.JournalEntry;

public interface JournalEntryRepository extends JpaRepository<JournalEntry, Integer> {

	public List<JournalEntry> findAllByOrderByIDDesc();

}
