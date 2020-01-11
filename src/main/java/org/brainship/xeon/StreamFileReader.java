package org.brainship.xeon;

import java.util.Vector;
import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class StreamFileReader
{
	
	private String fname;
	
	private FileReader is;
	
	public StreamFileReader(String st) {
		fname = st;
		init();
	}
	
	public StreamFileReader(File f) {
		fname = f.getName();
		init();
	}
	
	public void setInputStream(FileReader isr) {
		is = isr;
	}
	
	public void init()
	{
		if(is == null)
		{
			try {
				is = new FileReader(new File(fname));
			} catch(IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}
	
	public String singleRead() {
		String st = "";
		try {
			BufferedReader br = new BufferedReader(is);
			st = br.readLine();
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
		return st;
	}
	
	public Vector<String> vectorRead() {
		Vector<String> v = new Vector<String>(1,1);
		try {
			BufferedReader br = new BufferedReader(is);
			String st = "";
			while(true) {
				st = br.readLine();
				if(st == null) break;
				v.addElement(st);
			}
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
		return v;
	}
 	
	public String[] arrayRead() {
		Vector<String> vec = vectorRead();
		String[] arr = new String[vec.size()];
		for(int i = 0; i < arr.length; i++)
			arr[i] = vec.elementAt(i);
		return arr;
	}
}