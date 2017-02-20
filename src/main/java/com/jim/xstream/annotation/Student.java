package com.jim.xstream.annotation;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jim on 2017/2/20.
 * This class is ...
 */
@XStreamAlias("student")
public class Student {
	@XStreamAlias("name")
	@XStreamAsAttribute
	private String studentName;

	public Student(String name) {
		this.studentName = name;
	}

	public void addNote(Note note){
		noteList.add(note);
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public List<Note> getNoteList() {
		return noteList;
	}

	public void setNoteList(List<Note> noteList) {
		this.noteList = noteList;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	@XStreamImplicit
	private List<Note> noteList = new ArrayList<Note>();

	@XStreamOmitField
	private int type;
}
