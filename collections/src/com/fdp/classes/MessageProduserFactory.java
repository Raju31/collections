package com.fdp.classes;

public class MessageProduserFactory {
	public static IMessageProvide createMessage(String type) {
		IMessageProvide iMessageProvide=null;
		if (type.equals("html")) {
			iMessageProvide= (IMessageProvide) new HtmlMessageImpl();
			
		}else if (type.equals("pdf")) {
			iMessageProvide=new PdfMessageImpl();
			
		}
		return iMessageProvide;
		
	}
}
