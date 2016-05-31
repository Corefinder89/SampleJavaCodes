package com.tryouts.producer_consumer;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable
{
	public BlockingQueue<Message> queue;
	
	public Producer(BlockingQueue<Message> q)
	{
		this.queue = q;
	}
	@Override
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			Message msg = new Message(""+i);
			try
			{
				Thread.sleep(i);
				queue.put(msg);
				System.out.println("Produced message: " +msg.getMessage());
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
