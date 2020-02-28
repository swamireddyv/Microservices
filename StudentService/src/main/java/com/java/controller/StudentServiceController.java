package com.java.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.java.domain.Student;

@RestController
public class StudentServiceController {
	
	
private static Map<String, List<Student>> schoolDB= new	HashMap<String, List<Student>>();

  static {

   List<Student> list= new ArrayList<Student>();
 
   Student std= new Student("Sajal","4thclass");
 
   list.add(std);
    
   std= new Student("Lokesh","5th class");
   list.add(std);
   
   schoolDB.put("abcschool",list);
      
    list= new ArrayList<Student>();
    std= new Student("Kajal","3rd class");
    list.add(std);  
   
    std= new Student("Sukesh","6th class");
    list.add(std);
    schoolDB.put("xyzSchool", list);
  }

  @RequestMapping(value = "/getStudentDetailsForSchool/{schoolname}", method = RequestMethod.GET)
  public List<Student> getStudents(@PathVariable String schoolname) {
      System.out.println("Getting Student details for " + schoolname);

      List<Student> studentList = schoolDB.get(schoolname);
      if (studentList == null) {
          studentList = new ArrayList<Student>();
          Student std = new Student("Not Found", "N/A");
          studentList.add(std);
      }
      return studentList;
  }
}


   













