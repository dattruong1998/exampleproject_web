/**
 * System name  EEC
 * @version     1.0
 * @since       17/03/2020
 * @author      Team02
 */
package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.respository.StudentRespository;
// TODO: Auto-generated Javadoc

/**
 * The Class StudentService.
 */
@Service
public class StudentService {
	
	/** The student respository. */
	@Autowired
	private StudentRespository studentRespository;
	
	/**
	 * Gets the all student.
	 *
	 * @return the all student
	 */
	public List<Student> getAllStudent() {
		List<Student>listStudent=studentRespository.findAll();
		return listStudent;
	}
  
}
