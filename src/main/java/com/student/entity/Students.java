package com.student.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;

@Entity
@JsonIgnoreProperties (value = {"handler","hibernateLazyInitializer","FieldHandler"})
public class Students {
	@Id
	@GeneratedValue
	private long studentId;
	private int rollnumber;
	private String firstName;
	private String lastName;
	private int studentclass;
	private char division;
	private String classTeacher;
	private String address;
	private String contact;

	public Students(long studentId, int rollnumber, String firstName, String lastName, int studentclass, char division,
			String classTeacher, String address, String contact) {
		this.studentId = studentId;
		this.rollnumber = rollnumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentclass = studentclass;
		this.division = division;
		this.classTeacher = classTeacher;
		this.address = address;
		this.contact = contact;
	}

	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public int getRollnumber() {
		return rollnumber;
	}

	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getStudentclass() {
		return studentclass;
	}

	public void setStudentclass(int studentclass) {
		this.studentclass = studentclass;
	}

	public char getDivision() {
		return division;
	}

	public void setDivision(char division) {
		this.division = division;
	}

	public String getClassTeacher() {
		return classTeacher;
	}

	public void setClassTeacher(String classTeacher) {
		this.classTeacher = classTeacher;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Students [studentId=" + studentId + ", rollnumber=" + rollnumber + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", studentclass=" + studentclass + ", division=" + division
				+ ", classTeacher=" + classTeacher + ", address=" + address + ", contact=" + contact + "]";
	}
	
	
	

}
