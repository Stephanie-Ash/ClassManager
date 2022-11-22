package com.qa.classmanager.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.classmanager.persistence.domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
