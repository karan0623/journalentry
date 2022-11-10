package com.songjournal.journalentry.entity;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Each JournalEntry contains a single entry tied to a users journal
 * Each journal can have many entries but every entry is tied to only one journal and by extension, one user
 * 
 */
@Entity
@Table(name="journalentries")
public class JournalEntry {
	
	/**
	 * The unique identifier of each individual entry
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="ID")
	private int ID;
	
	/**
	 * the ID of the journal the entry is a part of
	 */
	
	@Column(name="journal_id")
	private int journalID;
	
	/**
	 * the song, or list of songs, tied to the entry
	 */
	@Column(name="song_list")
	private String[] songList;
	
	/**
	 * The comment associated with the entry
	 */
	@Column(name="comment")
	private String comment;
	
	/**
	 * the date and time the entry was added
	 */
	@Column(name="date_time")
	private String DateTime;
	
	public JournalEntry() {
		
	}
	
	public JournalEntry(int id, int journalID, String[] songList, String comment, String dateTime) {
		//super();
		this.ID = id;
		this.journalID = journalID;
		this.songList = songList;
		this.comment = comment;
		this.DateTime = dateTime;
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

	@Override
	public String toString() {
		return "JournalEntry [ID=" + ID + ", journalID=" + journalID + ", songList=" + Arrays.toString(songList)
				+ ", comment=" + comment + ", DateTime=" + DateTime + ", getID()=" + getID() + ", getJournalID()="
				+ getJournalID() + ", getSongList()=" + Arrays.toString(getSongList()) + ", getComment()="
				+ getComment() + ", getDateTime()=" + getDateTime() + "]";
	}

	


	
	
	
	
	

}
