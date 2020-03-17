package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@Controller
public class StudentController {
   @Autowired
   private StudentService studentService;
   @GetMapping("/")
   public String getStudentIndex(Model model)
   {
	   List<Student>listStudent=studentService.getAllStudent();
	   model.addAttribute("listStudent",listStudent);
	   return "index";   
   }
}
