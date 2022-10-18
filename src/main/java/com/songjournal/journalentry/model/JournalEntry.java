package com.songjournal.journalentry.model;

public class JournalEntry {
	
	private int ID;
	private int journalID;
	private String[] songList;
	private String comment;
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
