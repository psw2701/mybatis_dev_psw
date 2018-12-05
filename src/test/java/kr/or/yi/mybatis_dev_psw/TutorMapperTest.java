package kr.or.yi.mybatis_dev_psw;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;


import kr.or.yi.mybatis_dev_psw.dao.TutorMapper;
import kr.or.yi.mybatis_dev_psw.dao.TutorMapperImpl;
import kr.or.yi.mybatis_dev_psw.dto.Tutor;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TutorMapperTest extends AbstractTest {
	private static TutorMapper dao = new TutorMapperImpl();

	@Test
	public void test01selectTutorByNo() {
		Tutor selTutor1 = dao.selectTutorById(1);
		
		Tutor tutor = new Tutor();
		tutor.setTutorId(1);
		Tutor selTutor2 = dao.selectTutorByTutorId(tutor);
		
		Assert.assertEquals(selTutor1.getTutorId(), selTutor2.getTutorId());
	}

}
