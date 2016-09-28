package com.revature.data;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.revature.beans.Tracker;

@Service
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
