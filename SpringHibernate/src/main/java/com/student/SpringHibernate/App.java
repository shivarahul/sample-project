package com.student.SpringHibernate;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.student.SpringHibernate.Student.Student;
import com.student.SpringHibernate.studentService.StudentService;
import com.student.SpringHibernate.studentService.StudentServiceImpl;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext app = new ClassPathXmlApplicationContext("configmetadata.xml");
		// StudentService st=(StudentServiceImpl) app.getBean("studentServiceImpl");

		StudentService st = (StudentServiceImpl) app.getBean("studentServiceImpl");

		Student s = new Student();
		s.setId(2466854);
		s.setName("rahul");
		s.setMailId("asdfg@gmail.com");
		s.setScore(96);

		// st.deleteStudent(s);
		// st.saveStudent(s);
		// st.updateStudent(s);
		// Student s = st.getStudent(24668);
		// System.out.println(s.toString());

		List<Student> list = st.getAllStudents();

		for (Student student : list) {
			System.out.println(student);
		}
	}
}
