package com.revature.impl;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.revature.beans.Tracker;
import com.revature.data.DAO;

@Repository
public class DAOImpl implements DAO{

	/*
	 *  Attributes && Accessors
	 */
	
	private SessionFactory sf;
	private Session session;
	
	public void setSf(SessionFactory sf) {
		this.sf = sf;
		session = getSession();
	}
	
	public void setSession(Session session){
		
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
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void insertRecord(Object obj) {
		
		Session ses = sf.getCurrentSession();
		setSession(ses);
		session.save(obj);
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void insertRecord(Object[] obj) {
		
		Session ses = sf.getCurrentSession();
		setSession(ses);
		for(Object o : obj){
			
			session.save(o);
		}
	}
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void deleteRecord(Object obj) {
		
		Session ses = sf.getCurrentSession();
		setSession(ses);
		session.delete(obj);
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void deleteRecord(Object[] obj) {
		
		Session ses = sf.getCurrentSession();
		setSession(ses);
		for(Object o : obj){
			
			session.delete(o);
		}
	}
	
	/*
	 *  Database Retreival
	 */
	
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public Tracker getRecord(long id) {
		
		Session ses = sf.getCurrentSession();
		setSession(ses);
		Criteria crit = session.createCriteria(Tracker.class).add(Restrictions.eq("id", id));
		
		return (Tracker) crit.uniqueResult();
	}
	
	
	@SuppressWarnings("unchecked")
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public List<Tracker> getRecord(String email) {
		
		Session ses = sf.getCurrentSession();
		setSession(ses);
		Criteria crit = session.createCriteria(Tracker.class).add(Restrictions.eq("email", email));
		
		return crit.list();
	}
	
	@SuppressWarnings("unchecked")
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public List<Tracker> getRecord(Date date) {
		
		Session ses = sf.getCurrentSession();
		setSession(ses);
		Criteria crit = session.createCriteria(Tracker.class).add(Restrictions.eq("time", date));
		
		return crit.list();
	}
	
	@SuppressWarnings("unchecked")
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public List<Tracker> getRecord() {
		
		Session ses = sf.getCurrentSession();
		setSession(ses);
		Criteria crit = session.createCriteria(Tracker.class);
		
		return crit.list();
	}
}
