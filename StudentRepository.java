package com.pro.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pro.QrCodeModel.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {

}
