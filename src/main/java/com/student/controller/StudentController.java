package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.Students;
import com.student.services.StudentService;

@CrossOrigin
@RestController
public class StudentController {

	@Autowired
	private StudentService studentservice;

	@GetMapping("/students")
	public List<Students> getStudents(){
		
		return this.studentservice.getStudents();
	}
	
	@GetMapping("/students/{studentId}")
	public Students getStudent(@PathVariable String studentId){
		return this.studentservice.getStudent(Long.parseLong(studentId));	
	}
	
	@PostMapping("/students")
	public Students addStudent(@RequestBody Students student) {
		return this.studentservice.addStudent(student);
	}
	
	@PutMapping("/students")
	public Students updateStudent(@RequestBody Students student) {
		return this.studentservice.updateStudent(student);
	}
	
	@DeleteMapping("/students/{studentId}")
	public ResponseEntity<HttpStatus> deleteStudent(@PathVariable String studentId)
	{
		try {
			this.studentservice.deleteStudent(Long.parseLong(studentId));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	
}
