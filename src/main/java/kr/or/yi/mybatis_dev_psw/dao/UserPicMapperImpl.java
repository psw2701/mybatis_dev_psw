package kr.or.yi.mybatis_dev_psw.dao;

import org.apache.ibatis.session.SqlSession;

import kr.or.yi.mybatis_dev_psw.dto.UserPic;
import kr.or.yi.mybatis_dev_psw.jdbc.MyBatisSqlSessionFactory;

public class UserPicMapperImpl implements UserPicMapper{
	private static final String namespace = "kr.or.yi.mybatis_dev_psw.dao.UserPicMapper";

	@Override
	public int insertUserPic(UserPic userPic) {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			int res = sqlSession.insert(namespace + ".insertUserPic", userPic);
			sqlSession.commit();
			return res;
		}
	}

	@Override
	public UserPic getUserPic(int id) {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			return sqlSession.selectOne(namespace + ".getUserPic", id);

		}
	}
}
