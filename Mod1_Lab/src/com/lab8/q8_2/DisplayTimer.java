package com.lab8.q8_2;

import java.util.Date;

public class DisplayTimer implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=10;
		try {
			while(i!=0)
			{
				System.out.println("Timer:"+new Date());
				Thread.sleep(10000);
				i--;
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		DisplayTimer dt = new DisplayTimer();
		Thread t = new Thread(dt);
		t.start();
	}
	
}
