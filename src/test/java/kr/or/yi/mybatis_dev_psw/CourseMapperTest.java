package kr.or.yi.mybatis_dev_psw;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


import kr.or.yi.mybatis_dev_psw.dao.CourseMapper;
import kr.or.yi.mybatis_dev_psw.dao.CourseMapperImpl;
import kr.or.yi.mybatis_dev_psw.dto.Course;

public class CourseMapperTest  extends AbstractTest{
	private CourseMapper dao = new CourseMapperImpl();
	
	@Test
	public void test01selectCoursesByCondition() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("tutorId", 1);
		List<Course> list = dao.selectCoursesByCondition(map);
		
		map.put("courseName", "%java%");
		list = dao.selectCoursesByCondition(map);
		
		GregorianCalendar cal = new GregorianCalendar(2013, 1, 1);
		map.put("startDate", cal.getTime());
		list=dao.selectCoursesByCondition(map);
		
		cal.add(Calendar.MONTH, 4);
		map.put("endDate", cal.getTime());
		list=dao.selectCoursesByCondition(map);
		
		Assert.assertNotNull(list);

	}

}
