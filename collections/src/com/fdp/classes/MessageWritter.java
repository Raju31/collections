package com.fdp.classes;

public class MessageWritter {
	private IMessageProvide messageProvide;
	public void writeMessage() {
		String msg=null;
		messageProvide=MessageProduserFactory.createMessage("html");
		msg=messageProvide.converMessage(" startegy desing pattern is working.....!!!!!!!!");
		System.out.println(msg);
	}

}
