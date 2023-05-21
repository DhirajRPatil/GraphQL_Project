package com.student.request.request;

import java.util.List;

import com.student.entity.Subject;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateStudentRequest {

	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private String street;
	
	private String city;
	
	private List<Subject> subjects;
}
