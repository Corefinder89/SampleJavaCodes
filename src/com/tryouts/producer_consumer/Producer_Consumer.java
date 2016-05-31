package com.tryouts.producer_consumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Producer_Consumer 
{
	public static void main(String [] args)
	{
		BlockingQueue<Message> queue = new ArrayBlockingQueue<Message>(2);
		Producer prod = new Producer(queue);
		Consumer con = new Consumer(queue);
		new Thread(prod).start();
		new Thread(con).start();
		System.out.println("Producer / Consumer processes have been started");
	}
}
