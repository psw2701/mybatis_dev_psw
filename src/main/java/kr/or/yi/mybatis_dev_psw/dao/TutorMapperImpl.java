package kr.or.yi.mybatis_dev_psw.dao;

import org.apache.ibatis.session.SqlSession;

import kr.or.yi.mybatis_dev_psw.dto.Tutor;
import kr.or.yi.mybatis_dev_psw.jdbc.MyBatisSqlSessionFactory;

public class TutorMapperImpl implements TutorMapper {
	private String namespace = "kr.or.yi.mybatis_dev_psw.dao.TutorMapper";

	@Override
	public Tutor selectTutorById(int tutorId) {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession()) {
			return sqlSession.selectOne(namespace + ".selectTutorById", tutorId);
		}
	}

	@Override
	public Tutor selectTutorByTutorId(Tutor tutor) {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession()) {
			return sqlSession.selectOne(namespace + ".selectTutorByTutorId", tutor);
		}
	}

	@Override
	public Tutor selectTutorByIdForResultMap(int tutorid) {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession()) {
			return sqlSession.selectOne(namespace + ".selectTutorByIdForResultMap", tutorid);
		}
	}

}
