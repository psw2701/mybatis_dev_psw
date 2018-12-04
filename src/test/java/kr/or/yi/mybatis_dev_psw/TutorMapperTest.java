package kr.or.yi.mybatis_dev_psw;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import kr.or.yi.mybatis_dev_psw.dao.TutorMapper;
import kr.or.yi.mybatis_dev_psw.dao.TutorMapperImpl;
import kr.or.yi.mybatis_dev_psw.dto.Course;
import kr.or.yi.mybatis_dev_psw.dto.Tutor;

public class TutorMapperTest extends AbstractTest {

	private static TutorMapper dao = new TutorMapperImpl();

	@Test
	public void test01selectTutorByCode() {
		Tutor tutor = dao.selectTutorById(1);

		Tutor findTutor = new Tutor();
		findTutor.setTutorId(1);
		Tutor tutor2 = dao.selectTutorByTutorId(findTutor);

		Assert.assertEquals(tutor.getTutorId(), tutor2.getTutorId());
		
		System.out.println(tutor.getName()+"가 개설한 과정");
		List<Course> list = tutor.getCourses();
		for(Course c : list) {
			System.out.println(c);
		}
	}

}
