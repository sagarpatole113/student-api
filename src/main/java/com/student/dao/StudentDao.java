package com.student.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.entity.Students;

public interface StudentDao extends JpaRepository<Students, Long> {
}
