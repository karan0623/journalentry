package com.songjournal.journalentry.entity;

/**
 * The UserData class contains all the necessary information about an individual user
 * Each user is tied to only one journal
 */
public class UserData {
	
	/**
	 * The unique identifier of the user
	 */
	private int ID;
	
	/**
	 * the spotify ID of the user
	 */
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
