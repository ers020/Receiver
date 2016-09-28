package com.revature.data;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.revature.beans.Tracker;

@Service
public interface BusinessDelegate {

	/*
	 * Database Altering
	 */
	
	/**
	 * Insert an action into the Tracker database.
	 * 
	 * @param obj : The Object to insert.
	 */
	void insertRecord(Object obj);
	
	/**
	 * Insert multiple actions into the Tracker database in a batch process.
	 * 
	 * @param obj : The Object array to insert.
	 */
	void insertRecord(Object[] obj);
	
	/**
	 * Remove an action into the Tracker database.
	 * 
	 * @param obj : The Object to insert.
	 */
	void deleteRecord(Object obj);
	
	/**
	 * Remove multiple actions into the Tracker database in a batch process.
	 * 
	 * @param obj : The Object array to insert.
	 */
	void deleteRecord(Object[] obj);
	
	/*
	 *  Database Retreival
	 */
	
	/**
	 * Retrieve 1 Tracker record by its unique id.
	 * 
	 * @param id : The unqiue id to pull the record for.
	 * @return Tracker Object
	 */
	Tracker getRecord(long id);
	
	/**
	 * Retrieve all Tracker records belonging to a certain email.
	 * 
	 * @param email : The email to pull the records for.
	 * @return List<Tracker>
	 */
	List<Tracker> getRecord(String email);
	
	/**
	 * Retrieve all Tracker records occuring on a specific date.
	 * 
	 * @param email : The date to pull records for.
	 * @return List<Tracker>
	 */
	List<Tracker> getRecord(Date date);
	
	/**
	 * Retrieve all Tracker records.
	 * 
	 * @return List<Tracker>
	 */
	List<Tracker> getRecord();
}
