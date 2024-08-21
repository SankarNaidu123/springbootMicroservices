package corejavaprograms.list;

import java.util.Comparator;

class AsendingStudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student student1, Student student2) {
		return Integer.compare(student2.getId(),student1.getId());
	}
}

public class Student implements Comparable<Student> {

	private int id;
	private String name;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return id + " " + name;
	}
	@Override
	public int compareTo(Student student1) {
		return Integer.compare(student1.id, this.id);
	}
	
	
}
