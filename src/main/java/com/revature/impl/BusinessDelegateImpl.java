package com.revature.impl;

import com.revature.data.BusinessDelegate;
import com.revature.data.DataService;

public class BusinessDelegateImpl implements BusinessDelegate {

	private DataService dataService;

	public DataService getDataService() {
		return dataService;
	}

	public void setDataService(DataService dataService) {
		this.dataService = dataService;
	}
	
	
	
}
