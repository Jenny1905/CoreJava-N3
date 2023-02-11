package org.tnsif.stringdemo;
//program to demonstrate on StringBuffer
public class StringBufferDemo {

	public static void main(String[] args) {
		//length vs capcity
		StringBuffer sb=new StringBuffer("Shiwani");
		System.out.println(sb);
		//16 by default+length of the string(7)=23
		System.out.println(sb.capacity());//by default its 16
		System.out.println(sb.length());
		
		String str;
		int a=34;
		sb=new StringBuffer(40);
		str=sb.append(a).toString();
		System.out.println(str);
		System.out.println(sb);//34
		System.out.println(sb.reverse());//43

		

	}

}
