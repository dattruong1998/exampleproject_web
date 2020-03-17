package com.example.demo.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

// TODO: Auto-generated Javadoc
/**
 * The Class StudentRestController.
 */
@RestController
@RequestMapping("/restapi")
public class StudentRestController {
	
	/** The student service. */
	@Autowired
	private StudentService studentService;
   
   /**
    * Gets the all student rest api.
    *
    * @return the all student rest api
    */
   @GetMapping("/getAllStudent")
   public List<Student> getAllStudentRestApi()
   {
	   List<Student> listStudent=studentService.getAllStudent();
	   return listStudent;
   }
}
