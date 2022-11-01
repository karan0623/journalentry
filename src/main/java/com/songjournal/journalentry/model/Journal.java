package com.songjournal.journalentry.model;

/**
 * Journal is the class used to hold all the information regarding an individual user's journal
 * Each user will have only 1 Journal and each Journal will have only one user
 * 
 *
 */

public class Journal {
	
	/**
	 * The unique identifier of the journal
	 */
	private int ID;
	
	/**
	 * The list of entries tied to the journal
	 */
	private String entryList;
	
	/**
	 * The ID of the user tied to the journal
	 */
	private int userID;
	
	public Journal() {
		
	}
	
	public Journal(int iD, String entryList, int userID) {
		ID = iD;
		this.entryList = entryList;
		this.userID = userID;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getEntryList() {
		return entryList;
	}
	public void setEntryList(String entryList) {
		this.entryList = entryList;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	
	
	
	
	
	
}
