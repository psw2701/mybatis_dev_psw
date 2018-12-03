package kr.or.yi.mybatis_dev_psw;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.yi.mybatis_dev_psw.dao.StudentMapper;
import kr.or.yi.mybatis_dev_psw.dao.StudentMapperImpl;
import kr.or.yi.mybatis_dev_psw.dto.PhoneNumber;
import kr.or.yi.mybatis_dev_psw.dto.Student;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StudentMapperTest extends AbstractTest{
	private static StudentMapper dao = new StudentMapperImpl();
	
	@Test
	public void test01selectStudentById() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		//log.debug("test01selectStudentById()");
		Student newStd = new Student();
		newStd.setStudId(2);
		
		Student searchStd = dao.selectStudentById(newStd);
		
		Assert.assertNotNull(searchStd);
	}
	
	@Test
	public void test02selectStudentByAll() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		//log.debug("test02selectStudentByAll()");
		List<Student> list = dao.selectStudentByAll();
		Assert.assertNotNull(list);
	}
	
	/*@Test
	public void test03inserStudent() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		//log.debug("test03inserStudent()");
		Calendar newDate = GregorianCalendar.getInstance();
		newDate.set(1990, 2, 28);
		
		Student student = new Student();
		student.setName("홍길동3");
		student.setEmail("lee@test.co.kr");
		student.setDob(newDate.getTime());
		student.setPhone(new PhoneNumber("010-1234-1234"));
		
		int res = dao.insertStudent(student);
		Assert.assertEquals(1, res);
	}*/
	
	/*@Test
	public void test04updateStudent() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		//log.debug("test04updateStudent()");
		Student student = new Student();
		student.setStudId(3);
		student.setName("홍길동30");
		student.setEmail("hong@test.co.kr");
		student.setPhone(new PhoneNumber("010-1111-2222"));
		
		Calendar newDate = GregorianCalendar.getInstance();
		newDate.set(2000, 4, 28);
		
		student .setDob(newDate.getTime());
		
		int res = dao.updateStudent(student);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void test05deleteStudent() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		//log.debug("test05deleteStudent()");
		int res = dao.deleteStudent(3);
		Assert.assertEquals(1, res);
	}
	*/
	@Test
	public void test06selectStudentByAllForResults() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		List<Student> lists = dao.selectStudentByAllForResultMap();
		Assert.assertNotNull(lists);
	}
	
	@Test
	public void test07selectStudentByAllForHashMap() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		List<Map<String,Object>> maps = dao.selectStudentByAllForHashMap();
		Assert.assertNotNull(maps);
	}
	
	@Test
	public void test08selectStudentByAllForMapper() {
	log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		List<Student> lists = dao.selectStudentByAllForMapper();
		Assert.assertNotNull(lists);
	}
	
	@Test
	public void test09selectStudentByAllForResultMapExt() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		List<Student> lists =dao.selectStudentByAllForResultMapExt();
		Assert.assertNotNull(lists);
		
	}
	
	@Test
	public void testselectStudentOneToOne() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Student student = dao.selectStudentOneToOne(1);
		Assert.assertNotNull(student);
	}
}
