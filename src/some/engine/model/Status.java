package some.engine.model;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Represents a status update (a link, a status message) in Facebook.
 * 
 * @version 0.1
 * 
 * @author Matti Nelimarkka
 **/
public class Status {
	
	/**
	 * The ID of this status update 
	 * 
	 **/
	private long id;
	
	/**
	 * Originating user of this status. 
	 **/
	private Person person;
	
	/**
	 * The actual text of this status update.
	 **/
	private String text;
	
	private ArrayList<Person> likedBy;
	
	private ArrayList<Comment> comments;
	
	public Collection<Person> getLikes() {
		return this.likedBy;
	}
	
	public Collection<Comment> getComments() {
		return this.comments;
	}

}
