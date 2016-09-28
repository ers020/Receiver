package com.revature.invoice;

import java.util.Arrays;
import java.util.List;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import com.revature.beans.Tracker;
import com.revature.data.BusinessDelegate;

/**
 * Receiver for information. This is NOT set in stone, this is 
 * merely here to point out what it should look like... maybe.
 * We can fiddle with this more as we move on.
 * @author Eric
 *
 */

public class InvoiceMDB implements MessageListener{

	private BusinessDelegate businessDelegate;
	
	public BusinessDelegate getBusinessDelegate() {
		return businessDelegate;
	}

	public void setBusinessDelegate(BusinessDelegate businessDelegate) {
		this.businessDelegate = businessDelegate;
	}

	@Override
	public void onMessage(Message message) {
		
		try{
			String str = ((TextMessage)message).getText();
			System.out.println(str);
			System.out.println("Message Received from the JMSProducer file.");
			
			//put into list
			List<String> info = Arrays.asList(str.split(", "));
			
			//bean it up
			Tracker tracker = new Tracker(info.get(1), info.get(0));

			//pass down to Business Delegate
			businessDelegate.insertRecord(tracker);
			
			
		}catch (JMSException e){
			e.printStackTrace();
		}
		
	}

	
}
