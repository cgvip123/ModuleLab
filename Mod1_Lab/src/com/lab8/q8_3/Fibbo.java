package com.lab8.q8_3;

import java.util.concurrent.atomic.AtomicInteger;

public class Fibbo{

	public static void main(String[] args) {	
		AtomicInteger num = new AtomicInteger((int) ((Math.random()*10)+1));
		Runnable r1 = new Runnable()
		{
					@Override
					public void run() {
						// TODO Auto-generated method stub
							System.out.println("number:"+num);
					}
			
				};
		Runnable r2 = new Runnable()
				{

					@Override
					public void run() {
						// TODO Auto-generated method stub
						int fact = 1;
						for(int i=1;i<=num.get();i++)
						{
							fact= fact*i;
						}
						System.out.println("factorial of "+num+":"+fact);
					}
			
				};
				Thread t= new Thread(r1);
				t.start();
				Thread t1 = new Thread(r2);
				t1.start();
	}
}
