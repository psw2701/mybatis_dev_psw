package kr.or.yi.mybatis_dev_psw;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

import kr.or.yi.mybatis_dev_psw.dto.Student;
import kr.or.yi.mybatis_dev_psw.jdbc.MyBatisSqlSessionFactory;



public class MybatisSqlSessionFactoryTest {
	private static final Log log = LogFactory.getLog(MybatisSqlSessionFactoryTest.class);

	@Test
	public void testOpenSession() {
		log.debug("testOpenSession()");
		
		SqlSession session = MyBatisSqlSessionFactory.openSession();
		log.debug("session " + session);
		Assert.assertNotNull(session);
	}

	

}
