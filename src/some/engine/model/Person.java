package some.engine.model;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Abstraction and main getter's and setters for one user in Facebook.
 * 
 * 
 * @version 0.1
 * 
 * @author Matti Nelimarkka
 * 
 * */
public class Person {
	
	/**
	 * How many statusupdates are pulled initially when requesting new status updates. 
	 **/
	private static int DEFAULT_STATUS_UPDATE_PULL = 10;
	
	/**
	 * The Facebook ID for this user.
	 * 
	 * @since 0.1
	 **/
	private long id;
	
	/**
	 * The first name of this user.
	 * 
	 * @since 0.1
	 **/
	private String firstName;
	
	/**
	 * The lastname of this user. 
	 * 
	 * @since 0.1
	 **/
	private String lastName;
	
	/***
	 * The address to user's avatar. 
	 * 
	 * @since 0.1
	 **/
	private String avatar;
	
	/**
	 * List of this user's friends.
	 * 
	 * @since 0.1
	 * */
	private ArrayList<Person> friends;
	
	/**
	 * Dummy constructor to initialize all values.
	 * 
	 * @since 0.1
	 * */
	private Person() {
		this.friends = new ArrayList<Person>();
	}
	
	/**
	 * Potential sexes of users.
	 * 
	 * @since 0.1
	 * */
	public enum SEX { MALE, FEMALE };
	
	/**
	 * Sex of this user.
	 * 
	 * @since 0.1
	 **/
	private SEX sex;
	
	/**
	 * Pull the given amount of status updates for this user.
	 * 
	 * @since 0.1
	 * 
	 * @param count the count of status updates to be pulled.
	 * 
	 * @return Collection of the Status-objects.
	 **/
	public Collection<Status> statusUpdates(int count) {
		ArrayList<Status> statusUpdates = new ArrayList<Status>();
		return statusUpdates;
	}
	
	/**
	 * Pull the default amount of status updates for this user.
	 * 
	 * @since 0.1
	 * 
	 * @return Collection of the Status-objects.
	 **/
	public Collection<Status> statusUpdates() {
		return statusUpdates(DEFAULT_STATUS_UPDATE_PULL);
	}
	
	/**
	 * Get the friends of this user.
	 * 
	 * @since 0.1
	 *
	 * @return Collection of the friends as Person-objects. 
	 * */
	public Collection<Person> friends() {
		return this.friends;
	}
	
	/**
	 * Examines if the given object is same as the user here.
	 * 
	 * @since 0.1
	 * 
	 * @return true if user's are the same, otherwise false
	 * */
	public boolean equals(Object o) {
		if( o instanceof Person ) {
			Person p = (Person)(o);
			return p.id == this.id;
		}
		return false;
	}

}
