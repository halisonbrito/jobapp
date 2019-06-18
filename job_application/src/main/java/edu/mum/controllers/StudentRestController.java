package edu.mum.controllers;

import edu.mum.entities.Student;
import edu.mum.services.IStudentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentRestController {

    @Resource
    private IStudentService studentService;

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable Long id){
        return studentService.get(id);
    }

    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getAll();
    }

    @PutMapping
    public void updateStudent(@RequestBody Student student){
        studentService.update(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id){
        studentService.delete(id);
    }

    @PostMapping
    public void addStudent(@RequestBody Student student){
        studentService.add(student);
    }
}
