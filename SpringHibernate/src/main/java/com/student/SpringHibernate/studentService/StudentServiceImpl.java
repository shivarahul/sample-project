package com.student.SpringHibernate.studentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.student.SpringHibernate.Student.Student;
import com.student.SpringHibernate.studentDAO.StudentDAO;

@Component
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO studentDAO;
	
	public void saveStudent(Student student) {

		studentDAO.save(student);
		
	}

	public void deleteStudent(Student student) {

		studentDAO.delete(student);
		
	}

	public void updateStudent(Student student) {

		studentDAO.update(student);
	}

	public List<Student> getAllStudents() {

		List<Student> list=studentDAO.getAllStudents();
		return list;
	}

	public Student getStudent(int id) {

		Student student=studentDAO.getStudent(id);
		return student;
	}

}
