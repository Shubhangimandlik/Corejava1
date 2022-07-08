package com.java;

public class Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 long startingTime=System.currentTimeMillis();
	     StringBuffer sb=new StringBuffer("Hello");
	     for(int i=0;i<100;i++)
	     {
	    	 sb.append("java");
	    	 
	     }
	     System.out.println("Time consumed by StringBuffer:"+(System.currentTimeMillis()-startingTime)+"milliseconds");
	    startingTime=System.currentTimeMillis();
	    StringBuilder sbuilder=new StringBuilder("Hello");
	    for(int i=0;i<100;i++)
	    {
	    	sbuilder.append("java");
	    }
	    System.out.println("Time consumed by StringBuilder:"+(System.currentTimeMillis()-startingTime)+"milliseconds");
	}

}
