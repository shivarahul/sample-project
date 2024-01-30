package com.student.SpringHibernate.studentService;

import java.util.List;

import com.student.SpringHibernate.Student.Student;

public interface StudentService {
	
	public void saveStudent(Student student);
	public void deleteStudent(Student student);
	public void updateStudent(Student student);
	public List<Student> getAllStudents();
	public Student getStudent(int id);
    
}
