package edu.nugi.controller;

import edu.nugi.dto.Exam;
import edu.nugi.service.ExamService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/exam")
@RequiredArgsConstructor
public class ExamController {

    final ExamService service;

    @PostMapping("/create-exam")
    public void createExam(@RequestBody Exam exam) {
        service.createExam(exam);
    }
    @GetMapping("/get-exam-by-course-id/{id}")
    public Exam getExamByCourseId(@PathVariable Integer id) {
        return service.getExamByCourseId(id);
    }
    @PutMapping("/update-exam")
    public void updateExam(@RequestBody Exam exam) {
        service.updateExam(exam);
    }
    @DeleteMapping("/delete-exam-by-id/{id}")
    public void deleteExamById(@PathVariable Integer id) {
        service.deleteExamById(id);
    }
    @DeleteMapping("/delete-exam-by-course-id/{id}")
    public void deleteExamByCourseId(@PathVariable Integer id) {
        service.deleteExamByCourseId(id);
    }
    @GetMapping("/get-all")
    public void getAll() {
        service.getAll();
    }


}
