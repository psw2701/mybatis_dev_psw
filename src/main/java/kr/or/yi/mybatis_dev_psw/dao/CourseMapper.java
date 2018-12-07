package kr.or.yi.mybatis_dev_psw.dao;

import java.util.List;
import java.util.Map;

import kr.or.yi.mybatis_dev_psw.dto.Course;

public interface CourseMapper {
	List<Course> selectCoursesByCondition(Map<String, Object>map);
}
