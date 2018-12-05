package kr.or.yi.mybatis_dev_psw.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.yi.mybatis_dev_psw.dto.Course;
import kr.or.yi.mybatis_dev_psw.jdbc.MyBatisSqlSessionFactory;

public class CourseMapperImpl implements CourseMapper{
	private static final String namespace = "kr.or.yi.mybatis_dev_psw.dao.CourseMapper";

	@Override
	public List<Course> selectCoursesByTutorId(int tutorId) {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession()) {
			return sqlSession.selectList(namespace + ".selectCoursesByTutorId", tutorId);
		}
	}
	
}
