package org.brainship.xeon;

public class MString
{
	private char[] arr;
	
	public MString(String st) {
		arr = st.toCharArray();
	}
	
	public char charAt(int i) {
		return arr[i];
	}
	
	public char[] toCharArray() {
		return this.arr;
	}
	
	public void append(String st) {
		this.arr = (this.toString() + st).toCharArray();
	}
	
	public String substring(int i, int j) {
		String st = this.toString();
		
	}
	
	public String toString() {
		return new String(arr);
	}
	
	public boolean equals(MString mstring) {
		return this.arr == mstring.toCharArray();
	}
	
	public boolean equals(String st) {
		return this.arr == st.toCharArray();
	}
}