package com.revature.impl;

import java.util.Date;
import java.util.List;

import com.revature.beans.Tracker;
import com.revature.data.DAO;
import com.revature.data.DataService;

public class DataServiceImpl implements DataService {
	
	/*
	 *  Attributes && Accessors
	 */
	
	private DAO dao;
	
	public void setDao(DAO dao) {
		this.dao = dao;
	}

	/*
	 *  Database Altering
	 */
	
	public void insertRecord(Object obj) {
		dao.insertRecord(obj);
	}
	public void insertRecord(Object[] obj) {
		dao.insertRecord(obj);
	}
	public void deleteRecord(Object obj) {
		dao.deleteRecord(obj);
	}
	public void deleteRecord(Object[] obj) {
		dao.deleteRecord(obj);
	}

	/*
	 *  Database Retreival
	 */
	
	public Tracker getRecord(long id) {
		return dao.getRecord(id);
	}
	public List<Tracker> getRecord(String email) {
		return dao.getRecord(email);
	}
	public List<Tracker> getRecord(Date date) {
		return dao.getRecord(date);
	}
	public List<Tracker> getRecord() {
		return dao.getRecord();
	}
}
