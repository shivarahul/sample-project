package com.student.SpringHibernate.studentDAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.student.SpringHibernate.Student.Student;

@Component
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional(readOnly = false)
	public void save(Student student) {
		hibernateTemplate.save(student);
	}

	@Transactional
	public void delete(Student student) {
         hibernateTemplate.delete(student);
	}
	

	@Transactional(readOnly=false)
	public void update(Student student) {
		hibernateTemplate.update(student);
	}

	public List<Student> getAllStudents() {
		List<Student> list = hibernateTemplate.loadAll(Student.class);
		return list;
	}

	public Student getStudent(int id) {
      Student s=hibernateTemplate.get(Student.class,id);
		
		return s;
	}

}
