package com.controller;

import com.entity.Student;
import com.service.StudentService;
import org.json.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping( "StudentOperation")
@RestController
public class StudentController {
    @Resource
    private StudentService studentService;
    @RequestMapping(value = "insert",method = RequestMethod.POST)
    public String insert(Student student){
        studentService.insert(student);
        return "success";
    }
    @RequestMapping(value = "select",
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            consumes = MediaType.ALL_VALUE)
    public List<Student> select(Integer id){
        System.out.println(id);
        return studentService.select(id);
    }
    @RequestMapping(value = "selectList",method = RequestMethod.POST)
    public String selectList(){
        return studentService.selectList().toString();
    }
    @RequestMapping(value = "delete",method = RequestMethod.POST)
    public String delete(Integer id){
        studentService.delete(id);
        return "success";
    }
    @RequestMapping(value = "update",method = RequestMethod.POST)
    public String update(Student student){
        studentService.update(student);
        return "success";
    }

}
