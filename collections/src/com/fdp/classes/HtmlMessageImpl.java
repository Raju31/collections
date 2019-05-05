package com.fdp.classes;

public class HtmlMessageImpl implements IMessageProvide{

	@Override
	public String converMessage(String message) {
		
		return "HTML Converted Message "+message;
	}

}
