package com.tryouts.producer_consumer;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable 
{
public BlockingQueue<Message> queue;
	
	public Consumer(BlockingQueue<Message> q)
	{
		this.queue = q;
	}
	
	@Override
	public void run()
	{
		try
		{
			Message msg;
			while((msg = queue.take()).getMessage() != "exit")
			{
				Thread.sleep(10);
				System.out.println("Consumed message: " +msg.getMessage());
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
