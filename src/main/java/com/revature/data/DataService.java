package com.revature.data;

import java.util.Date;
import java.util.List;

import com.revature.beans.Tracker;

public interface DataService {

	/*
	 * Database Altering
	 */

	void insertRecord(Object obj);
	void insertRecord(Object[] obj);
	void deleteRecord(Object obj);
	void deleteRecord(Object[] obj);
	
	/*
	 *  Database Retreival
	 */

	Tracker getRecord(long id);
	List<Tracker> getRecord(String email);
	List<Tracker> getRecord(Date date);
	List<Tracker> getRecord();
}
