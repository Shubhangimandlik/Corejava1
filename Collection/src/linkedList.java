import java.util.Iterator;
import java.util.LinkedList;

public class linkedList {
 public static void main(String args[])
 {
	LinkedList<String> al=new LinkedList<String>();  
	al.add("Ravi");  
	al.add("Vijay");  
	al.add("Ravi");  
	al.add("Ajay");  
	System.out.println(al);
	al.remove(3);
	System.out.println(al);
	LinkedList<String> al1=new LinkedList<String>();
	al1.add("Nisha");
	al1.add("priya");

	System.out.println(al1);
	al.addAll(al1);
	System.out.println(al);
	System.out.println("Empty="+al.isEmpty());
	al1.clear();
	System.out.println("Empty="+al1.isEmpty());
	Iterator itr=al.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
	
	}  
	}


