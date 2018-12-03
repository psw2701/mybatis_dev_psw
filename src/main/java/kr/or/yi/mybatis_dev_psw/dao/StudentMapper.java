package kr.or.yi.mybatis_dev_psw.dao;

import java.util.List;
import java.util.Map;

import kr.or.yi.mybatis_dev_psw.dto.Student;

public interface StudentMapper {
	Student selectStudentbyNo(Student student);
	List<Student> selectStudentByAll();
	int insertStudent(Student student);
	int updateStudent(Student student);
	int deleteStudent(int id);
	
	//ResultMap
	List<Student>  selectStudentByAllForResultMap();
	
	//hashMap
	List<Map<String, Object>>  selectStudentByAllForHashMap();
	
	
	//resultMap Extends
	Student selectStudentByNoForResultMapExtends(Student student);
	Student selectStudentByNoForResultMapExtends2(int stuId);
	
	
	//내포된 결과 매핑(ResultMap)을 사용한 일대일 매핑
	Student selectStudentByNoAssociation(Student student);
	
}
