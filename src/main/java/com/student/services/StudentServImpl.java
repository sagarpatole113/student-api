package com.student.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dao.StudentDao;
import com.student.entity.Students;
import com.student.services.StudentService;
@Service
public class StudentServImpl implements StudentService{
	
    public StudentServImpl() {
		
	}

	@Autowired
	private StudentDao studentdao;
	
	@Override
	public List<Students> getStudents() {
		
		return studentdao.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public Students getStudent(long studentId) {

		return studentdao.getById(studentId);
	}

	@Override
	public Students addStudent(Students student) {
	     studentdao.save(student);
		return student;
	}

	@Override
	public Students updateStudent(Students student) {
		studentdao.save(student);
		return student;
	}

	@SuppressWarnings("deprecation")
	@Override
	public void deleteStudent(long parseInt) {
		Students entity=studentdao.getById(parseInt);
		studentdao.delete(entity);
	}



}
