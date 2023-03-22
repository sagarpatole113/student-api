package com.student.services;

import java.util.List;

import com.student.entity.Students;

public interface StudentService {

	List<Students> getStudents();
	
	Students getStudent(long studentId);
	
	Students addStudent(Students student);
	
	Students updateStudent(Students student);
	
	void deleteStudent(long parseInt);
	
}
