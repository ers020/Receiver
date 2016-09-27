package com.revature.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.revature.data.DAO;

public class DAOImpl implements DAO{

	private SessionFactory sessionFactory;
	private Session session;
	
	public DAOImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}
	
	
	
}
