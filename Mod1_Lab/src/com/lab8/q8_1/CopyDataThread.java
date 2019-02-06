package com.lab8.q8_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDataThread extends Thread {
	
	FileInputStream inp=null;
	FileOutputStream out=null;
	public CopyDataThread(FileInputStream inp, FileOutputStream out) {
		super();
		this.inp = inp;
		this.out = out;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=0,j=0;
		try {
				while((i=inp.read())!=-1)
				{
					out.write(i);
					j++;
					if(j%10==0)
					{
						System.out.println("10 characters are copied");
						Thread.sleep(5000);
					}
				}
				System.out.println("copying complete");
			}
			catch (IOException | InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}
