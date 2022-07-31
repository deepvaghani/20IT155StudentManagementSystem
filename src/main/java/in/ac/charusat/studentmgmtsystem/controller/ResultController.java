package in.ac.charusat.studentmgmtsystem.controller;

import in.ac.charusat.studentmgmtsystem.model.StudentResult;
import in.ac.charusat.studentmgmtsystem.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ResultController {

    @Autowired
    ResultRepository resultRepository;

    @GetMapping("/student/result")
    public List<StudentResult> getAllStudentResult() {
        return resultRepository.findAll();
    }

    // Get the student information
    @GetMapping("/student/result/{id}")
    public StudentResult getStudentResult(@PathVariable Integer id) {
        return resultRepository.findById(id).get();
    }

    //Delete the student
    @DeleteMapping("/student/result/{id}")
    public List<StudentResult> deleteStudentResult(@PathVariable Integer id) {
        resultRepository.delete(resultRepository.findById(id).get());
        return resultRepository.findAll();
    }

    // Add new student
    @PostMapping("/student/result")
    public List<StudentResult> addStudentResult(@RequestBody StudentResult studentResult) {
        resultRepository.save(studentResult);
        return resultRepository.findAll();
    }

    // Update the student information
    @PutMapping("/student/result/{id}")
    public List<StudentResult> updateStudentResult(@RequestBody StudentResult studentResult, @PathVariable Integer id) {
        StudentResult studentResultObj = resultRepository.findById(id).get();
        studentResultObj.setCourseid(studentResult.getCourseid());
        studentResultObj.setResult(studentResult.getResult());
        resultRepository.save(studentResultObj);
        return resultRepository.findAll();
    }

}