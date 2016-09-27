package com.revature.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ACTION_TRACKER")
public class Tracker {

	/*
	 *  Attributes
	 */
	
	@Id
	@Column(name="ACTION_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="idSequence")
	@SequenceGenerator(name="idSequence",sequenceName="ID_SEQUENCE",initialValue=1,allocationSize=1)
	private long id;
	
	@Column(name="ACTION_USER")
	private String email;
	
	@Column(name="ACTION_TIME")
	private Date time;
	
	@Column(name="ACTION_DESCRIPTION")
	private String description;
	
	/*
	 *  Accessors
	 */
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/*
	 *  Constructors
	 */
	
	public Tracker(){
		super();
		this.time = new Date();
	}
	
	public Tracker(String email, Date time, String description) {
		this();
		this.email = email;
		this.description = description;
	}
}
