package com.songjournal.journalentry.model;

/**
 * Each JournalEntry contains a single entry tied to a users journal
 * Each journal can have many entries but every entry is tied to only one journal and by extension, one user
 * 
 */
public class JournalEntry {
	
	/**
	 * The unique identifier of each individual entry
	 */
	private int ID;
	
	/**
	 * the ID of the journal the entry is a part of
	 */
	private int journalID;
	
	/**
	 * the song, or list of songs, tied to the entry
	 */
	private String[] songList;
	
	/**
	 * The comment associated with the entry
	 */
	private String comment;
	
	/**
	 * the date and time the entry was added
	 */
	private String DateTime;
	
	public JournalEntry() {
		
	}
	
	public JournalEntry(int id, int journalID, String[] songList, String comment, String dateTime) {
		ID = id;
		this.journalID = journalID;
		this.songList = songList;
		this.comment = comment;
		DateTime = dateTime;
	}

	/**
	 * Getters and Setters
	 */
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getJournalID() {
		return journalID;
	}

	public void setJournalID(int journalID) {
		this.journalID = journalID;
	}

	public String[] getSongList() {
		return songList;
	}

	public void setSongList(String[] songList) {
		this.songList = songList;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getDateTime() {
		return DateTime;
	}

	public void setDateTime(String dateTime) {
		DateTime = dateTime;
	}
	
	

}
