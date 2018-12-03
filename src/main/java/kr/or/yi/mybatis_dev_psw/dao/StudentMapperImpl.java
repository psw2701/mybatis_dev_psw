package kr.or.yi.mybatis_dev_psw.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import kr.or.yi.mybatis_dev_psw.dto.Student;
import kr.or.yi.mybatis_dev_psw.jdbc.MyBatisSqlSessionFactory;

public class StudentMapperImpl implements StudentMapper {
	private static final String namespace = "kr.or.yi.mybatis_dev_psw.dao.StudentMapper";

	@Override
	public Student selectStudentbyNo(Student student) {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			return sqlSession.selectOne(namespace + ".selectStudentbyNo", student);
		}
	}

	@Override
	public List<Student> selectStudentByAll() {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			return sqlSession.selectList(namespace + ".selectStudentByAll");
		}
	}

	@Override
	public int insertStudent(Student student) {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			int res = sqlSession.insert(namespace + ".insertStudent", student);
			sqlSession.commit();
			return res;
		}
	}

	@Override
	public int deleteStudent(int id) {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			int res = sqlSession.delete(namespace + ".deleteStudent", id);
			sqlSession.commit();
			return res;
		}
	}

	@Override
	public int updateStudent(Student student) {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			int res = sqlSession.update(namespace + ".updateStudent", student);
			sqlSession.commit();
			return res;
		}

	}

	@Override
	public List<Student> selectStudentByAllForResultMap() {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			return sqlSession.selectList(namespace + ".selectStudentByAllForResultMap");

		}
	}

	@Override
	public List<Map<String, Object>> selectStudentByAllForHashMap() {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			return sqlSession.selectList(namespace + ".selectStudentByAllForHashMap");

		}
	}

	@Override
	public Student selectStudentByNoForResultMapExtends(Student student) {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			return sqlSession.selectOne(namespace + ".selectStudentByNoForResultMapExtends", student);

		}

	}

	@Override
	public Student selectStudentByNoForResultMapExtends2(int stuId) {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			return sqlSession.selectOne(namespace + ".selectStudentByNoForResultMapExtends2", stuId);
		}

	}

	@Override
	public Student selectStudentByNoAssociation(Student student) {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			return sqlSession.selectOne(namespace + ".selectStudentByNoAssociation", student);
		}
	}



	
	
}
