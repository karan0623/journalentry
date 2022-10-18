# Song Journal
---
Design Document

Members: Karan Patel, Alexander Robinson, Anthony (Tony) Gentile, Colin Maxwell

---

## Introduction 

Our application has the following functionalities:   

-	Log into Spotify.
-	Create a journal entry
-	Edit a journal entry
-	Delete a journal entry
-	View previous journal entries


Use this application to keep track of your top listened to tracks, how you felt about them, and why you’re listening.
---

## Storyboard
 
 ![image](https://user-images.githubusercontent.com/64561330/196547283-e21121dc-61d4-4925-83ab-beac5a0d9923.png)

 ![image](https://user-images.githubusercontent.com/64561330/196547315-77a40371-96c8-4321-8e5d-0427387e3e0f.png)

 ![image](https://user-images.githubusercontent.com/64561330/196547328-50f2534b-bd38-478d-bf0a-70f40c8822ad.png)



## Functional Requirements

*	As a user
*	I want to log into Spotify
*	So that I can access my listened to songs
    *  Given that I have a Spotify account
    *  When I fill in my login info
    *	Then I get logged into my account

*	As a user
*	I want to create a new journal entry
*	So that I can record new entries on my songs
    *	Given I’ve logged into my account
    *	When I hit the create new entry button
    *	Then I should be able to view my top listened to tracks and be able to record an entry
        *	Given I’ve hit the create new entry button
        *	When I enter my journal info and hit save
        *	Then my record should be saved to the database
        *	Given I’ve hit the create new entry button
        *	When I enter my journal info and hit cancel
        *	Then my record should NOT saved to the database

*	As a user
*	I want to edit a journal entry
*	So that I can add on to/fix old entries 
    *	Given I’ve logged into my account, and a previous entry exists
    *	When I hit the edit button
    *	Then I should be able to make changes to a previously made entry
        *	Given I’ve hit the edit button
        *	When I make edits and hit save
        *	Then my journal entry should be updated in the database
        *	Given I’ve hit the edit button
        *	When I make edits and hit cancel
        *	Then my journal entry should not be updated

*	As a user
*	I want to delete a journal entry
*	So that I can remove old entries
    *	Given I’ve logged into my account, and a previous entry exists
    *	When I hit the delete entry button
    *	Then a confirmation box should appear to confirm if I really want to delete the entry
        *	Given I’ve already hit the delete button
        *	When I confirm the delete confirmation box
        *	Then the journal entry should be removed from the database
        *	Given I’ve already hit the delete button
        *	When I cancel the delete confirmation box
        *	Then my journal entry should NOT be deleted



*	As a user
*	I want to view previous journal entries
*	So that I can look at old journal entries
    *	Given I’ve logged into my account, and no previous entry exists
    *	When I scroll through the home page
    *	I should see a notification that no journal entries exist, and be prompted to make a new one
    *	Given I’ve logged into my account, and a previous entry exists
    *	When I scroll through the home page
    *	Then I should see a list of previously made entries

## Class Diagram
![image](https://user-images.githubusercontent.com/64561330/196547380-205a30ba-d2d1-45f4-99e6-276f4f242594.png)

 
## Class Diagram Description


**JournalScreen:** This will have the user's journal, and an option to add entries, edit entries, and delete entries.

**AddAJournalEntry:**  This gives the user access to add an entry.

**AddAUser:**  This is where users are prompted to link/login to a Spotify account.

**Journal:** Noun class that represents a Journal.

**JournalEntry:** Noun class that represents a JournalEntry.

**UserData:**  Noun class that represents a user's data.

**IJournalDAO:** This DAO interface will use the JournalDAO class and it will have queries which carry out SQL functions like UPDATE, DELETE, INSERT, and GET.

**IJournalEntryDAO:** This DAO interface will use JournalEntryDAO to manipulate “JournalEntry” class data.

**IUserDataDAO:** This DAO interface will use UserDataDAO to manipulate “UserData” class data.

## Scrum Roles

- Product Owner/Scrum master: Karan Patel  
- DevOps: Anthony (Tony) Gentile
- Integration Developer: Colin Maxwell 
- UI Specialist:  Alexander Robinson

## Product Backlog
https://github.com/users/karan0623/projects/1/views/1

## Sprint Backlog
Sprint Backlog (github.com)

## Weekly Meeting

Tuesdays/Thursdays 3:30 pm. Additional meetings, and changes as necessary.

Meeting Information
The team will meet on Microsoft Teams

## GitHub Link
https://github.com/karan0623/journalentry

