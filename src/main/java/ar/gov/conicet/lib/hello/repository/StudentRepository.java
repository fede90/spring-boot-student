package ar.gov.conicet.lib.hello.repository;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Repository;

import ar.gov.conicet.lib.hello.entity.Student;

@Repository
public class StudentRepository {

	public Collection<Student> getAllStudents() {
		
		return this.createStudents();
	}
	
	private Collection<Student> createStudents(){
		Student student1 = new Student();
		student1.setId(1);
		Student student2 = new Student();
		student1.setId(2);
		Student student3 = new Student();
		student1.setId(3);
		
		Collection<Student> students = new ArrayList<Student>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		
		return students;
	}

}
