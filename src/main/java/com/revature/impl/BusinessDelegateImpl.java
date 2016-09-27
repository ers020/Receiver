package com.revature.impl;

import java.util.Date;
import java.util.List;

import com.revature.beans.Tracker;
import com.revature.data.BusinessDelegate;
import com.revature.data.DataService;

public class BusinessDelegateImpl implements BusinessDelegate {
	
	/*
	 *  Attributes && Accessors
	 */
	
	private DataService dataService;
	
	public void setDataService(DataService dataService) {
		this.dataService = dataService;
	}

	/*
	 *  Database Altering
	 */
	
	public void insertRecord(Object obj) {
		dataService.insertRecord(obj);
	}
	public void insertRecord(Object[] obj) {
		dataService.insertRecord(obj);
	}
	public void deleteRecord(Object obj) {
		dataService.deleteRecord(obj);
	}
	public void deleteRecord(Object[] obj) {
		dataService.deleteRecord(obj);
	}
	
	/*
	 *  Database Retreival
	 */
	
	public Tracker getRecord(long id) {
		return dataService.getRecord(id);
	}
	public List<Tracker> getRecord(String email) {
		return dataService.getRecord(email);
	}
	public List<Tracker> getRecord(Date date) {
		return dataService.getRecord(date);
	}
	public List<Tracker> getRecord() {
		return dataService.getRecord();
	}
}
