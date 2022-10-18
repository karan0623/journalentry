package com.songjournal.journalentry.model;

public class Journal {
	
	private int ID;
	private String[] entryList;
	private int userID;
	
	public Journal() {
		
	}
	
	public Journal(int iD, String[] entryList, int userID) {
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
	public String[] getEntryList() {
		return entryList;
	}
	public void setEntryList(String[] entryList) {
		this.entryList = entryList;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	
	
	
	
	
	
}
