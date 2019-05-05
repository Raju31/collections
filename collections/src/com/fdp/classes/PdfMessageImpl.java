package com.fdp.classes;

public class PdfMessageImpl implements IMessageProvide{

	@Override
	public String converMessage(String message) {
		return "PDF convert Message "+message;
	}

}
