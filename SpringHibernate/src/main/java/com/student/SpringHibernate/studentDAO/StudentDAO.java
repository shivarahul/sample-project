package com.student.SpringHibernate.studentDAO;

import java.util.List;

import com.student.SpringHibernate.Student.Student;

public interface StudentDAO {

	
	public void save(Student student);
	public void delete(Student student);
	public void update(Student student);
	public List<Student> getAllStudents();
	public Student getStudent(int id);
}
