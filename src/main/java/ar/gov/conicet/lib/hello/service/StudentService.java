package ar.gov.conicet.lib.hello.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.gov.conicet.lib.hello.entity.Student;
import ar.gov.conicet.lib.hello.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository rStudent;
	
	public Collection<Student> getAllStudents() {
		return rStudent.getAllStudents();
		
	}

}
