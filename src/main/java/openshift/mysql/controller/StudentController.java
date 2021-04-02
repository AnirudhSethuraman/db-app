package openshift.mysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import openshift.mysql.model.Student;
import openshift.mysql.repository.StudentRepository;

@RestController
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@RequestMapping(value="/students")
	public List<Student> getStudents(){
		return (List<Student>) studentRepository.findAll();
	}
}
