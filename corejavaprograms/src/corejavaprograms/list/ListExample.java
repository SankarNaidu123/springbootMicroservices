package corejavaprograms.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		
		List<String> names=List.of("Apple","Ball","Cat","Bat","Elephant","Fish");
		System.out.println(names);
		List<String> namesAl=new ArrayList<>();
		namesAl.addAll(names);//add new list
		
		  namesAl.add(4,"Dog");//add specified position namesAl.remove(2);
		  //remove an element 
		  namesAl.set(3, "Cat");//set a value 
		  System.out.println(namesAl);
		
		
		//retrieve elements
		for(int i=0;i<namesAl.size();i++) {
			System.out.println(namesAl.get(i));
		}
		
		System.out.println();
		
		Iterator<String> iterator=namesAl.iterator();
		while(iterator.hasNext()) {
			if(iterator.next().endsWith("at")) {
				iterator.remove();
			}
		}
		System.out.println(namesAl);
	}
}
