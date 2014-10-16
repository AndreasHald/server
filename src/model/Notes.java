package model;

import java.sql.SQLException;

/*
 * 		Mangler:
 * 			- Identifikation p� brugeren der har lavet noten
 * 			- Hvem der skal kunne redigere noten
 * 			- Mulighed for at slette / redigere noter
 * 			- Active Status
 * 
 * 			ETA: 2 timer
 */

public class Notes extends Model {
	
	private int noteID;
	private String text;
	private String dateTime;
	private String createdBy;
	private String[] editors;
	
	public Notes(int noteID, String text, String dateTime) {
		super();
		this.noteID = noteID;
		this.text = text;
		this.dateTime = dateTime;
		
	}

	public int getNoteID() {
		return noteID;
	}

	public void setNoteID(int noteID) {
		this.noteID = noteID;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	
	public void saveNote () {
		
		
	}
	
	public void getNote () throws SQLException {
			
		sqlStatement = doQuery("SELECT * FROM notes");
	}
	

}
