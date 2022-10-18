package com.songjournal.journalentry.model;

public class UserData {
	
	private int ID;
	private String spotifyID;
	
	public UserData() {
		
	}

	public UserData(int id, String SpotifyID) {
		ID = id;
		spotifyID = SpotifyID;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getSpotifyID() {
		return spotifyID;
	}

	public void setSpotifyID(String SpotifyID) {
		spotifyID = SpotifyID;
	}

}
