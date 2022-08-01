package in.ac.charusat.studentmgmtsystem.controller;


import in.ac.charusat.studentmgmtsystem.model.StudentCourse;
import in.ac.charusat.studentmgmtsystem.model.StudentResult;
import in.ac.charusat.studentmgmtsystem.repository.CourseRepository;
import in.ac.charusat.studentmgmtsystem.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping("/student/course")
    public List<StudentCourse> getAllStudentCourse() {
        return courseRepository.findAll();
    }

    // Get the student result information
    @GetMapping("/student/course/{id}")
    public StudentCourse getStudentCourse(@PathVariable Integer id) {
        return courseRepository.findById(id).get();
    }

    //Delete the student result
    @DeleteMapping("/student/course/{id}")
    public List<StudentCourse> deleteStudentCourse(@PathVariable Integer id) {
        courseRepository.delete(courseRepository.findById(id).get());
        return courseRepository.findAll();
    }

    // Add new student result
    @PostMapping("/student/course")
    public List<StudentCourse> addStudentCourse(@RequestBody StudentCourse studentCourse) {
        courseRepository.save(studentCourse);
        return courseRepository.findAll();
    }

    // Update the student result information
    @PutMapping("/student/course/{id}")
    public List<StudentCourse> updateStudentCourse(@RequestBody StudentCourse studentCourse, @PathVariable Integer id) {
        StudentCourse studentCourseObj = courseRepository.findById(id).get();
        studentCourseObj.setCourseid(studentCourse.getCourseid());
        studentCourseObj.setCoursename(studentCourse.getCoursename());
        courseRepository.save(studentCourseObj);
        return courseRepository.findAll();
    }
}
