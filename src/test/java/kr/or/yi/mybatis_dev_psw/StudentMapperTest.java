package kr.or.yi.mybatis_dev_psw;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.yi.mybatis_dev_psw.dao.StudentMapper;
import kr.or.yi.mybatis_dev_psw.dao.StudentMapperImpl;
import kr.or.yi.mybatis_dev_psw.dto.PhoneNumber;
import kr.or.yi.mybatis_dev_psw.dto.Student;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StudentMapperTest extends AbstractTest {
	private StudentMapper dao = new StudentMapperImpl();

	@Test
	public void test01selectStudentbyNo() {
		log.debug("test01selectStudentbyNo");
		Student searchStd = new Student();
		searchStd.setStudId(1);

		Student searchedStd = dao.selectStudentbyNo(searchStd);
		Assert.assertNotNull(searchedStd);
	}

	@Test
	public void test02selectStudentByAll() {
		log.debug("test03selectStudentByAll");
		Student searchStd = new Student();
		searchStd.setStudId(1);
		List<Student> stdList = dao.selectStudentByAll();
		Assert.assertNotNull(stdList);
	}

	@Test
	public void test03insertStudent() {
		log.debug("test04insertStudent()");
		Calendar newDate = GregorianCalendar.getInstance();
		newDate.set(1990, 2, 28);
		Student student = new Student();
		student.setName("홍길동4");
		student.setEmail("lee4@test.co.kr");
		student.setDob(newDate.getTime());
		student.setPhone(new PhoneNumber("011-1234-1234"));
		int res = dao.insertStudent(student);
		Assert.assertEquals(1, res);
	}

	@Test
	public void test04updateStudent() {
		log.debug("test05updateStudent()");
		Student student = new Student();
		student.setStudId(1);
		student.setName("Timothy");
		student.setEmail("test@test.co.kr");
		student.setPhone(new PhoneNumber("987-654-3211"));
		student.setDob(new Date());

		int result = dao.updateStudent(student);
		Assert.assertSame(1, result);

		student.setEmail("Timothy@gmail.com");
		student.setPhone(new PhoneNumber("123-123-1234"));
		student.setDob(new GregorianCalendar(1988, 04, 25).getTime());
		result = dao.updateStudent(student);
		Assert.assertSame(1, result);
	}

	/*
	 * @Test public void test05deleteStudent() { log.debug("test06deleteStudent()");
	 * int res = dao.deleteStudent(6); Assert.assertEquals(1, res); }
	 */

	@Test
	public void test06selectStudentByAllForResultMap() {
		log.debug("test07selectStudentByAllForResultMap()");
		List<Student> lists = dao.selectStudentByAllForResultMap();
		Assert.assertNotNull(lists);
	}

	@Test
	public void test07selectStudentByAllForHashMap() {
		log.debug("test08selectStudentByAllForHashMap()");
		List<Map<String, Object>> list = dao.selectStudentByAllForHashMap();
		System.out.println("list.size() => " + list.size());
		
		/*for (int i = 0; i < list.size(); i++) {
			Map<String, Object> m = list.get(i);
			Iterator<String> it = m.keySet().iterator();
			while (it.hasNext()) {
				String key = it.next();
				System.out.println("key = " + key + "value = " + m.get(key));
			}
		}*/

		for (Map<String, Object> m : list) {
			for (Entry<String, Object> e : m.entrySet()) {
				log.debug(String.format("\tkey(%s)-value(%s)", e.getKey(), e.getValue()));
			}
			System.out.println();
		}
		Assert.assertNotNull(list);
	}
	
	
	@Test
	public void test08selectStudentByNoForResultMapExtends() {
		log.debug("test08selectStudentByNoForResultMapExtends");
		Student student = new Student();
		student.setStudId(1);
		Student extStd = dao.selectStudentByNoForResultMapExtends(student);
		Assert.assertNotNull(extStd);
	}
	
	@Test
	public void test09selectStudentByNoForResultMapExtends2() {
		log.debug("test09selectStudentByNoForResultMapExtends2");
		Student lists = dao.selectStudentByNoForResultMapExtends2(1);
		Assert.assertNotNull(lists);
	}
	
	@Test
	public void test10selectStudentByNoAssociation() {
		log.debug("test10selectStudentByNoAssociation");
		Student student = new Student();
		student.setStudId(1);
		
		Student lists = dao.selectStudentByNoAssociation(student);
		Assert.assertNotNull(lists);
	}
}
