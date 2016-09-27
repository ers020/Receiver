package com.revature.impl;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.revature.beans.Tracker;
import com.revature.data.DAO;

public class DAOImpl implements DAO{

	/*
	 *  Attributes && Accessors
	 */
	
	private SessionFactory sf;
	private Session session;
	
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	public void setSession(Session session) {
		this.session = session;
	}
	
	public Session getSession() {
		
		if(session == null){
			
			setSession(sf.openSession());
		}
		
		return session;
	}

	/*
	 *  Database Altering
	 */
	
	public void insertRecord(Object obj) {
		
		Session ses = sf.getCurrentSession();
		ses.save(obj);
	}
	public void insertRecord(Object[] obj) {
		
		Session ses = sf.getCurrentSession();
		
		for(Object o : obj){
			
			ses.save(o);
		}
	}
	public void deleteRecord(Object obj) {
		
		Session ses = sf.getCurrentSession();
		ses.delete(obj);
	}
	public void deleteRecord(Object[] obj) {
		
		Session ses = sf.getCurrentSession();
		
		for(Object o : obj){
			
			ses.delete(o);
		}
	}
	
	/*
	 *  Database Retreival
	 */
	
	public Tracker getRecord(long id) {
		
		Session ses = sf.getCurrentSession();
		Criteria crit = ses.createCriteria(Tracker.class).add(Restrictions.eq("id", id));
		
		return (Tracker) crit.uniqueResult();
	}
	@SuppressWarnings("unchecked")
	public List<Tracker> getRecord(String email) {
		
		Session ses = sf.getCurrentSession();
		Criteria crit = ses.createCriteria(Tracker.class).add(Restrictions.eq("email", email));
		
		return crit.list();
	}
	@SuppressWarnings("unchecked")
	public List<Tracker> getRecord(Date date) {
		
		Session ses = sf.getCurrentSession();
		Criteria crit = ses.createCriteria(Tracker.class).add(Restrictions.eq("time", date));
		
		return crit.list();
	}
	@SuppressWarnings("unchecked")
	public List<Tracker> getRecord() {
		
		Session ses = sf.getCurrentSession();
		Criteria crit = ses.createCriteria(Tracker.class);
		
		return crit.list();
	}
}
