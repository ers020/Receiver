package com.revature.invoice;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * Receiver for information. This is NOT set in stone, this is 
 * merely here to point out what it should look like... maybe.
 * We can fiddle with this more as we move on.
 * @author Eric
 *
 */

public class InvoiceMDB implements MessageListener{

	@Override
	public void onMessage(Message message) {
		
		try{
			
			System.out.println(((TextMessage)message).getText());
			System.out.println("Hello.");
			
		}catch (JMSException e){
			e.printStackTrace();
		}
		
	}

	
}
