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
	 * The ID of the user tied to the journal
	 */
	private int userID;
	
	public Journal() {
		
	}

	public Journal(int iD, int userID) {
		ID = iD;
		this.userID = userID;
	}
	
	/**
	 * Getters and Setters for ID and userID
	 */
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	
	
	
	
	
	
}
