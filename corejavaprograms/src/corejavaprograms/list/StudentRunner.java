package corejavaprograms.list;

import java.util.ArrayList;
import java.util.List;

public class StudentRunner {

	public static void main(String[] args) {
     
		List<Student> students=List.of(new Student(1,"Sankar"),
				new Student(100,"Adam"),new Student(2,"Eve"));
		System.out.println(students);
		
		List<Student> studentAl=new ArrayList<>();
		studentAl.addAll(students);
		
		//Collections.sort(studentAl);
		
		studentAl.sort(new AsendingStudentComparator());
		
		System.out.println(studentAl);
	}

}
