package com.test.jms;

import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class JMSListener  implements MessageListener{

	@Override
	public void onMessage(Message message) {
		
		System.out.println(" On Msg () ....;..");
		
		try{
			
			if( message instanceof TextMessage){
				TextMessage textMessage = (TextMessage) message;
				System.out.println(" Consume the Msg :::  " + textMessage.getText());
			}else if(message instanceof MapMessage){
				MapMessage mapMessage = (MapMessage) message;
				System.out.println(" Map Message :::: " + mapMessage);
			}else
				System.out.println("Unsupported MSg Formatted.");
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		
		
	}

}
