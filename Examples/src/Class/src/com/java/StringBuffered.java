package com.java;

public class StringBuffered {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 StringBuffer str=new StringBuffer("I like java");
	      System.out.println("capacity "+str.capacity());
	      System.out.println("Append "+str.append(" I love programing"));
	      System.out.println(str.capacity());
	      System.out.println("length "+str.length());
	      System.out.println(str.charAt(5));
	      System.out.println("delete "+str.delete(3,5));
	      System.out.println(str.deleteCharAt(5));
	      System.out.println("replace "+str.replace(2,5,"php"));
	      System.out.println("insert "+str.insert(2,"DBMS"));
	      System.out.println("Ensure Capacity "+str.capacity());
	     str.ensureCapacity(40);
	     System.out.println("Ensure Capacity "+str.capacity());
	     StringBuffer sb=new StringBuffer();  
	        System.out.println(sb.capacity());  
	        sb.append("DataFlair");  
	        System.out.println(sb.capacity());
	        sb.append("DataFlair is company that teaches programming!!!");  
	        System.out.println(sb.capacity()); 
	        sb.ensureCapacity(10);
	        System.out.println(sb.capacity());  
	        sb.ensureCapacity(50);
	        System.out.println(sb.capacity());

	     
	     
	}

}
