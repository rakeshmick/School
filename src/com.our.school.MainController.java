package com.our.school;

import java.util.ArrayList;
import java.util.List;


public class MainController {

	public static void main(String[] args) {
		System.out.println("Welcome to school");
		Teacher teacher = new Teacher();
		teacher.setFirst_name("tim");
		teacher.setFirst_name("Jacob");
		teacher.setSalary(20000);
		Student student1 =  new Student();
		student1.setFirst_name("james");
		student1.setTotalMarks(999);
		Student student2 =  new Student();
		Student student3 = new Student();
		List<Student> students = new  ArrayList<Student>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		
		SchoolClass schoolClass = new SchoolClass();
		schoolClass.setTeacher(teacher);
		schoolClass.setStudent(students);
		System.out.println(schoolClass.teacher.getFirst_name());
		
		
	}

}
