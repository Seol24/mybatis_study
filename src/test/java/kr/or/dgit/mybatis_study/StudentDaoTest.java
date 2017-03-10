package kr.or.dgit.mybatis_study;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.mybatis_study.dto.PhoneNumber;
import kr.or.dgit.mybatis_study.dto.Student;
import kr.or.dgit.mybatis_study.service.StudentService;

public class StudentDaoTest {
	private static StudentService studentService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		studentService = StudentService.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		studentService = null;
	}

/*	@Test
	public void testinsertStudent(){
		Student std = new Student(5, "설동훈", "sdh@test.co.kr",new Date());
		int res  = studentService.insertStudent(std);
		Assert.assertEquals(1, res);
	}
	*/
	/*@Test
	public void testselectStudentByNO(){
		Student student =  studentService.selectStudentByNo(4);
		Assert.assertNotNull(student);
	}*/
	@Test
	public void testupdateStudent(){
		Student std = new Student(3, "설동훈", "sdh@test.co.kr", new Date(), new PhoneNumber("010-2618-4317"));
		int res = studentService.updateStudent(std);
		Assert.assertEquals(1, res);
	}
	/*@Test
	public void testdeleteStudent(){
		int res = studentService.deleteStudent(3);
		Assert.assertEquals(1, res);
	}*/
	@Test
	public void testinsertStudentWithPhone(){
		Student student = new Student(3,"이교민","igm@test.co.kr",new Date(), new PhoneNumber("010-1234-1234"));
		int res = studentService.insertStudentWithPhone(student);
		Assert.assertEquals(1, res);
	}
}
