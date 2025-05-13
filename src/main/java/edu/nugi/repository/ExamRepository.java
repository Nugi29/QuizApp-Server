package edu.nugi.repository;

import edu.nugi.entity.ExamEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamRepository extends JpaRepository<ExamEntity, Integer> {

    ExamEntity findByCourseId(Integer id);

}
