package com.pro.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pro.QrCodeModel.Student;
import com.pro.Repository.StudentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentService {
	@Autowired
	public  StudentRepository studentRepository;
	
    
	public List<Student> getStudents()
	{
		return studentRepository.findAll();
	}
	public Student addStudent(Student student)
	{
		return studentRepository.save(student);
	}
	public Student findById(Long id)
	{
		return studentRepository.findById(id).orElseThrow(()  -> new RuntimeException(" Student Not Found"));
	}
	

}
