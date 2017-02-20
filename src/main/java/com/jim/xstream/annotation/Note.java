package com.jim.xstream.annotation;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Created by jim on 2017/2/20.
 * This class is ...
 */
@XStreamAlias("note")
public class Note {
	private String title;
	private String description;

	public Note(String title, String description){
		this.title = title;
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
