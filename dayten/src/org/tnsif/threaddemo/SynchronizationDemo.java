package org.tnsif.threaddemo;
//program to demonstrate on synchronized method

public class SynchronizationDemo {
	
	synchronized void print(int num) throws InterruptedException
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(num*i);
		}
	}

}
//Thread1 
class ThreadOne extends Thread
{
	SynchronizationDemo d;

	public ThreadOne(SynchronizationDemo d) {
		super();
		this.d = d;
	}
	public void run()
	{
		try {
			d.print(10);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}
//Thread2
class ThreadTwo extends Thread
{
	SynchronizationDemo d;
	
	public ThreadTwo(SynchronizationDemo d) {
		super();
		this.d = d;
	}
	public void run()
	{
		try {
			d.print(15);
		} catch (InterruptedException e) {
			System.out.println(e);

		}
	}
}