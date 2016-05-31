package com.tryouts.producer_consumer;

public class Message 
{
	String msg;
	public Message(String str)
	{
		this.msg = str;
	}
	
	public String getMessage()
	{
		return msg;
	}
}
