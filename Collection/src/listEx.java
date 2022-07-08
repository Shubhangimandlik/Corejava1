import java.util.*;
public class listEx {

	public static void main(String[] args) {
ArrayList<String> list=new ArrayList<String> (); 
list.add("mango");
list.add("banana");
list.add("watermelon");
list.add("papaya");
System.out.println(list);
ArrayList<String> list1=new ArrayList<String> ();
list1.add("cherry");
list1.add("grapes");
list1.add(1,"apple");
System.out.println(list1);
list.addAll(2,list1);
System.out.println(list);
Iterator itr=list.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
	}

}
