package edu.nugi.service.Impl;

import edu.nugi.dto.Exam;
import edu.nugi.entity.ExamEntity;
import edu.nugi.repository.ExamRepository;
import edu.nugi.service.ExamService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ExamServiceImpl implements ExamService {

    final ExamRepository repository;
    final ModelMapper mapper;

    @Override
    public void createExam(Exam exam) {
        repository.save(mapper.map(exam, ExamEntity.class));
    }

    @Override
    public Exam getExamByCourseId(Integer id) {
        return mapper.map(repository.findByCourseId(id), Exam.class);
    }

    @Override
    public List<Exam> getAll() {
        return null;
    }

    @Override
    public void updateExam(Exam exam) {

    }

    @Override
    public void deleteExamById(Integer id) {

    }

    @Override
    public void deleteExamByCourseId(Integer id) {

    }
}
